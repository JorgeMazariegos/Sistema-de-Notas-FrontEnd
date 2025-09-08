package com.umg.sistema.de.notas.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Student {
    private int id_estudiante;
    private String nombre;
    private String apellido;
    private String email;
    private String carnet;
    private String telefono;

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
    return "Estudiante{" +
           "id_estudiante=" + id_estudiante +
           ", nombre='" + nombre + '\'' +
           ", apellido='" + apellido + '\'' +
           ", email='" + email + '\'' +
           ", carnet='" + carnet + '\'' +
           ", telefono='" + telefono + '\'' +
           '}';
}
}
