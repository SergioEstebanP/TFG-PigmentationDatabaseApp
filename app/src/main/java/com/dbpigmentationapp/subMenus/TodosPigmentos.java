package com.dbpigmentationapp.subMenus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.dataModel.CartaPigmentos;
import com.dbpigmentationapp.events.RowAdapter;
import com.dbpigmentationapp.dataModel.Pigmento;
import com.dbpigmentationapp.dataBase.DbHandler;
import com.dbpigmentationapp.subMenus.finalViews.InformacionPigmento;

import java.util.ArrayList;
import java.util.List;


public class TodosPigmentos extends AppCompatActivity {

    ListView lista;
    private DbHandler db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos_pigmentos);

        // primero tenemos que crear los datos y luego los tenemos que recuperar para comprobar que se ha
        // hecho de manera correcta
        db = new DbHandler(this);
        // creamos algunso pigmentos, esto lo tenemos que hacer mediante alguna forma automática o con algun script
        Pigmento p1 = new Pigmento();

        // los introducimos en la base de datos
        try {
            db.addPigmento(p1);
        } catch (Exception e) {
            // elemnts already exists in DB we dont do nothing
        }
        // obtenemos todos los pigmentos
        List<Pigmento> pigmentos = db.todosPigmentos();

        ArrayList<CartaPigmentos> datos = new ArrayList<>();
        datos.add(new CartaPigmentos(pigmentos.get(0).getNombre(),
                pigmentos.get(0).getFormula(),
                pigmentos.get(0).getColor(),
                pigmentos.get(0).getElementoQuimico()));

        lista = findViewById(R.id.list);
        RowAdapter adapter = new RowAdapter(getApplicationContext(), datos);
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
