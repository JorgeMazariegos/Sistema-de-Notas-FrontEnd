package com.umg.sistema.de.notas.model;

public class Asignacion {
    private int id;
    private int id_estudiante;
    private int id_curso;

    public Asignacion(int id, int id_estudiante, int id_curso) {
        this.id = id;
        this.id_estudiante = id_estudiante;
        this.id_curso = id_curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }
    
    
}
