/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author rafaeli
 */
public class Persona {
    
    private String nombre;
    String apellido;
    Documento documento;
    private int edad;
    
    public Persona(){}
    
    public Persona(String pNombre, String pApellido, Documento documento, int pEdad){
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.documento = documento;
        this.edad = pEdad;
    }

    public Persona(String pNombre, int pEdad){
        this.nombre = pNombre;
        this.edad = pEdad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    boolean mayorEdad() {
        return edad >= 18;
    }
            
    public String mostrarDatos() {
        String datos = "nombre= " + this.nombre + ", apellido: " + this.apellido +
                this.documento.mostrarValores() +
                 ", edad: " + this.edad + " y es "
                + ((mayorEdad()) ? "mayor de edad" : "menor de edad");
        //System.out.println(datos);
        return datos;
    }
    
}

