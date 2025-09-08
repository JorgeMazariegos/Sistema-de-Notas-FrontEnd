package com.umg.sistema.de.notas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Seccion {
    private int id_seccion;
    private char letra_seccion;
    private int id_curso;
    private int id_profesor;

    public int getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

    public char getLetra_seccion() {
        return letra_seccion;
    }

    public void setLetra_seccion(char letra_seccion) {
        this.letra_seccion = letra_seccion;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    } 
}
