package com.dbpigmentationapp.subMenus;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dbpigmentationapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConsultaPorNombre extends Fragment {


    public ConsultaPorNombre() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_consulta_por_nombre, container, false);
    }

}
