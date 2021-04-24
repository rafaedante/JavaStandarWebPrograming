/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author rafaeli
 */
public class Persona {
    
    String nombre;
    String apellido;
    String sexo;
    int edad;
    
    public Persona(){}
    
    public Persona(String pNombre, String pApellido, String pSexo, int pEdad){
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.sexo = pSexo;
        this.edad = pEdad;
    }
    
    public Persona(String pNombre, String pApellido){
        this.nombre = pNombre;
        this.apellido = pApellido;        
    }
            
    void mostrarDatos(int data) {
        String datos = "nombre= " + this.nombre + ", apellido: " + apellido + ", sexo: " + sexo + ", edad: " + edad + ", data: " + data;
        System.out.println(datos);
    }
    
    void mostrarDatos(String data, String data2){
        System.out.println(data + " - " + data2);
    }
}
