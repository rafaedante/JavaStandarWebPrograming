package com;

import comparadores.OrdenDocumento;
import entidades.*;
import enumerados.TiposDocumento;
import excepciones.ExcepcionPersona;
import interfaces.Constantes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    private  static  Scanner teclado = new Scanner(System.in);

    public static void main( String[] args )
    {
        try {
            Scanner entrada = new Scanner(System.in);

            //Persona[] personas;
            Set<Persona> personas = new HashSet<>();
            List<Persona> listaPersonas = new ArrayList<Persona>();

            System.out.println("Ingreso datos de personas");
            System.out.println();

            System.out.print("Ingrese la cantidad de personas que se cargara: ");
            int cantidadPersonas = entrada.nextInt();
            //personas = new Persona[cantidadPersonas];


            for(int i=0; i< cantidadPersonas; i++) {
                String nombre;
                String apellido;
                TiposDocumento tipo;
                Integer numero;
                Date fechaNacimiento;
                Date fechaIngreso;
                Date fechaCargo;
                Float sueldo;
                String carrera;
                int cantidadCursos;

                System.out.println("Ingrese tipo de persona:");
                System.out.println("1 - Alumno");
                System.out.println("2 - Director");
                System.out.println("3 - Profesor");
                System.out.println("4 - Administrativo");
                System.out.println();
                int tipoPersona = entrada.nextInt();

                Persona persona = null;

                System.out.print("Ingrese nombre de la persona [" + (i + 1) + "]: ");
                nombre = teclado.next();
                System.out.print("Ingrese apellido de la persona [" + (i + 1) + "]: ");
                apellido = teclado.next();

                while (true) {
                    System.out.print("Ingrese tipo de documento de la persona [" + (i + 1) + "]: ");
                    try {
                        tipo = TiposDocumento.valueOf(teclado.next().toUpperCase());
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    /*
                    try{

                        boolean documentoCorrecto = false;
                        for (int j=0; j < Constantes.tipoDocumento.length; j++) {
                            if(tipo.equalsIgnoreCase(Constantes.tipoDocumento[j])) {
                                documentoCorrecto = true;
                                break;
                            }
                        }
                        if(!documentoCorrecto)
                            throw new ExcepcionPersona(1);
                        else
                            break;

                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    */

                }

                System.out.print("Ingrese numero de documento de la persona [" + (i + 1) + "]: ");
                numero = teclado.nextInt();
                System.out.print("Ingrese Fecha de nacimiento de la persona [" + (i + 1) + "]: ");
                fechaNacimiento = obtenerFecha2();

                switch (tipoPersona) {
                    case 1: //alumno
                        System.out.print("Ingrese Fecha de ingreso de la persona [" + (i + 1) + "]: ");
                        fechaIngreso = obtenerFecha();
                        System.out.print("Ingrese la cantidad de cursos de la persona [" + (i + 1) + "]: ");
                        cantidadCursos = entrada.nextInt();

                        persona = new Alumno(nombre, apellido, new Documento(tipo, numero),
                                fechaNacimiento, fechaIngreso, agregarCursos(cantidadCursos));
                        break;

                    case 2:
                        System.out.print("Ingrese Fecha de cargo de la persona [" + (i + 1) + "]: ");
                        fechaCargo = obtenerFecha();
                        System.out.print("Ingrese sueldo de la persona [" + (i + 1) + "]: ");
                        sueldo = entrada.nextFloat();
                        System.out.print("Ingrese la carrera de la persona [" + (i + 1) + "]: ");
                        carrera = entrada.next();

                        persona = new Director(nombre, apellido, new Documento(tipo, numero),
                                fechaNacimiento,fechaCargo,sueldo,carrera);
                        break;

                    case 3:
                        System.out.print("Ingrese Fecha de cargo de la persona [" + (i + 1) + "]: ");
                        fechaCargo = obtenerFecha();
                        System.out.print("Ingrese sueldo de la persona [" + (i + 1) + "]: ");
                        sueldo = entrada.nextFloat();
                        System.out.print("Ingrese la cantidad de cursos de la persona [" + (i + 1) + "]: ");
                        cantidadCursos = entrada.nextInt();

                        persona = new Profesor(nombre, apellido, new Documento(tipo, numero),
                                fechaNacimiento,fechaCargo,sueldo,agregarCursos(cantidadCursos));
                        break;

                    case 4:
                        System.out.print("Ingrese Fecha de cargo de la persona [" + (i + 1) + "]: ");
                        fechaCargo = obtenerFecha();
                        System.out.print("Ingrese sueldo de la persona [" + (i + 1) + "]: ");
                        sueldo = entrada.nextFloat();

                        persona = new Administrativo(nombre, apellido, new Documento(tipo, numero),
                                fechaNacimiento, fechaCargo, sueldo);

                        break;
                }

                //personas[i] = persona;
                personas.add(persona);

            }

            // mostramos las personas
            for(Persona persona : personas) {
                System.out.println(persona);
                System.out.println(persona.mostrarTipoPersona());
            }

            // coleccion para proceder a ordenarla
            listaPersonas.addAll(personas);
            listaPersonas.sort(new OrdenDocumento());

            System.out.println();
            System.out.println("personas ordenadas");
            for(Persona persona : listaPersonas) {
                System.out.println(persona);
            }


            entrada.close();
        } catch (InputMismatchException ex) {
            System.out.println("Ingreso un dato no valido");
        }
        catch (Exception ex) {
            System.out.println("Se genero un error: " + ex.toString());
        }

    }


    private static Date obtenerFecha() {

        int anio = 0;
        int mes = 0;
        int dia = 0;
        while (true) {
            try {
                System.out.print("Ingrese el año: ");
                anio = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("debe ingresar un dato valido");
                teclado.next();
                continue;
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el mes en numero, ej: 1 que indica enero, 12 que indica diciembre: ");
                mes = teclado.nextInt();
                if (mes < 1 || mes > 12) {
                    throw new Exception("los meses deben estar comprendidos entre 1 y 12");
                }
                break;
            } catch (Exception e) {
                System.out.println("debe ingresar un dato valido: " + e.getMessage());
                teclado.nextLine();
                continue;
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el dia: ");
                dia = teclado.nextInt();
                if (dia < 1) {
                    throw new Exception("los dias deben ser un numero positivo");
                } else {
                    if (mes == 2) {
                        if (dia > 28) {
                            throw new Exception("el mes 2 posee un maximo de 28 dias");
                        }
                    } else if ((dia > 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
                        throw new Exception("los dias para estos meses debe estar comprendidos entre 1 y 30");
                    } else if ((dia > 31)) {
                        throw new Exception("los dias para estos meses debe estar comprendidos entre 1 y 31");
                    }
                }

                break;
            } catch (Exception e) {
                System.out.println("debe ingresar un dato valido: " + e.getMessage());
                teclado.nextLine();
                continue;
            }
        }

        return new Date(anio - 1900, mes - 1, dia);
    }

    private static Date obtenerFecha2() {
        final String PATRON = "dd/mm/yyyyy";
        final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat(PATRON);

        String fechaUsuario = "";
        Date fecha = null;

        while(true) {
            try {
                System.out.print("Formato fecha [dd/mm/yyyy]: ");
                fechaUsuario = teclado.next();
                fecha = FORMATO_FECHA.parse(fechaUsuario);
                break;
            } catch (ParseException e) {
                System.out.println("Debe ingresa un dato valido: " + e.getMessage());
            }
        }

        return fecha;
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

