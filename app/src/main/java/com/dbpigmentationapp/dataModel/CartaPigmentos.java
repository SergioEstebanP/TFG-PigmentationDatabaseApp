package com.dbpigmentationapp.dataModel;

public class CartaPigmentos {
    private String nombre;
    private String descripcion;
    private String color;
    private String elemento;

    public CartaPigmentos (String nombre, String descripcion, String color, String elemento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.elemento = elemento;
    }

    public String getNombre () {
        return this.nombre;
    }

    public String getDescripcion () {
        return this.descripcion;
    }

    public String getColor () {
        return this.color;
    }

    public String getElemento () {
        return this.elemento;
    }
}
