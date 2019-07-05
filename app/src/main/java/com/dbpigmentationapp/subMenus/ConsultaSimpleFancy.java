package com.dbpigmentationapp.subMenus;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dbpigmentationapp.R;

public class ConsultaSimpleFancy extends Fragment {

    CardView color;
    CardView elemento;
    CardView nombre;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_consulta_simple_fancy, container, false);

        // recuperamos los datos para luego poder pulsar en los botones correspondientes
        color = view.findViewById(R.id.consultaColor);
        elemento = view.findViewById(R.id.consultaElemento);
        nombre = view.findViewById(R.id.consultaNombre);

        // seteamos la accion para el boton de buscar por color
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ConsultaColor.class);
                startActivity(intent);
            }
        });

        // seteamos la accion para el boton de buscar por nombre
        nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ConsultaNombre.class);
                startActivity(intent);
            }
        });

        // seteamos la accion para el boton de buscar por elemento quimico
        elemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ConsultaElemento.class);
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