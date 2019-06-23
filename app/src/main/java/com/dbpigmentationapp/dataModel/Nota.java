package com.dbpigmentationapp.dataModel;

public class Nota {

    private int idPigmento;
    private String titulo;
    private String descripcion;

    // Constructor por defecto
    public Nota () {
        this.idPigmento = 0;
        this.titulo = "Título";
        this.descripcion = "Breve descripción";
    }

    // Constructor con parametros
    public Nota (int idPigmento, String titulo, String descripcion) {
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

    public int getIdPigmento() {
        return idPigmento;
    }

    public void setIdPigmento(int idPigmento) {
        this.idPigmento = idPigmento;
    }
}
