package com.dbpigmentationapp.subMenus.finalViews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.dbpigmentationapp.MainMenu;
import com.dbpigmentationapp.R;
import com.dbpigmentationapp.subMenus.TodosPigmentos;

public class ReportarBug extends AppCompatActivity {

    CardView enviarbug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar_bug);

        enviarbug = findViewById(R.id.enviarBug);
        enviarbug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Informe enviado. ¡Muchas Gracias!",
                        Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
