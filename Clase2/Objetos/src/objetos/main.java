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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona juan = new Persona();
        juan.nombre = "juan";
        juan.apellido = "torres";
        juan.sexo = "M";
        juan.edad = 30;
        juan.mostrarDatos(1);
        
        Persona ana = new Persona();
        ana.nombre = "ana";
        ana.apellido = "diaz";
        ana.sexo = "F";
        ana.edad = 32;
        ana.mostrarDatos(2);
        
        Persona luis = new Persona();
        luis.nombre = "luis";
        luis.apellido = "lopez";        
        luis.edad = 35;
        luis.mostrarDatos(3);
        
        Persona rafa = new Persona("rafa", "ibarra", "M", 35);
        rafa.mostrarDatos(0);
        rafa.mostrarDatos("informacion 1", "hoy es sabado");
        
        Persona sofia = new Persona("sofia", "lopez");
        sofia.mostrarDatos(6);
        sofia.mostrarDatos("hola", "soy sofia");
    }
    
}
