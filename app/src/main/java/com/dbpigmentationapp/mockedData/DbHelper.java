package com.dbpigmentationapp.mockedData;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper (Context context) {
        super(context, StatusContract.DB_NAME, null, StatusContract.DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // esta es la sentencia para crear el esquema de la base de datos, todas las tablas,
        // e informacion importante, estan almacenadas en la clase de constantes de StatusContrac
        // para crear mas adelante las diferentes tablas dentro de la base de datos, simplemente tenemos
        // que introducir aqui el scrippt, que lo podemos sacar evidentemente de un script hecho en sqlite
        // para mucha mas facilidad de uso
        String sql = String.format("create table %s (%s int primary key, " +
                "%s text, " +
                "%s text, " +
                "%s text," +
                "%s float," +
                "%s float, " +
                "%s text, " +
                "%s text)", StatusContract.TABLA_PIGMENTOS,
                StatusContract.Column.ID,
                StatusContract.Column.ID_COLOR,
                StatusContract.Column.NOMBRE,
                StatusContract.Column.COLOR_PIGMENTO,
                StatusContract.Column.POTENCIA,
                StatusContract.Column.LAMBDA,
                StatusContract.Column.FORMULA,
                StatusContract.Column.ELEMENTO_QUIMICO);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists " + StatusContract.TABLA_PIGMENTOS);
        onCreate(db);
    }
}
