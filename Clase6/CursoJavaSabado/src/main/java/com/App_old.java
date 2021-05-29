package com;

import entidades.Alumno;
import entidades.Documento;
import entidades.Profesor;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App_old
{

    private  static  Scanner teclado = new Scanner(System.in);

    public static void main( String[] args )
    {
        try {
            Scanner entrada = new Scanner(System.in);
            Alumno[] alumnos;
            Profesor[] profesores;

            System.out.println("Ingreso datos de personas");
            System.out.println();

            System.out.print("Ingrese la cantidad de personas que cargara: ");
            int cantidadPersonas = entrada.nextInt();
            alumnos = new Alumno[cantidadPersonas];
            profesores = new Profesor[cantidadPersonas];

            // carga de datos
            for (int i=0; i<cantidadPersonas; i++) {
                System.out.println("Ingrese tipo de persona -> 1: si es alumno o 2: si es Profesor");
                int tipoPersona = entrada.nextInt();
                if (tipoPersona == 1) {
                    // logica para agregar alumno
                    alumnos[i] = agregarAlumno(i);
                } else if (tipoPersona == 2) {
                    // logica para agregar profesor
                    profesores[i] = agregarProfesor(i);
                }
            }

            //mostrar datos
            for (int i=0; i<cantidadPersonas; i++) {
                if (alumnos[i] != null) {
                    System.out.println(alumnos[i]);
                    System.out.println(alumnos[i].mostrarTipoPersona());
                } else {
                    System.out.println(profesores[i]);
                    System.out.println(profesores[i].mostrarTipoPersona());
                }
            }

            entrada.close();
        } catch (InputMismatchException ex) {
            System.out.println("Ingreso un dato no valido");
        }
        catch (Exception ex) {
            System.out.println("Se genero un error: " + ex.toString());
        }

    }

    private static Profesor agregarProfesor(int indice) {
        System.out.print("Ingrese nombre del profesor [" + (indice + 1) + "]: ");
        String nombre = teclado.next();
        System.out.print("Ingrese apellido del profesor [" + (indice + 1) + "]: ");
        String apellido = teclado.next();
        System.out.print("Ingrese tipo de documento del profesor [" + (indice + 1) + "]: ");
        String tipo = teclado.next();
        System.out.print("Ingrese numero de documento del profesor [" + (indice + 1) + "]: ");
        Integer numero = teclado.nextInt();
        System.out.print("Ingrese Fecha de nacimiento del profesor [" + (indice + 1) + "]: ");
        Date fechaNacimiento = obtenerFecha();

        System.out.print("Ingrese Fecha cargo del profesor [" + (indice + 1) + "]: ");
        Date fechaCargo = obtenerFecha();
        System.out.print("Ingrese sueldo del profesor [" + (indice + 1) + "]: ");
        Float sueldo = teclado.nextFloat();

        System.out.print("Ingrese la cantidad de cursos del profesor [" + (indice + 1) + "]: ");
        int cantidadCursos = teclado.nextInt();
        String[] cursos = agregarCursos(cantidadCursos);

        Profesor profesor = new Profesor
                (nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo, sueldo, cursos);

        return profesor;
    }

    private static Alumno agregarAlumno(int indice) {
        System.out.print("Ingrese nombre del alumno [" + (indice + 1) + "]: ");
        String nombre = teclado.next();
        System.out.print("Ingrese apellido del alumno [" + (indice + 1) + "]: ");
        String apellido = teclado.next();
        System.out.print("Ingrese tipo de documento del alumno [" + (indice + 1) + "]: ");
        String tipo = teclado.next();
        System.out.print("Ingrese numero de documento del alumno [" + (indice + 1) + "]: ");
        Integer numero = teclado.nextInt();
        System.out.print("Ingrese Fecha de nacimiento del alumno [" + (indice + 1) + "]: ");
        Date fechaNacimiento = obtenerFecha(); // armar fecha

        System.out.print("Ingrese Fecha de ingreso del alumno [" + (indice + 1) + "]: ");
        Date fechaIngreso = obtenerFecha();
        System.out.print("Ingrese la cantidad de cursos del alumno [" + (indice + 1) + "]: ");
        int cantidadCursos = teclado.nextInt();
        String[] cursos = agregarCursos(cantidadCursos);

        Alumno alumno = new Alumno(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaIngreso, cursos);
        return alumno;
    }

    private static Date obtenerFecha() {
        System.out.print("Ingrese el año: ");
        int anio = teclado.nextInt();
        System.out.print("Ingrese el mes en numero, ej: 1 que indica enero, 12 que indica diciembre: ");
        int mes = teclado.nextInt();
        System.out.print("Ingrese el dia: ");
        int dia = teclado.nextInt();
        return new Date(anio - 1900, mes - 1, dia);
    }

    private static String[] agregarCursos(int cantidad) {
        String[] cursos = new String[cantidad];

        for(int i=0; i< cursos.length; i++) {
            System.out.print("Ingrese el curso [" + ( i + 1) + "]: ");
            cursos[i] = teclado.next();
        }
        return cursos;
    }
}

