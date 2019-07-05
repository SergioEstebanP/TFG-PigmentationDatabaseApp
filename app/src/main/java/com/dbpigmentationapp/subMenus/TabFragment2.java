package com.dbpigmentationapp.subMenus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.ServicesSupport.GlobalState;

public class TabFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_2, container, false);

        CardView view33 = view.findViewById(R.id.elemento33);
        CardView view34 = view.findViewById(R.id.elemento34);
        CardView view35 = view.findViewById(R.id.elemento35);
        CardView view36 = view.findViewById(R.id.elemento36);
        CardView view37 = view.findViewById(R.id.elemento37);
        CardView view38 = view.findViewById(R.id.elemento38);
        CardView view39 = view.findViewById(R.id.elemento39);
        CardView view40 = view.findViewById(R.id.elemento40);
        CardView view41 = view.findViewById(R.id.elemento41);
        CardView view42 = view.findViewById(R.id.elemento42);
        CardView view43 = view.findViewById(R.id.elemento43);
        CardView view44 = view.findViewById(R.id.elemento44);
        CardView view45 = view.findViewById(R.id.elemento45);
        CardView view46 = view.findViewById(R.id.elemento46);
        CardView view47 = view.findViewById(R.id.elemento47);
        CardView view48 = view.findViewById(R.id.elemento48);

        view33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "V";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Cr";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Mn";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Fe";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Nb";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Mo";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Tc";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ru";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ta";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "W";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Re";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Os";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Db";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Sg";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Bh";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Hs";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
