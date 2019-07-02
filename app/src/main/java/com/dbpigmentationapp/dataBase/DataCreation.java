package com.dbpigmentationapp.dataBase;

import android.content.Context;

import com.dbpigmentationapp.ServicesSupport.GlobalState;
import com.dbpigmentationapp.dataModel.Colorimetria;
import com.dbpigmentationapp.dataModel.Pigmento;
import com.dbpigmentationapp.dataModel.Sinonimo;
import com.dbpigmentationapp.dataModel.TuplaDatos;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.PointValue;

public class DataCreation {

    // Introducción en la base de datos de toda la información relacionada con los pigmentos
    public static void createBulkData(DbHandler db, Context activity) {
        inicializarPigmentos(db, activity);
        inicializarColores(db, activity);
        inicializarSinonimos(db, activity);
//        inicializarIr(db, activity);
    }

    private static void inicializarIr(DbHandler db, Context activity) {
        FilesReader mQuoteBank = new FilesReader(activity);
        List<String> mLines = mQuoteBank.readLine("dataIr.csv");
        for (String line : mLines) {
            String[] valores = line.split(";");
            TuplaDatos data = new TuplaDatos();
            data.setIdPigmento(valores[0]);
            data.setX(Float.parseFloat(valores[1].replace(",", ".")));
            data.setY(Float.parseFloat(valores[2].replace(",", ".")));
            db.addTuplaDatos(data, "Infrarrojos");
        }
    }

    private static void inicializarSinonimos(DbHandler db, Context activity) {
        FilesReader mQuoteBank = new FilesReader(activity);
        List<String> mLines = mQuoteBank.readLine("dataSinonimos.csv");
        for (String line : mLines) {
            String[] valores = line.split(";");
            Sinonimo sinonimo = new Sinonimo();
            sinonimo.setIdPigmento(valores[0]);
            sinonimo.setValor(valores[1]);
            db.addSinonimo(sinonimo);
        }
    }

    private static void inicializarColores(DbHandler db, Context activity) {
        FilesReader mQuoteBank = new FilesReader(activity);
        List<String> mLines = mQuoteBank.readLine("dataPigmentos.csv");
        for (String line : mLines) {
            String[] valores = line.split(";");
            Colorimetria colorimetria = new Colorimetria();
            colorimetria.setIdPigmento(valores[1]);
            colorimetria.setL(Float.parseFloat(valores[5].replace(",", ".")));
            colorimetria.setA(Float.parseFloat(valores[6].replace(",", ".")));
            colorimetria.setB(Float.parseFloat(valores[7].replace(",", ".")));
            colorimetria.setX(Float.parseFloat(valores[8].replace(",", ".")));
            colorimetria.setY(Float.parseFloat(valores[9].replace(",", ".")));
            colorimetria.setZ(Float.parseFloat(valores[10].replace(",", ".")));
            db.addColorimetria(colorimetria);
        }
    }

    private static void inicializarPigmentos(DbHandler db, Context activity) {
        FilesReader mQuoteBank = new FilesReader(activity);
        List<String> mLines = mQuoteBank.readLine("dataPigmentos.csv");
        for (String line : mLines) {
            String[] valores = line.split(";");
            Pigmento pigmento = new Pigmento(valores[1],
                    valores[0],
                    valores[2],
                    valores[14],
                    Float.parseFloat(valores[18].split(" ")[0].replace(",", ".")),
                    Float.parseFloat(valores[13].replace(",", ".")),
                    "",
                    "",
                    "");
            obtenerFormulaElemento(db, activity, pigmento);
            obtenerDescripcion(db, activity, pigmento);
            db.addPigmento(pigmento);
        }
    }

    private static void obtenerFormulaElemento(DbHandler db, Context activity, Pigmento pigmento) {
        FilesReader mQuoteBank = new FilesReader(activity);
        List<String> mLines = mQuoteBank.readLine("dataFormulas.csv");
        for (String line : mLines) {
            String[] valores = line.split(";");
            if (pigmento.getIdPigmento().equals(valores[0])) {
                pigmento.setFormula(valores[3]);
                String elemento = "";
                String aux = valores[3];
                if (aux.charAt(0) == '(') {
                    elemento = aux.substring(1, 3);
                } else if (aux.length() == 1) {
                    elemento = aux;
                } else if (aux.charAt(1) == '_') {
                    elemento = String.valueOf(aux.charAt(1));
                } else {
                    elemento = aux.substring(0, 2);
                }
                pigmento.setElementoQuimico(elemento);
            }
        }
    }

    private static void obtenerDescripcion(DbHandler db, Context activity, Pigmento pigmento) {
        FilesReader mQuoteBank = new FilesReader(activity);
        List<String> mLines = mQuoteBank.readLine("notasPigmentos.csv");
        for (String line : mLines) {
            String[] valores = line.split(";");
            if (pigmento.getIdPigmento().equals(valores[0])) {
                if (valores[1].contains("No existen notas") || valores[1].contains("No hay disponible")) {
                    valores[1] = valores[1] + "\n\n";
                }
                pigmento.setDescripcion(valores[1]);
            }
        }
    }

    public static void getDataIr(Pigmento pigmento, Context activity) {
        FilesReader mQuoteBank = new FilesReader(activity);
        List<String> mLines = mQuoteBank.readLine("dataIr.csv");
        List yValues = new ArrayList();
        List xValues = new ArrayList();
        int i = 0;
        for (String line : mLines) {
            String[] valores = line.split(";");
            if (pigmento.getIdPigmento().equals(valores[0])) {
                xValues.add(i, new AxisValue(i).setLabel(String.valueOf(valores[1])));
                yValues.add(new PointValue(i, Float.parseFloat(valores[2].replace(",", "."))));
                i++;
            }
        }
        GlobalState.X_IR_AXIS = xValues;
        GlobalState.Y_IR_AXIS = yValues;
    }

    public static void getDataRx(Pigmento pigmento, Context context) {
        FilesReader mQuoteBank = new FilesReader(context);
        List<String> mLines = mQuoteBank.readLine("dataRx.csv");
        List yValues = new ArrayList();
        List xValues = new ArrayList();
        int i = 0;
        for (String line : mLines) {
            String[] valores = line.split(";");
            if (pigmento.getIdPigmento().equals(valores[0])) {
                xValues.add(i, new AxisValue(i).setLabel(String.valueOf(valores[1])));
                yValues.add(new PointValue(i, Float.parseFloat(valores[2].replace(",", "."))));
                i++;
            }
        }
        GlobalState.X_RX_AXIS = xValues;
        GlobalState.Y_RX_AXIS = yValues;
    }
}
