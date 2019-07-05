package com.dbpigmentationapp.subMenus;


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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.ServicesSupport.GlobalState;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConsultaPorNombreFragment extends Fragment {


    public ConsultaPorNombreFragment() {
        // Required empty public constructor
    }

    CardView botonBuscar;
    EditText filtroNombre;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_consulta_por_nombre, container, false);

        botonBuscar = view.findViewById(R.id.busquedaSimpleNombre);
        filtroNombre = view.findViewById(R.id.consultaPorNombreEditText);

        GlobalState.FILTRAR_POR_NOMBRE = true;
        GlobalState.FILTRAR_POR_COLOR = false;
        GlobalState.FILTRAR_POR_ELEMENTO = false;


        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalState.NOMBRE_SELECCIONADO_BUSQUEDA = filtroNombre.getText().toString();

                if (GlobalState.NOMBRE_SELECCIONADO_BUSQUEDA.equals("")) {
                    Toast toast = Toast.makeText(getContext(), "Introduce un Nombre", Toast.LENGTH_SHORT);
                    View toastView = toast.getView();
                    toastView.getBackground().setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                    TextView text = toastView.findViewById(android.R.id.message);
                    text.setTextColor(Color.WHITE);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else {
                    Intent intent = new Intent(view.getContext(), TodosPigmentos.class);
                    startActivity(intent);
                }
            }
        });

        return view;
    }


}
