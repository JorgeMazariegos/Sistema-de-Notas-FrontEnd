package com.umg.sistema.de.notas.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Grade {
    private int id;
    private String tipoEvaluacion;
    private int id_asignacion;
    private Date fecha;

    public Grade(int id, String tipoEvaluacion, int id_asignacion, Date fecha) {
        this.id = id;
        this.tipoEvaluacion = tipoEvaluacion;
        this.id_asignacion = id_asignacion;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(String tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public int getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
