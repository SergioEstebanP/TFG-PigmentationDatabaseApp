package com.dbpigmentationapp.dataModel;

public class Sinonimo {

    private String idPigmento;
    private String valor;

    // constructor con parametros
    public Sinonimo(String idPigmento, String valor) {
        this.idPigmento = idPigmento;
        this.valor = valor;
    }

    // constructor con valores por defecto
    public Sinonimo () {
        this.idPigmento = "0";
        this.valor = "Sinonimo";
    }

    public String getIdPigmento() {
        return idPigmento;
    }

    public void setIdPigmento(String idPigmento) {
        this.idPigmento = idPigmento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
