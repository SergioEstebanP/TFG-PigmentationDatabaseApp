package com.dbpigmentationapp.subMenus;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.ServicesSupport.GlobalState;
import com.dbpigmentationapp.dataBase.DataCreation;
import com.dbpigmentationapp.dataModel.CartaPigmentos;
import com.dbpigmentationapp.dataModel.Colorimetria;
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

        db = new DbHandler(this);

        DataCreation.createBulkData(db, this);
        final List<Pigmento> pigmentos = db.todosPigmentos();
        final ArrayList<CartaPigmentos> datos = new ArrayList<>();
        for (int i = 0; i < pigmentos.size(); i++) {
            datos.add(new CartaPigmentos(pigmentos.get(i).getNombre(),
                    pigmentos.get(i).getDescripcion(),
                    pigmentos.get(i).getIdColor(),
                    pigmentos.get(i).getElementoQuimico()));
        }
        lista = findViewById(R.id.list);
        final RowAdapter adapter = new RowAdapter(getApplicationContext(), datos);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GlobalState.PIGMENTO_SELECCIONADO = pigmentos.get((int) id);

                // recuperamos la información que se tiene que mostrar en la siguiente pantalla
                GlobalState.COLOR_SELECCIONADO = db.getColorimetria(pigmentos.get((int) id).getIdPigmento());

                Intent intent = new Intent(view.getContext(), InformacionPigmento.class);
                startActivity(intent);
            }
        });
    }

}
