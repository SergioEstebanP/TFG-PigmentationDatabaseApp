package com.dbpigmentationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dbpigmentationapp.subMenus.AñadirPigmento;
import com.dbpigmentationapp.subMenus.ConsultaAvanzada;
import com.dbpigmentationapp.subMenus.ConsultaSimple;
import com.dbpigmentationapp.subMenus.Graficas;
import com.dbpigmentationapp.subMenus.ReportarBug;
import com.dbpigmentationapp.subMenus.TodosPigmentos;

public class MainMenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);

        CardView pigmentos = view.findViewById(R.id.opcionPigmentos);
        CardView consultaSimple = view.findViewById(R.id.opcionConsultaSimple);
        CardView consultaAvanzada = view.findViewById(R.id.opcionConsultaAvanzada);
        CardView graficas = view.findViewById(R.id.opcionGraficas);
        CardView reportarBug = view.findViewById(R.id.opcionReportarBug);
        CardView añadirPigmento = view.findViewById(R.id.opcionAddPigmento);

        pigmentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });

        consultaSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ConsultaSimple.class);
                startActivity(intent);
            }
        });

        consultaAvanzada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ConsultaAvanzada.class);
                startActivity(intent);
            }
        });

        graficas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Graficas.class);
                startActivity(intent);
            }
        });

        reportarBug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ReportarBug.class);
                startActivity(intent);
            }
        });

        añadirPigmento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AñadirPigmento.class);
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
