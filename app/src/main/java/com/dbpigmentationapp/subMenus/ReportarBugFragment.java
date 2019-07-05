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
import android.widget.TextView;
import android.widget.Toast;

import com.dbpigmentationapp.MainMenu;
import com.dbpigmentationapp.R;
import com.dbpigmentationapp.ServicesSupport.GlobalState;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReportarBugFragment extends Fragment {

    CardView botonReportar;

    public ReportarBugFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reportar_bug, container, false);
        botonReportar = view.findViewById(R.id.botonReportarBug);
        botonReportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getContext(), "Informe enviado con éxito", Toast.LENGTH_LONG);
                View toastView = toast.getView();
                toastView.getBackground().setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                TextView text = toastView.findViewById(android.R.id.message);
                text.setTextColor(Color.WHITE);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Intent intent = new Intent(view.getContext(), MainMenu.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
