package com.dbpigmentationapp.dataModel;

public class Colorimetria {
    private String idPigmento;
    private float l;
    private float a;
    private float b;
    private float x;
    private float y;
    private float z;

    public Colorimetria(String idPigmento, float l, float a, float b, float x, float y, float z) {
        this.idPigmento = idPigmento;
        this.l = l;
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Colorimetria() {
        this.idPigmento = "0";
        this.l = 0;
        this.a = 0;
        this.b = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public String getIdPigmento() {
        return idPigmento;
    }

    public void setIdPigmento(String idPigmento) {
        this.idPigmento = idPigmento;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
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

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
