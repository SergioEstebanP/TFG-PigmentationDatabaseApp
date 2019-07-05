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

public class TabFragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_3, container, false);

        CardView view57 = view.findViewById(R.id.elemento57);
        CardView view58 = view.findViewById(R.id.elemento58);
        CardView view59 = view.findViewById(R.id.elemento59);
        CardView view60 = view.findViewById(R.id.elemento60);
        CardView view61 = view.findViewById(R.id.elemento61);
        CardView view62 = view.findViewById(R.id.elemento62);
        CardView view63 = view.findViewById(R.id.elemento63);
        CardView view64 = view.findViewById(R.id.elemento64);
        CardView view65 = view.findViewById(R.id.elemento65);
        CardView view66 = view.findViewById(R.id.elemento66);
        CardView view67 = view.findViewById(R.id.elemento67);
        CardView view68 = view.findViewById(R.id.elemento68);
        CardView view69 = view.findViewById(R.id.elemento69);
        CardView view70 = view.findViewById(R.id.elemento70);
        CardView view71 = view.findViewById(R.id.elemento71);
        CardView view72 = view.findViewById(R.id.elemento72);

        view57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Co";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ni";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Cu";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Zn";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Rh";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Pd";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ag";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Cd";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ir";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Pt";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Au";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Hg";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Mt";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ds";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Rg";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Cn";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
