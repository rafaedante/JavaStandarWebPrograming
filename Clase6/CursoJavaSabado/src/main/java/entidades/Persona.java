/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.Persistencia;

import java.util.Date;

/**
 *
 * @author rafaeli
 */
public abstract class Persona implements Persistencia {
    
    private String nombre;
    String apellido;
    Documento documento;
    private Date fechaNacimiento;
    
    public Persona(){}
    
    public Persona(String pNombre, String pApellido, Documento documento, Date pFechaNacimiento){
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.documento = documento;
        this.fechaNacimiento = pFechaNacimiento;
    }

    public abstract String mostrarTipoPersona();

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

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}

