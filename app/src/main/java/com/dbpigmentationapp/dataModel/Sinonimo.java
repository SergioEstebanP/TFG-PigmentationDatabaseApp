package com.dbpigmentationapp.dataModel;

public class Sinonimo {

    private int idPigmento;
    private String valor;

    // constructor con parametros
    public Sinonimo(int idPigmento, String valor) {
        this.idPigmento = idPigmento;
        this.valor = valor;
    }

    // constructor con valores por defecto
    public Sinonimo () {
        this.idPigmento = 0;
        this.valor = "Sinonimo";
    }

    public int getIdPigmento() {
        return idPigmento;
    }

    public void setIdPigmento(int idPigmento) {
        this.idPigmento = idPigmento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
