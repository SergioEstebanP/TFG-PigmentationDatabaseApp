package com.dbpigmentationapp.dataModel;

public class Nota {

    private String idPigmento;
    private String titulo;
    private String descripcion;

    // Constructor por defecto
    public Nota () {
        this.idPigmento = "0";
        this.titulo = "Título";
        this.descripcion = "Breve descripción";
    }

    // Constructor con parametros
    public Nota (String idPigmento, String titulo, String descripcion) {
        this.idPigmento = idPigmento;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    // FUNCIONES DE ACCESO A DATOS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdPigmento() {
        return idPigmento;
    }

    public void setIdPigmento(String idPigmento) {
        this.idPigmento = idPigmento;
    }
}
