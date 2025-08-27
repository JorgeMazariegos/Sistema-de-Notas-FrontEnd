package com.umg.sistema.de.notas.model;

public class Student {
    private int id;
    private String nombre;
    private String email;
    private String carnet;
    private String telefono;

    public Student(int id, String nombre, String email, String carnet, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.carnet = carnet;
        this.telefono = telefono;
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
    
    
}
