package com.umg.sistema.de.notas.model;

public class Teacher {
    private int id;
    private String nombre;
    private String email;
    private String especialidad;
    private String telefono;
    private String password;

    public Teacher(int id, String nombre, String email, String especialidad, String telefono, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.password = password;
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
    
}
