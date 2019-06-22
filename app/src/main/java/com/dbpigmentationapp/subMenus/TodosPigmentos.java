package com.dbpigmentationapp.subMenus;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.events.RowAdapter;
import com.dbpigmentationapp.mockedData.DbHelper;
import com.dbpigmentationapp.mockedData.MockedData;
import com.dbpigmentationapp.mockedData.StatusContract;
import com.dbpigmentationapp.subMenus.finalViews.InformacionPigmento;


public class TodosPigmentos extends AppCompatActivity {

    ListView lista;
    DbHelper dbHelper;
    SQLiteDatabase db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos_pigmentos);

        // la base de datos deberia de crearse en etapas mas tempranas, cuando se inicia la aplicacion,
        // no se deberia de crear aqui por temas de eficiencia. La cosa es que cada vez que se inicia
        // la base de datos
        dbHelper = new DbHelper(this);

        db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        // aqui lo que tendriamos que hacer es abrir los diferentes ficheros donde tenemos los datos e introducrlos dentro de la base de datos
        values.clear();
        values.put(StatusContract.Column.ID, 1);
        values.put(StatusContract.Column.ID_COLOR, "1");
        values.put(StatusContract.Column.NOMBRE, "Negro Humo");
        values.put(StatusContract.Column.COLOR_PIGMENTO, "Negro");
        values.put(StatusContract.Column.POTENCIA, 100);
        values.put(StatusContract.Column.LAMBDA, 200);
        values.put(StatusContract.Column.FORMULA, "NaBro");
        values.put(StatusContract.Column.ELEMENTO_QUIMICO, "Pb");

        db.insertWithOnConflict(StatusContract.TABLA_PIGMENTOS, null, values, SQLiteDatabase.CONFLICT_IGNORE);
        db.close();


        lista = findViewById(R.id.list);
        // lo que se pasa como parametro, es un array con la informacion necesaria en formato de string
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
