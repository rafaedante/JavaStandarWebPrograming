package com;

import Entidades.Documento;
import Entidades.Persona;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner(System.in);
        Persona[] personas;

        int cantidadPersonas;

        System.out.println("Carga de datos de Persona");
        System.out.print("Ingrese la cantidad de personas a cargar: ");
        cantidadPersonas = entrada.nextInt();
        personas = new Persona[cantidadPersonas];

        //Pedir los datos
        for(int i=0; i < personas.length; i++) {
            System.out.print("Ingrese el nombre de la persona[" + (i) + "]: ");
            String nombre = entrada.next();
            System.out.print("Ingrese el apellido de la persona[" + (i) + "]: ");
            String apellido = entrada.next();
            System.out.print("Ingrese el tipo de documento de la persona[" + (i) + "]: ");
            String tipoDocumento = entrada.next();
            System.out.print("Ingrese el numero de documento de la persona[" + (i) + "]: ");
            int numeroDocumento = entrada.nextInt();
            System.out.print("Ingrese la edad de la persona[" + (i) + "]: ");
            int edad = entrada.nextInt();

            Documento documento = new Documento(tipoDocumento, numeroDocumento);
            Persona personaAux = new Persona(nombre, apellido, documento, edad);
            personas[i] = personaAux;
            System.out.println();
            /*
            personas = [A, B, C]
            * */
        }

        System.out.println("Datos de las personas ingresadas");
        for(int i=0; i < personas.length; i++) {
            System.out.println(personas[i].mostrarDatos());
        }
    }
}

// agregar personas a una lista
// pedira al usuario nombre, apellido, tipo y nro doc, edad
// tipo doc y nro doc crear una clase para esos datos
// mostrar los datos

// crear un paquete para almacena las clases