package com.dbpigmentationapp.mockedData;

import android.net.Uri;
import android.provider.BaseColumns;

public class StatusContract {

    public static final String DB_NAME = "pigments.db";
    public static final int DB_VERSION = 1;
    public static final String TABLA_PIGMENTOS = "pigmentos";

    public static final String AUTHORITY = "com.dbpigmentationapp.mockedData.DataProvider";
    public static final Uri CONTENT_UTI = Uri.parse("content://" + AUTHORITY + "/" + TABLA_PIGMENTOS);
    public static final int STATUS_ITEM = 1;
    public static final int STATUS_DIR = 2;

    public class Column {
        public static final String ID = BaseColumns._ID;
        public static final String ID_COLOR = "idColor";
        public static final String NOMBRE = "nombre";
        public static final String COLOR_PIGMENTO = "colorPigmento";
        public static final String POTENCIA = "potencia";
        public static final String LAMBDA = "lambda";
        public static final String FORMULA = "formula";
        public static final String ELEMENTO_QUIMICO = "elementoQuimico";
    }
}
