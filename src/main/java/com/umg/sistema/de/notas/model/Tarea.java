package com.umg.sistema.de.notas.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.text.SimpleDateFormat;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Tarea {
    int id_tarea;
    int id_seccion;
    String titulo;
    String descripcion;
    Date fecha_asignacion;
    Date fecha_entrega;

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public int getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

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

    public Date getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(Date fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    @Override
public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    String fechaAsignacionStr = (fecha_asignacion != null) 
        ? dateFormat.format(fecha_asignacion) : "Not assigned";
    String fechaEntregaStr = (fecha_entrega != null) 
        ? dateFormat.format(fecha_entrega) : "Not assigned";
    
    return "Tarea{" +
            "id_tarea=" + id_tarea +
            ", id_seccion=" + id_seccion +
            ", titulo='" + titulo + '\'' +
            ", descripcion='" + descripcion + '\'' +
            ", fecha_asignacion=" + fechaAsignacionStr +
            ", fecha_entrega=" + fechaEntregaStr +
            '}';
}
}
