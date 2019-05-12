package com.dbpigmentationapp.dataModel;

public class CartaPigmentos {
    String nombre;
    String descripcion;
    String color;
    String elemento;

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
