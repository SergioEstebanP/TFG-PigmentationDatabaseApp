package com.dbpigmentationapp.dataModel;

public class Pigmento {

    private String idPigmento;
    private String idColor;
    private String nombre;
    private String color;
    private float potencia;
    private float lambda;
    private String formula;
    private String elementoQuimico;
    private String descripcion;

    public Pigmento (String idPigmento, String idColor, String nombre, String color, float potencia, float lambda, String formula, String elementoQuimico, String descripcion) {
        this.idPigmento = idPigmento;
        this.idColor = idColor;
        this.nombre = nombre;
        this.color = color;
        this.potencia = potencia;
        this.lambda = lambda;
        this.formula = formula;
        this.elementoQuimico = elementoQuimico;
        this.descripcion = descripcion;
    }

    public Pigmento () {
        this.idPigmento = "0";
        this.idColor = "rojo";
        this.nombre = "Lava";
        this.color = "#4286f4";
        this.potencia = 100;
        this.lambda = 200;
        this.formula = "BarrO";
        this.elementoQuimico = "Cu";
        this.descripcion = "Descripcion";
    }

    // GET OPERATIONS
    public String getIdPigmento () {
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
    public void setIdPigmento (String idPigmento) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // implementar el toString
//    @Override
//    public String toString () {
//       return "" ;
//    }

}
