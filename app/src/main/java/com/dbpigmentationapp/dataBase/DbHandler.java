package com.dbpigmentationapp.dataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.dbpigmentationapp.dataModel.Nota;
import com.dbpigmentationapp.dataModel.Pigmento;

import java.util.LinkedList;
import java.util.List;


public class DbHandler extends SQLiteOpenHelper {


    private Context activity;

    public DbHandler(Context context) {
        super(context, DbDefinition.DB_NAME, null, DbDefinition.DB_VERSION);
        this.activity = context;
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
                        "%s text)", DbDefinition.TABLA_PIGMENTOS,
                DbDefinition.ID,
                DbDefinition.ID_COLOR,
                DbDefinition.NOMBRE,
                DbDefinition.COLOR_PIGMENTO,
                DbDefinition.POTENCIA,
                DbDefinition.LAMBDA,
                DbDefinition.FORMULA,
                DbDefinition.ELEMENTO_QUIMICO);
        FilesReader mQuoteBank = new FilesReader(activity);
        String finalFile= "";
        List<String> mLines = mQuoteBank.readLine("hola.txt");
        for (String string : mLines)
            finalFile = finalFile + string;
        System.out.println(finalFile);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // aqui podemos pasarle scripts y leerlos, seria mucho mas facil
        db.execSQL("DROP TABLE IF EXISTS " + DbDefinition.DB_NAME);
        this.onCreate(db);
    }

    // OPERACIONES CONTRA LA BASE DE DATOS

    // *******************************
    // OPERACIONES TABLA PIGMENTOS   *
    // *******************************

    // en el futuro habra que implementar las consultas para dar soporte a los diferentes tipos de
    // búsquedas que la aplicaicón ofrece sobre los datos
    public Pigmento getPigmento(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DbDefinition.TABLA_PIGMENTOS,           // a. table
                DbDefinition.COLUMNAS_PIGMENTO,                          // b. column names
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
        String query = "SELECT  * FROM " + DbDefinition.TABLA_PIGMENTOS;
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
        values.put(DbDefinition.ID, pigmento.getIdPigmento());
        values.put(DbDefinition.ID_COLOR, pigmento.getIdColor());
        values.put(DbDefinition.NOMBRE, pigmento.getNombre());
        values.put(DbDefinition.COLOR_PIGMENTO, pigmento.getColor());
        values.put(DbDefinition.POTENCIA, pigmento.getPotencia());
        values.put(DbDefinition.LAMBDA, pigmento.getLmabda());
        values.put(DbDefinition.FORMULA, pigmento.getFormula());
        values.put(DbDefinition.ELEMENTO_QUIMICO, pigmento.getElementoQuimico());
        // insert
        db.insertWithOnConflict(DbDefinition.TABLA_PIGMENTOS,null, values, SQLiteDatabase.CONFLICT_IGNORE);
        db.close();
    }

    public int updatePigmento(Pigmento pigmento) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DbDefinition.ID, pigmento.getIdPigmento());
        values.put(DbDefinition.ID_COLOR, pigmento.getIdColor());
        values.put(DbDefinition.NOMBRE, pigmento.getNombre());
        values.put(DbDefinition.COLOR_PIGMENTO, pigmento.getColor());
        values.put(DbDefinition.POTENCIA, pigmento.getPotencia());
        values.put(DbDefinition.LAMBDA, pigmento.getLmabda());
        values.put(DbDefinition.FORMULA, pigmento.getFormula());
        values.put(DbDefinition.ELEMENTO_QUIMICO, pigmento.getElementoQuimico());

        int i = db.update(DbDefinition.TABLA_PIGMENTOS, // table
                values, // column/value
                "id = ?", // selections
                new String[] { String.valueOf(pigmento.getIdPigmento()) });

        db.close();

        return i;
    }


    // *******************************
    // OPERACIONES TABLA NOTAS       *
    // *******************************

    public Nota getNota(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DbDefinition.TABLA_NOTAS,           // a. table
                DbDefinition.COLUMNAS_NOTAS,                          // b. column names
                " id = ?",                          // c. selections
                new String[]{String.valueOf(id)},           // d. selections args
                null,
                null,
                null,
                null);

        if (cursor != null)
            cursor.moveToFirst();

        Nota nota = new Nota();
        nota.setIdPigmento(Integer.parseInt(cursor.getString(0)));
        nota.setTitulo(cursor.getString(1));
        nota.setDescripcion(cursor.getString(2));
        return nota;
    }
}

