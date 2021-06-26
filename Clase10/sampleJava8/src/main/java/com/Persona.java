package com;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        //this.nombre = nombre;
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
