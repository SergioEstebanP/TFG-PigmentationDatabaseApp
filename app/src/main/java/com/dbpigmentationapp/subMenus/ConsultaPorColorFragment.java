package com.dbpigmentationapp.subMenus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.ServicesSupport.GlobalState;

import top.defaults.colorpicker.ColorObserver;
import top.defaults.colorpicker.ColorPickerView;

public class ConsultaPorColorFragment extends Fragment {

    ColorPickerView colorPickerView;
    TextView colorSeleccionado;
    CardView botonBuscar;

    public ConsultaPorColorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_consulta_por_color, container, false);

        colorSeleccionado = view.findViewById(R.id.cuadradoColorSeleccionado);
        botonBuscar = view.findViewById(R.id.busquedaSimpleColor);

        // implementamos la logica para el color picker
        colorPickerView = view.findViewById(R.id.colorPicker);
        colorPickerView.subscribe(new ColorObserver() {
            @Override
            public void onColor(int color, boolean fromUser, boolean shouldPropagate) {
                colorSeleccionado.setBackgroundColor(color);
                GlobalState.COLOR_SELECCIONADO_BUSQUEDA = color;
                GlobalState.FILTRAR_POR_COLOR = true;
            }
        });

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
