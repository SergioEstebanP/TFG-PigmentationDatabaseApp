package com.dbpigmentationapp.ServicesSupport;

import android.widget.ProgressBar;
import android.widget.TextView;

import com.dbpigmentationapp.dataModel.Colorimetria;
import com.dbpigmentationapp.dataModel.Pigmento;

import java.util.List;

public class GlobalState {
    public static List X_IR_AXIS;
    public static List Y_IR_AXIS;
    public static List X_RX_AXIS;
    public static List Y_RX_AXIS;
    public static Pigmento PIGMENTO_SELECCIONADO;
    public static Colorimetria COLOR_SELECCIONADO;
    public static int COLOR_SELECCIONADO_BUSQUEDA;
    public static String NOMBRE_SELECCIONADO_BUSQUEDA;
    public static String ELEMENTO_SELECCIONADO_BUSQUEDA;
    public static boolean FILTRAR_POR_NOMBRE = false;
    public static boolean FILTRAR_POR_ELEMENTO = false;
    public static boolean FILTRAR_POR_COLOR = false;
    public static ProgressBar pgsBar;
    public static TextView progresText;
}
