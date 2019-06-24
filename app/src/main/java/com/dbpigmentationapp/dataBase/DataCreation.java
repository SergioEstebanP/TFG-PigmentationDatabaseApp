package com.dbpigmentationapp.dataBase;

import android.content.Context;

import com.dbpigmentationapp.dataModel.Colorimetria;
import com.dbpigmentationapp.dataModel.Pigmento;

import java.util.List;

public class DataCreation {

    // Introducción en la base de datos de toda la información relacionada con los pigmentos
    public static void createBulkData(DbHandler db, Context activity) {
        inicializarPigmentos(db, activity);
        inicializarColores(db, activity);
//        inicializarIr(db, activity);
//        inicializarRx(db, activity);
//        inicializarRaman(db, activity);
//        inicializarNotas(db, activity);
//        inicializarSinonimos(db, activity);
    }

    private static void inicializarSinonimos(DbHandler db, Context activity) {

    }

    private static void inicializarNotas(DbHandler db, Context activity) {

    }

    private static void inicializarRaman(DbHandler db, Context activity) {

    }

    private static void inicializarRx(DbHandler db, Context activity) {

    }

    private static void inicializarIr(DbHandler db, Context activity) {

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
}
