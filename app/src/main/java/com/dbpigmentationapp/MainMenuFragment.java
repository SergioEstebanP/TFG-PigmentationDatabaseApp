package com.dbpigmentationapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.dbpigmentationapp.subMenus.ConsultaColor;
import com.dbpigmentationapp.subMenus.ConsultaElemento;
import com.dbpigmentationapp.subMenus.ConsultaNombre;
import com.dbpigmentationapp.subMenus.ReportarBug;
import com.dbpigmentationapp.subMenus.TodosPigmentos;

public class MainMenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);

        CardView pigmentos = view.findViewById(R.id.opcionPigmentos);
        CardView consultaElemento = view.findViewById(R.id.opcionConsultaPorElemento);
        CardView consultaColor = view.findViewById(R.id.opcionConsultaPorColor);
        CardView consultaNombre = view.findViewById(R.id.opcionCosultaPorNombre);
        CardView reportarBug = view.findViewById(R.id.opcionReportarBug);

        pigmentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getContext(), "Cargando datos", Toast.LENGTH_SHORT);
                View toastView = toast.getView();
                toastView.getBackground().setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                TextView text = toastView.findViewById(android.R.id.message);
                text.setTextColor(Color.WHITE);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

                Intent intent = new Intent(getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });

        consultaElemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ConsultaElemento.class);
                startActivity(intent);
            }
        });

        consultaNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ConsultaNombre.class);
                startActivity(intent);
            }
        });

        consultaColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ConsultaColor.class);
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

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
