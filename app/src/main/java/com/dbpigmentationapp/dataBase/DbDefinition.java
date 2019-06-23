package com.dbpigmentationapp.dataBase;

public class DbDefinition {

    // variables globales
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "pigments.db";

    // variable global para referirse al id de unívoco de todos los pgimentos
    public static final String ID = "id";

    // Tabla Pigmentos
    public static final String TABLA_PIGMENTOS = "Pigmento";
    public static final String ID_COLOR = "idColor";
    public static final String NOMBRE = "nombre";
    public static final String COLOR_PIGMENTO = "color";
    public static final String POTENCIA = "potencia";
    public static final String LAMBDA = "lambda";
    public static final String FORMULA = "formula";
    public static final String ELEMENTO_QUIMICO = "elementoQuimico";
    public static final String[] COLUMNAS_PIGMENTO = {ID, ID_COLOR, NOMBRE, COLOR_PIGMENTO, POTENCIA, LAMBDA, FORMULA, ELEMENTO_QUIMICO};

    // Tabla Notas
    public static final String TABLA_NOTAS = "Nota";
    public static final String TITULO = "titulo";
    public static final String DESCRIPCION = "descripcion";
    public static final String[] COLUMNAS_NOTAS = {ID, TITULO, DESCRIPCION};

    // Tabla Sinonimos
    public static final String TABLA_SINONIMOS = "Sinonimo";
    public static final String VALOR = "valor";
    public static final String[] COLUMNAS_SINONIMOS = {ID, VALOR};

    // Tablas datos (Ir, Rx, Raman y parte de Colorimetria)
    public static final String TABLA_IR = "Infrarrojos";
    public static final String TABLA_RX = "RayosX";
    public static final String TABLA_RAMAN = "Raman";
    public static final String X = "x";
    public static final String Y = "y";
    public static final String[] COLUMNAS_IR = {ID, X, Y};
    public static final String[] COLUMNAS_RX = {ID, X, Y};
    public static final String[] COLUMNAS_RAMAN = {ID, X, Y};

    // Tabla Colorimetria
    public static final String TABLA_COLORIMETRIA = "Colorimetria";
    public static final String L = "l";
    public static final String A = "a";
    public static final String B = "b";
    public static final String Z = "z";
    public static final String[] COLUMNAS_COLORIMETRIA = {ID, L, A, B, X, Y, Z};

}

