package com.dbpigmentationapp.dataModel;

public class TuplaDatos {

    private String idPigmento;
    private float x;
    private float y;

    public TuplaDatos(String idPigmento, float x, float y) {
        this.idPigmento = idPigmento;
        this.x = x;
        this.y = y;
    }

    public TuplaDatos() {
        this.idPigmento = "0";
        this.x = 0;
        this.y = 0;
    }

    public String getIdPigmento() {
        return idPigmento;
    }

    public void setIdPigmento(String idPigmento) {
        this.idPigmento = idPigmento;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
