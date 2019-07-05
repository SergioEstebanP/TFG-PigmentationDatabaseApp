package com.dbpigmentationapp.subMenus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.ServicesSupport.GlobalState;
import com.dbpigmentationapp.dataBase.DataCreation;
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

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos_pigmentos);

        db = new DbHandler(this);

        DataCreation.createBulkData(db, this);
        final List<Pigmento> pigmentos;
        final ArrayList<CartaPigmentos> datos = new ArrayList<>();

        if (GlobalState.FILTRAR_POR_COLOR) {
            pigmentos = db.todosPigmentosParametro("idColor", grupoColorFromInt(GlobalState.COLOR_SELECCIONADO_BUSQUEDA));
            GlobalState.FILTRAR_POR_COLOR = false;
        } else if (GlobalState.FILTRAR_POR_NOMBRE) {
            pigmentos = db.todosPigmentosNombreElemento("nombre", GlobalState.NOMBRE_SELECCIONADO_BUSQUEDA);
            GlobalState.FILTRAR_POR_NOMBRE = false;
        } else if (GlobalState.FILTRAR_POR_ELEMENTO) {
            pigmentos = db.todosPigmentosNombreElemento("elementoQuimico", GlobalState.ELEMENTO_SELECCIONADO_BUSQUEDA);
            GlobalState.FILTRAR_POR_ELEMENTO = false;
        } else {
            pigmentos = db.todosPigmentos();
        }

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

    @RequiresApi(api = Build.VERSION_CODES.O)
    private String grupoColorFromInt(int color) {
        String grupoColor = "10";
        Color aux = Color.valueOf(color);
        float r = aux.red();
        float b = aux.blue();
        float g = aux.green();
        System.out.println(r + " " + g + " " + b);
        if (r > 0.9 && g > 0.9 && b > 0.9) {
            grupoColor = "1"; // BLANCO
        } else if ((r > 0.029 && r < 0.629) && (g > 0.01 && g <= 1) && b > 0.93) {
            grupoColor = "3"; // AZUL
        } else if ((r > 0.29 && r < 0.749) && (g > 0.069 && g < 0.45) && b > 0.95) {
            grupoColor = "4"; // VIOLETA
        } else if (r > 0.8 && (g > 0.07 && g < 0.759) && (b > 0.669 && b <= 1)) {
            grupoColor = "5"; // MAGENTA
        } else if (r > 0.95 && (g > 0.01 && g < 0.60) && (b > 0.01 && b < 0.669)) {
            grupoColor = "9"; // ROJO
        } else if (r > 0.95 && (g > 0.29 && g < 0.61) && (b > 0.01 && b < 0.2)) {
            grupoColor = "8"; // NARANJA
        } else if (r > 0.90 && g > 0.99  && b < 0.73) {
            grupoColor = "7"; // AMARILLO
        } else if ((r > 0.01 && r <= 1) && g > 0.95  && b < 0.769) {
            grupoColor = "2"; // VERDE
        } else if ( r < 0.1 && g < 0.1 && b < 0.1) {
            grupoColor = "6"; // NEGRO
        }
        return grupoColor;
    }

}
