package com.dbpigmentationapp.subMenus.finalViews;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.ServicesSupport.GlobalState;
import com.dbpigmentationapp.dataBase.DbHandler;
import com.dbpigmentationapp.dataModel.Colorimetria;
import com.dbpigmentationapp.dataModel.Sinonimo;

import java.util.List;

public class InformacionPigmentoFragment extends Fragment {

    private DbHandler db;

    private TextView nombre;
    private CardView color;
    private TextView sinonimo;
    private TextView formula;
    private TextView elemento;
    private TextView coordenadasTricromicas;
    private TextView colorBase;


    private ImageView colorimetria;
    private TextView descColorimetria;
    private Animation animationUp;
    private Animation animationDown;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        db = new DbHandler(this.getContext());
        List<Sinonimo> sinonimos = db.todosSinonimosPigmento("id", GlobalState.PIGMENTO_SELECCIONADO.getIdPigmento());
        String sinonimoValue;
        if (sinonimos.size() > 1) {
            sinonimoValue = sinonimos.get(1).getValor();
        } else {
            sinonimoValue = sinonimos.get(0).getValor();
        }

        View view = inflater.inflate(R.layout.fragment_informacion_pigmento, container, false);

        nombre = view.findViewById(R.id.nombrePigmento);
        color = view.findViewById(R.id.colorPigmento);
        sinonimo = view.findViewById(R.id.valueSinonimo);
        formula = view.findViewById(R.id.valueFormula);
        elemento = view.findViewById(R.id.valueElemento);
        coordenadasTricromicas = view.findViewById(R.id.valueCoordenadas);
        colorBase = view.findViewById(R.id.valueColorBase);

        nombre.setText(GlobalState.PIGMENTO_SELECCIONADO.getNombre());

        Colorimetria aux = GlobalState.COLOR_SELECCIONADO;
        color.setCardBackgroundColor(ColorUtils.LABToColor(aux.getL(), aux.getA(), aux.getB()));
        sinonimo.setText(sinonimoValue);
        formula.setText(GlobalState.PIGMENTO_SELECCIONADO.getFormula());
        elemento.setText(GlobalState.PIGMENTO_SELECCIONADO.getElementoQuimico());
        coordenadasTricromicas.setText(GlobalState.COLOR_SELECCIONADO.getL() + "-" + GlobalState.COLOR_SELECCIONADO.getA() + "-" + GlobalState.COLOR_SELECCIONADO.getB());
        colorBase.setText(GlobalState.PIGMENTO_SELECCIONADO.getIdColor());

        colorimetria = view.findViewById(R.id.imgColorimetria);
        descColorimetria = view.findViewById(R.id.colorimetriaDesKey);
        descColorimetria.setVisibility(View.GONE);

        animationUp = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_up);
        animationDown = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_down);

        colorimetria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(descColorimetria.isShown()){
                    descColorimetria.setVisibility(View.GONE);
                    descColorimetria.startAnimation(animationUp);
                }
                else{
                    descColorimetria.setVisibility(View.VISIBLE);
                    descColorimetria.startAnimation(animationDown);
                }
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
