package com.dbpigmentationapp.subMenus;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.dbpigmentationapp.R;

//TODO elimiar esta clase, en principio ha sido sustituida por la fancy
public class ConsultaSimpleFragment extends Fragment {

    private CardView parametrosColor;
    private CardView parametrosNombre;
    private CardView parametrosElemento;
    private CardView buscar;

    private Animation animationUp;
    private Animation animationDown;

    private ImageView imgPorColor;
    private ImageView imgPorNombre;
    private ImageView imgPorElemento;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_consulta_simple, container, false);

        animationUp = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_up);
        animationDown = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_down);

        // recuperamos los elementos para los colores
        parametrosColor = view.findViewById(R.id.parametrosColor);
        parametrosColor.setVisibility(View.GONE);
        imgPorColor = view.findViewById(R.id.imgPorColor);
        imgPorColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (parametrosColor.isShown()) {
                    parametrosColor.setVisibility(View.GONE);
                    parametrosColor.startAnimation(animationUp);
                } else {
                    parametrosColor.setVisibility(View.VISIBLE);
                    parametrosColor.startAnimation(animationDown);
                }
            }
        });

        // recuperamos los elementos para los nombre
        parametrosNombre = view.findViewById(R.id.parametrosNombre);
        parametrosNombre.setVisibility(View.GONE);
        imgPorNombre = view.findViewById(R.id.imgPorNombre);
        imgPorNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (parametrosNombre.isShown()) {
                    parametrosNombre.setVisibility(View.GONE);
                    parametrosNombre.startAnimation(animationUp);
                } else {
                    parametrosNombre.setVisibility(View.VISIBLE);
                    parametrosNombre.startAnimation(animationDown);
                }
            }
        });

        // recuperamos los elementos para los elementos
        parametrosElemento = view.findViewById(R.id.parametrosElementoQuimico);
        parametrosColor.setVisibility(View.GONE);
        imgPorElemento = view.findViewById(R.id.imgPorElementoQuimico);
        imgPorElemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (parametrosElemento.isShown()) {
                    parametrosElemento.setVisibility(View.GONE);
                    parametrosElemento.startAnimation(animationUp);
                } else {
                    parametrosElemento.setVisibility(View.VISIBLE);
                    parametrosElemento.startAnimation(animationDown);
                }
            }
        });

        // recuperamos los elementos para el boton de buscar
        buscar = view.findViewById(R.id.busquedaSimple);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // realizamos la consulta en la base de datos, seteamos el modelo del mismo, y luego
                // cargamos la misma vista de los datos que teniamos en las vistas anteriores
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
