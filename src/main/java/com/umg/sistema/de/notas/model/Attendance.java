package com.umg.sistema.de.notas.model;

import java.util.Date;

public class Attendance {
    private int id;
    private int id_asignacion;
    private Date fecha;
    private String estatus;

    public Attendance(int id, int id_asignacion, Date fecha, String estatus) {
        this.id = id;
        this.id_asignacion = id_asignacion;
        this.fecha = fecha;
        this.estatus = estatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
}
