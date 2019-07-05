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

public class TabFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_1, container, false);

        CardView view1 = view.findViewById(R.id.elemento1);
        CardView view2 = view.findViewById(R.id.elemento2);
        CardView view3 = view.findViewById(R.id.elemento3);
        CardView view4 = view.findViewById(R.id.elemento4);
        CardView view5 = view.findViewById(R.id.elemento5);
        CardView view6 = view.findViewById(R.id.elemento6);
        CardView view7 = view.findViewById(R.id.elemento7);
        CardView view8 = view.findViewById(R.id.elemento8);
        CardView view9 = view.findViewById(R.id.elemento9);
        CardView view10 = view.findViewById(R.id.elemento10);
        CardView view11 = view.findViewById(R.id.elemento11);
        CardView view12 = view.findViewById(R.id.elemento12);
        CardView view13 = view.findViewById(R.id.elemento13);
        CardView view14 = view.findViewById(R.id.elemento14);
        CardView view15 = view.findViewById(R.id.elemento15);
        CardView view16 = view.findViewById(R.id.elemento16);
        CardView view17 = view.findViewById(R.id.elemento17);
        CardView view18 = view.findViewById(R.id.elemento18);
        CardView view19 = view.findViewById(R.id.elemento19);
        CardView view20 = view.findViewById(R.id.elemento20);
        CardView view21 = view.findViewById(R.id.elemento21);
        CardView view22 = view.findViewById(R.id.elemento22);
        CardView view23 = view.findViewById(R.id.elemento23);
        CardView view24 = view.findViewById(R.id.elemento24);

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Li";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Be";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "-";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "-";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Na";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Mg";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "-";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "-";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "K";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ca";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Sc";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ti";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Rb";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Sr";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Y";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Zr";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Cs";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ba";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Lu";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Hf";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Fr";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ra";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Lr";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Rf";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
