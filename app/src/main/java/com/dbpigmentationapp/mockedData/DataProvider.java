package com.dbpigmentationapp.mockedData;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

public class DataProvider extends ContentProvider {

    private DbHelper dbHelper;
    private static final UriMatcher sURIMatcher;

    static {
        sURIMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        sURIMatcher.addURI(StatusContract.AUTHORITY, StatusContract.TABLA_PIGMENTOS, StatusContract.STATUS_DIR);
        sURIMatcher.addURI(StatusContract.AUTHORITY, StatusContract.TABLA_PIGMENTOS + "/#", StatusContract.STATUS_ITEM);
    }

    @Override
    public boolean onCreate() {
        dbHelper = new DbHelper(getContext());
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
        return null;
    }


    @Override
    public String getType(Uri uri) {
        return null;
    }


    // metodo para insertar datos en la base de datos
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        Uri ret = null;

        if (sURIMatcher.match(uri) != StatusContract.STATUS_DIR) {
            throw new IllegalArgumentException("uri incorrecta: " + uri);
        }
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        long rowId = db.insertWithOnConflict(StatusContract.TABLA_PIGMENTOS, null,
                contentValues, SQLiteDatabase.CONFLICT_IGNORE);

        if (rowId != -1) {
            long id = contentValues.getAsLong(StatusContract.Column.ID);
            ret = ContentUris.withAppendedId(uri, id);
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return ret;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        String where;
        switch (sURIMatcher.match(uri)) {
            case StatusContract.STATUS_DIR:
                where = s;
                break;
            case StatusContract.STATUS_ITEM:
                long id = ContentUris.parseId(uri);
                where = StatusContract.Column.ID
                        + "="
                        + id
                        + (TextUtils.isEmpty(s) ? "" : " and ( " + s + " )");
                break;
            default:
                throw new IllegalArgumentException("uri incorrecta: " + uri);
        }
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        int ret = db.delete(StatusContract.TABLA_PIGMENTOS, where, strings);
        if (ret > 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return ret;
    }


    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        String where;
        switch (sURIMatcher.match(uri)) {
            case StatusContract.STATUS_DIR:
                where = s;
                break;
            case StatusContract.STATUS_ITEM:
                long id = ContentUris.parseId(uri);
                where = StatusContract.Column.ID
                        + "="
                        + id
                        + (TextUtils.isEmpty(s) ? "" : " and ( " + s + " )");
                break;
            default:
                throw new IllegalArgumentException("uri incorrecta: " + uri);
        }

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        int ret = db.update(StatusContract.TABLA_PIGMENTOS, contentValues, where, strings);
        if (ret > 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return ret;
    }
}
