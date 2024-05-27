package com.ucb.identificador.model;

public class User {
    private String id;
    private String name;
    private String fechaNacimiento;

    public User(String id, String name, String fechaNacimiento) {
        this.id = id;
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
