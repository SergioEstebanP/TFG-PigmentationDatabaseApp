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

public class TabFragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_4, container, false);

        CardView view73 = view.findViewById(R.id.elemento73);
        CardView view74 = view.findViewById(R.id.elemento74);
        CardView view75 = view.findViewById(R.id.elemento75);
        CardView view76 = view.findViewById(R.id.elemento76);
        CardView view77 = view.findViewById(R.id.elemento77);
        CardView view78 = view.findViewById(R.id.elemento78);
        CardView view79 = view.findViewById(R.id.elemento79);
        CardView view80 = view.findViewById(R.id.elemento80);
        CardView view81 = view.findViewById(R.id.elemento81);
        CardView view82 = view.findViewById(R.id.elemento82);
        CardView view83 = view.findViewById(R.id.elemento83);
        CardView view84 = view.findViewById(R.id.elemento84);
        CardView view85 = view.findViewById(R.id.elemento85);
        CardView view86 = view.findViewById(R.id.elemento86);
        CardView view87 = view.findViewById(R.id.elemento87);
        CardView view88 = view.findViewById(R.id.elemento88);
        CardView view89 = view.findViewById(R.id.elemento89);
        CardView view90 = view.findViewById(R.id.elemento90);
        CardView view91 = view.findViewById(R.id.elemento91);
        CardView view92 = view.findViewById(R.id.elemento92);
        CardView view93 = view.findViewById(R.id.elemento93);
        CardView view94 = view.findViewById(R.id.elemento94);
        CardView view95 = view.findViewById(R.id.elemento95);
        CardView view96 = view.findViewById(R.id.elemento96);
        CardView view97 = view.findViewById(R.id.elemento97);
        CardView view98 = view.findViewById(R.id.elemento98);
        CardView view99 = view.findViewById(R.id.elemento99);
        CardView view100 = view.findViewById(R.id.elemento100);
        CardView view101 = view.findViewById(R.id.elemento101);
        CardView view102 = view.findViewById(R.id.elemento102);

        view73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "B";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "C";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "N";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "O";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "F";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Al";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Si";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "P";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "S";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Cl";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ga";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ge";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "As";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Se";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Br";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "In";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Sn";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Sb";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Te";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "I";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Tl";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Pb";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Bi";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Po";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "At";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Nh";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Fl";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Mc";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Lv";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });
        view102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA = "Ts";
                GlobalState.FILTRAR_POR_ELEMENTO = true;
                Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
