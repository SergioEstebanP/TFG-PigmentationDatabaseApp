package com.dbpigmentationapp.mockedData;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SQLiteDatabasehandler extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "pigments.db";
    public static final String TABLA_PIGMENTOS = "Pigmento";

    public static final String ID = "id";
    public static final String ID_COLOR = "idColor";
    public static final String NOMBRE = "nombre";
    public static final String COLOR_PIGMENTO = "colorPigmento";
    public static final String POTENCIA = "potencia";
    public static final String LAMBDA = "lambda";
    public static final String FORMULA = "formula";
    public static final String ELEMENTO_QUIMICO = "elementoQuimico";
    private static final String[] COLUMNS = {ID, ID_COLOR, NOMBRE, COLOR_PIGMENTO, POTENCIA, LAMBDA, FORMULA, ELEMENTO_QUIMICO};

    public SQLiteDatabasehandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // aqui podemos pasarle scripts y leerlos, seria mucho mas facil
        String sql = String.format("create table %s (%s int primary key, " +
                        "%s text, " +
                        "%s text, " +
                        "%s text," +
                        "%s float," +
                        "%s float, " +
                        "%s text, " +
                        "%s text)",
                TABLA_PIGMENTOS,
                ID,
                ID_COLOR,
                NOMBRE,
                COLOR_PIGMENTO,
                POTENCIA,
                LAMBDA,
                FORMULA,
                ELEMENTO_QUIMICO);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // aqui podemos pasarle scripts y leerlos, seria mucho mas facil
        db.execSQL("DROP TABLE IF EXISTS " + DB_NAME);
        this.onCreate(db);
    }

    // OPERACIONES CONTRA LA BASE DE DATOS
    public void deleteOne(Pigmento pigmento) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLA_PIGMENTOS, "id = ?", new String[]{String.valueOf(pigmento.getIdPigmento())});
        db.close();
    }

    public Pigmento getPigmento(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLA_PIGMENTOS,           // a. table
                COLUMNS,                                    // b. column names
                " id = ?",                          // c. selections
                new String[]{String.valueOf(id)},           // d. selections args
                null,
                null,
                null,
                null);

        if (cursor != null)
            cursor.moveToFirst();

        Pigmento pigmento = new Pigmento();
        pigmento.setIdPigmento(Integer.parseInt(cursor.getString(0)));
        pigmento.setIdColor(cursor.getString(1));
        pigmento.setNombre(cursor.getString(2));
        pigmento.setColor(cursor.getString(3));
        pigmento.setPotencia(Float.parseFloat(cursor.getString(4)));
        pigmento.setLambda(Float.parseFloat(cursor.getString(5)));
        pigmento.setFormula(cursor.getString(6));
        pigmento.setElementoQuimico(cursor.getString(7));

        return pigmento;
    }

    public List<Pigmento> todosPigmentos() {
        List<Pigmento> pigmentos = new LinkedList<Pigmento>();
        String query = "SELECT  * FROM " + TABLA_PIGMENTOS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Pigmento pigmento = null;

        if (cursor.moveToFirst()) {
            do {
                pigmento = new Pigmento();
                pigmento.setIdPigmento(Integer.parseInt(cursor.getString(0)));
                pigmento.setIdColor(cursor.getString(1));
                pigmento.setNombre(cursor.getString(2));
                pigmento.setColor(cursor.getString(3));
                pigmento.setPotencia(Float.parseFloat(cursor.getString(4)));
                pigmento.setLambda(Float.parseFloat(cursor.getString(5)));
                pigmento.setFormula(cursor.getString(6));
                pigmento.setElementoQuimico(cursor.getString(7));
                pigmentos.add(pigmento);
            } while (cursor.moveToNext());
        }

        return pigmentos;
    }

    public void addPigmento(Pigmento pigmento) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_NAME, player.getName());
        values.put(KEY_POSITION, player.getPosition());
        values.put(KEY_HEIGHT, player.getHeight());
        // insert
        db.insert(TABLE_NAME,null, values);
        db.close();
    }

    public int updatePlayer(Player player) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, player.getName());
        values.put(KEY_POSITION, player.getPosition());
        values.put(KEY_HEIGHT, player.getHeight());

        int i = db.update(TABLE_NAME, // table
                values, // column/value
                "id = ?", // selections
                new String[] { String.valueOf(player.getId()) });

        db.close();

        return i;
    }
}

