package com.dbpigmentationapp.mockedData;

public class Pigmento {

    private int idPigmento;
    private String idColor;
    private String nombre;
    private String color;
    private float potencia;
    private float lambda;
    private String formula;
    private String elementoQuimico;

    public Pigmento (int idPigmento, String idColor, String nombre, String color, float potencia, float lambda, String formula, String elementoQuimico) {
        this.idPigmento = idPigmento;
        this.idColor = color;
        this.nombre = nombre;
        this.color = color;
        this.potencia = potencia;
        this.lambda = lambda;
        this.formula = formula;
        this.elementoQuimico = elementoQuimico;
    }

    public Pigmento () {
        this.idPigmento = 0;
        this.idColor = null;
        this.nombre = null;
        this.color = null;
        this.potencia = 0;
        this.lambda = 0;
        this.formula = null;
        this.elementoQuimico = null;
    }

    // GET OPERATIONS
    public int getIdPigmento () {
        return this.idPigmento;
    }

    public String getIdColor () {
        return this.idColor;
    }

    public String getNombre () {
        return this.nombre;
    }

    public String getColor () {
        return this.color;
    }

    public String getFormula () {
        return this.formula;
    }

    public String getElementoQuimico () {
        return this.elementoQuimico;
    }

    public float getPotencia () {
        return this.potencia;
    }

    public float getLmabda() {
        return this.lambda;
    }

    // SET OPERATIONS
    public void setIdPigmento (int idPigmento) {
        this.idPigmento = idPigmento;
    }

    public void setIdColor (String idColor) {
        this.idColor = idColor;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setFormula (String formula) {
        this.formula = formula;
    }

    public void setElementoQuimico (String elementoQuimico) {
        this.elementoQuimico = elementoQuimico;
    }

    public void setPotencia (float potencia) {
        this.potencia = potencia;
    }

    public void setLambda (float lambda) {
        this.lambda = lambda;
    }

    // implementar el toString

}
