package com.dbpigmentationapp.submenus;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.dbpigmentationapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TodosPigmentosFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_todos_pigmentos, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<String> pigmentos = new ArrayList<>();
        pigmentos.add("Pigmento 1");
        pigmentos.add("Pigmento 2");
        pigmentos.add("Pigmento 3");
        pigmentos.add("Pigmento 4");
        pigmentos.add("Pigmento 5");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.row, R.id.label, pigmentos);
        setListAdapter(adapter);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String object = (String) parent.getItemAtPosition(position);
                System.out.println("Elemento seleccionado: " + object);
//                Intent intent = new Intent(getContext(), DeviceInfo.class);
//                startActivity(intent);
            }
        });
    }
}
