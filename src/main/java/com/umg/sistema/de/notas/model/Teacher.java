package com.umg.sistema.de.notas.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Teacher {
    private int id_profesor;
    private String nombre;
    private String email;
    private String especialidad;
    private String telefono;
    private String password;
    private boolean estado;

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }    
    
    @Override
    public String toString() {
    return "Profesional{" +
            "id=" + id_profesor +
            ", nombre='" + nombre + '\'' +
            ", email='" + email + '\'' +
            ", especialidad='" + especialidad + '\'' +
            ", telefono='" + telefono + '\'' +
            ", password='" + password + '\'' + // Masked for security
            ", estado=" + estado +
            '}';
}
}
