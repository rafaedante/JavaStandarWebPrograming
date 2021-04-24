/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author rafaeli
 */
public class Persona {
    
    private String nombre;
    String apellido;
    String tipoDocumento;
    int nroDocumento;
    int edad;
    
    public Persona(){}
    
    public Persona(String pNombre, String pApellido, String pTipoDoc, int pNroDoc, int pEdad){
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.tipoDocumento = pTipoDoc;
        this.nroDocumento = pNroDoc;
        this.edad = pEdad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
 
            
    void mostrarDatos() {
        String datos = "nombre= " + this.nombre + ", apellido: " + apellido + 
                ", tipoDoc: " + this.tipoDocumento + ", edad: " + edad + ", nroDoc: " + 
                this.nroDocumento;
        System.out.println(datos);
    }
    
}

/*
crear una clase Persona
 nombre del tipo cadena (String)
 apellido del tipo cadena (String)
 tipoDocumento del tipo cadena (String)
 nroDocumento del tipo entero (int)
edad tipo entero(int)

crear el constructor con todos los parametros

crear un metodo que muestre todos los atributos

seter y geter para el atributo nombre

*/