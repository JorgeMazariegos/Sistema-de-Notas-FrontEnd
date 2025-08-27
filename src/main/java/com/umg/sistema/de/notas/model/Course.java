package com.umg.sistema.de.notas.model;

public class Course {
    private int id;
    private String nombre;
    private String codigo;
    private String semestre;
    private int id_profesor;

    public Course(int id, String nombre, String codigo, String semestre, int id_profesor) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.id_profesor = id_profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
    
    
}
