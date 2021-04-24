package com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        Persona p1 = new Persona("Pablo", "Nuñez", "DNI", 30304344, 30);
        
        p1.mostrarDatos();
        
        //p1.nombre = "juan";
        p1.setNombre("juan");
        String nombreActual = p1.getNombre();
         System.out.println("----------");
        System.out.println(nombreActual);
        System.out.println("----------");
        p1.mostrarDatos();
    }
}

