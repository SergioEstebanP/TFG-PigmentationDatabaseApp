package com.dbpigmentationapp.dataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.dbpigmentationapp.dataModel.Colorimetria;
import com.dbpigmentationapp.dataModel.Nota;
import com.dbpigmentationapp.dataModel.Pigmento;
import com.dbpigmentationapp.dataModel.Sinonimo;
import com.dbpigmentationapp.dataModel.TuplaDatos;

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
        FilesReader mQuoteBank = new FilesReader(activity);
        List<String> mLines = mQuoteBank.readLine("creation.sql");
        for (String sqlStatement : mLines) {
            db.execSQL(sqlStatement);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DbDefinition.DB_NAME);
        this.onCreate(db);
    }

    // OPERACIONES CONTRA LA BASE DE DATOS

    // *******************************
    // OPERACIONES TABLA PIGMENTOS   *
    // *******************************

    // OBTENER PIGMENTO POR ID
    public Pigmento getPigmento(String id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DbDefinition.TABLA_PIGMENTOS,
                DbDefinition.COLUMNAS_PIGMENTO,
                " id = ?",
                new String[]{id},
                null,
                null,
                null,
                null);
        if (cursor != null)
            cursor.moveToFirst();
        Pigmento pigmento = new Pigmento();
        pigmento.setIdPigmento(cursor.getString(0));
        pigmento.setIdColor(cursor.getString(1));
        pigmento.setNombre(cursor.getString(2));
        pigmento.setColor(cursor.getString(3));
        pigmento.setPotencia(Float.parseFloat(cursor.getString(4)));
        pigmento.setLambda(Float.parseFloat(cursor.getString(5)));
        pigmento.setFormula(cursor.getString(6));
        pigmento.setElementoQuimico(cursor.getString(7));
        pigmento.setDescripcion(cursor.getString(8));
        return pigmento;
    }

    // OBTENER TODOS LOS PIGMENTOS
    public List<Pigmento> todosPigmentos() {
        List<Pigmento> pigmentos = new LinkedList<>();
        String query = "SELECT  * FROM " + DbDefinition.TABLA_PIGMENTOS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Pigmento pigmento;
        if (cursor.moveToFirst()) {
            do {
                pigmento = new Pigmento();
                pigmento.setIdPigmento(cursor.getString(0));
                pigmento.setIdColor(cursor.getString(1));
                pigmento.setNombre(cursor.getString(2));
                pigmento.setColor(cursor.getString(3));
                pigmento.setPotencia(Float.parseFloat(cursor.getString(4)));
                pigmento.setLambda(Float.parseFloat(cursor.getString(5)));
                pigmento.setFormula(cursor.getString(6));
                pigmento.setElementoQuimico(cursor.getString(7));
                pigmento.setDescripcion(cursor.getString(8));
                pigmentos.add(pigmento);
            } while (cursor.moveToNext());
        }
        return pigmentos;
    }

    // OBTENER TODOS LOS PIGMENTOS DADO UN PARAMETRO:
    // COLOR, NOMBRE o ELEMENTO QUIMICO
    public List<Pigmento> todosPigmentosParametro(String parametro) {
        List<Pigmento> pigmentos = new LinkedList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(DbDefinition.TABLA_PIGMENTOS,
                DbDefinition.COLUMNAS_PIGMENTO,
                " " + parametro + " = ?",
                new String[]{String.valueOf(parametro)},
                null,
                null,
                null,
                null);
        Pigmento pigmento;
        if (cursor.moveToFirst()) {
            do {
                pigmento = new Pigmento();
                pigmento.setIdPigmento(cursor.getString(0));
                pigmento.setIdColor(cursor.getString(1));
                pigmento.setNombre(cursor.getString(2));
                pigmento.setColor(cursor.getString(3));
                pigmento.setPotencia(Float.parseFloat(cursor.getString(4)));
                pigmento.setLambda(Float.parseFloat(cursor.getString(5)));
                pigmento.setFormula(cursor.getString(6));
                pigmento.setElementoQuimico(cursor.getString(7));
                pigmento.setDescripcion(cursor.getString(8));
                pigmentos.add(pigmento);
            } while (cursor.moveToNext());
        }
        return pigmentos;
    }

    // AÑADIR UN PIGMENTO
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
        values.put(DbDefinition.DESCRIPCION, pigmento.getDescripcion());
        db.insertWithOnConflict(DbDefinition.TABLA_PIGMENTOS, null, values, SQLiteDatabase.CONFLICT_IGNORE);
        db.close();
    }

    // *******************************
    // OPERACIONES TABLA NOTAS       *
    // *******************************

    // AÑADIR UNA NOTA
    public void addNota(Nota nota) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DbDefinition.ID, nota.getIdPigmento());
        values.put(DbDefinition.TITULO, nota.getTitulo());
        values.put(DbDefinition.DESCRIPCION, nota.getDescripcion());
        db.insertWithOnConflict(DbDefinition.TABLA_NOTAS, null, values, SQLiteDatabase.CONFLICT_IGNORE);
        db.close();
    }

    // OBTENER TODAS LAS NOTAS DADO EL NOMBRE O EL ID DE UN PIGMENTO
    // el parametro pigmento tiene que valer exactamente lo mismo que el valor de la columna que queremos buscar
    // siq ueremos buscar por nombre parametro = nombre
    public List<Nota> todasNotasPorDeUnPigmento(String parametro) {
        List<Nota> notas = new LinkedList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(DbDefinition.TABLA_NOTAS,
                DbDefinition.COLUMNAS_NOTAS,
                " " + parametro + " = ?",
                new String[]{String.valueOf(parametro)},
                null,
                null,
                null,
                null);
        Nota nota;
        if (cursor.moveToFirst()) {
            do {
                nota = new Nota();
                nota.setIdPigmento(cursor.getString(0));
                nota.setTitulo(cursor.getString(1));
                nota.setDescripcion(cursor.getString(2));
                notas.add(nota);
            } while (cursor.moveToNext());
        }
        return notas;
    }

    // ******************************
    // OPERACIONES TABLA SINONIMOS   *
    // *******************************

    // AÑADIR UN SINONIMO
    public void addSinonimo(Sinonimo sinonimo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DbDefinition.ID, sinonimo.getIdPigmento());
        values.put(DbDefinition.VALOR, sinonimo.getValor());
        db.insertWithOnConflict(DbDefinition.TABLA_SINONIMOS, null, values, SQLiteDatabase.CONFLICT_IGNORE);
        db.close();
    }

    // OBTENER TODOS LOS SINONIMOS DE UN PIGMENTO DADO SU NOMBRE
    public List<Sinonimo> todosSinonimosPigmento(String parametro) {
        List<Sinonimo> sinonimos = new LinkedList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(DbDefinition.TABLA_SINONIMOS,
                DbDefinition.COLUMNAS_SINONIMOS,
                " " + parametro + " = ?",
                new String[]{String.valueOf(parametro)},
                null,
                null,
                null,
                null);
        Sinonimo sinonimo;
        if (cursor.moveToFirst()) {
            do {
                sinonimo = new Sinonimo();
                sinonimo.setIdPigmento(cursor.getString(0));
                sinonimo.setValor(cursor.getString(1));
                sinonimos.add(sinonimo);
            } while (cursor.moveToNext());
        }
        return sinonimos;
    }

    // *******************************************
    // OPERACIONES TABLA INFRARROJOS, RX Y RAMAN *
    // *******************************************

    // AÑADIR UN INFRARROJO, RAYOS X O RAMAN
    // El parametro String tabla tiene que ser uno de los 3 siguientes:
    //   - DbDefinition.TABLA_IR
    //   - DbDefinition.TABLA_RX
    //   - DbDefinition.TABLA_RAMAN
    public void addTuplaDatos(TuplaDatos data, String tabla) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DbDefinition.ID, data.getIdPigmento());
        values.put(DbDefinition.VALOR, data.getX());
        values.put(DbDefinition.VALOR, data.getY());
        db.insertWithOnConflict(tabla, null, values, SQLiteDatabase.CONFLICT_IGNORE);
        db.close();
    }

    // OBTENER TODOS LOS DATOS DE IR, RX o RAMAN DADO UN PIGMENTO
    // El parametro String tabla tiene que ser uno de los 3 siguientes:
    //   - DbDefinition.TABLA_IR
    //   - DbDefinition.TABLA_RX
    //   - DbDefinition.TABLA_RAMAN
    public List<TuplaDatos> todosDatosPigmento(int idPigmento, String tabla) {
        String[] columnas = new String[0];
        switch (tabla) {
            case DbDefinition.TABLA_IR:
                columnas = DbDefinition.COLUMNAS_IR;
                break;
            case DbDefinition.TABLA_RX:
                columnas = DbDefinition.COLUMNAS_RX;
                break;
            case DbDefinition.TABLA_RAMAN:
                columnas = DbDefinition.COLUMNAS_RAMAN;
                break;
        }
        List<TuplaDatos> dataSet = new LinkedList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(tabla,
                columnas,
                " id = ?",
                new String[]{String.valueOf(idPigmento)},
                null,
                null,
                null,
                null);
        TuplaDatos data;
        if (cursor.moveToFirst()) {
            do {
                data = new TuplaDatos();
                data.setIdPigmento(cursor.getString(0));
                data.setX(Float.parseFloat(cursor.getString(1)));
                data.setY(Float.parseFloat(cursor.getString(2)));
                dataSet.add(data);
            } while (cursor.moveToNext());
        }
        return dataSet;
    }

    // ********************************
    // OPERACIONES TABLA COLORIMETRIA *
    // ********************************

    // AÑADIR DATOS COLORIMETRIA
    public void addColorimetria(Colorimetria data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DbDefinition.ID, data.getIdPigmento());
        values.put(DbDefinition.L, data.getL());
        values.put(DbDefinition.A, data.getA());
        values.put(DbDefinition.B, data.getB());
        values.put(DbDefinition.X, data.getX());
        values.put(DbDefinition.Y, data.getY());
        values.put(DbDefinition.Z, data.getZ());
        db.insertWithOnConflict(DbDefinition.TABLA_COLORIMETRIA, null, values, SQLiteDatabase.CONFLICT_IGNORE);
        db.close();
    }

    // OBTENER TODOS LOS DATOS DE COLORIMETRIA DE UN PIGMENTO
    public Colorimetria getColorimetria(String idPigmento) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(DbDefinition.TABLA_COLORIMETRIA,
                DbDefinition.COLUMNAS_COLORIMETRIA,
                " id = ?",
                new String[]{String.valueOf(idPigmento)},
                null,
                null,
                null,
                null);
        Colorimetria color = new Colorimetria();
        if (cursor.moveToFirst()) {
            color.setIdPigmento(cursor.getString(0));
            color.setL(Float.parseFloat(cursor.getString(1)));
            color.setA(Float.parseFloat(cursor.getString(2)));
            color.setB(Float.parseFloat(cursor.getString(3)));
            color.setX(Float.parseFloat(cursor.getString(4)));
            color.setY(Float.parseFloat(cursor.getString(5)));
            color.setZ(Float.parseFloat(cursor.getString(6)));
        }
        return color;
    }
}

