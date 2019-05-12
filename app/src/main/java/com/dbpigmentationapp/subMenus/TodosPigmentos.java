package com.dbpigmentationapp.subMenus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.events.RowAdapter;
import com.dbpigmentationapp.mockedData.MockedData;
import com.dbpigmentationapp.subMenus.finalViews.InformacionPigmento;


public class TodosPigmentos extends AppCompatActivity {

    ListView lista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos_pigmentos);

        lista = findViewById(R.id.list);
        RowAdapter adapter = new RowAdapter(getApplicationContext(), MockedData.LISTA_PIGMENTOS);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                CartaPigmentos carta = data.get(position);
//                Snackbar.make(view, carta.getNombre()+"\n", Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();

                // como sabemos cual es el pigmento que tenemos que buscar, obtenemos la información
                // y la almacenamos para más adelante presentarla en las siguientes pantallas, actualizaremos
                // el modelo de datos de la aplicaicón
                Intent intent = new Intent(view.getContext(), InformacionPigmento.class);
                startActivity(intent);
            }
        });
    }

}
