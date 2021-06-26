package com;

import comparadores.OrdenDocumento;
import entidades.*;
import enumerados.TiposDocumento;
import excepciones.ExcepcionPersona;
import interfaces.Constantes;
import interfaces.UtilidadesFecha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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

            String nombre;
            String apellido;
            TiposDocumento tipo;
            Integer numero;
            Date fechaNacimiento;
            Date fechaCargo;
            Float sueldo;

            Empleado empleado = null;

            System.out.println("Ingreso datos de administrativo");
            System.out.println();

            System.out.print("Ingrese nombre de la persona: ");
            nombre = teclado.next();
            System.out.print("Ingrese apellido de la persona: ");
            apellido = teclado.next();

            while (true) {
                System.out.print("Ingrese tipo de documento de la persona: ");
                try {
                    tipo = TiposDocumento.valueOf(teclado.next().toUpperCase());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("Ingrese numero de documento de la persona: ");
            numero = teclado.nextInt();
            System.out.print("Ingrese Fecha de nacimiento de la persona: ");
            fechaNacimiento = obtenerFecha2();

            System.out.print("Ingrese Fecha de cargo de la persona: ");
            fechaCargo = obtenerFecha2();
            System.out.print("Ingrese sueldo de la persona: ");
            sueldo = entrada.nextFloat();

            empleado = new Administrativo(nombre, apellido, new Documento(tipo, numero),
                    fechaNacimiento, fechaCargo, sueldo);


            insertar(empleado);
            entrada.close();
        } catch (InputMismatchException ex) {
            System.out.println("Ingreso un dato no valido");
        }
        catch (Exception ex) {
            System.out.println("Se genero un error: " + ex.toString());
        }

    }

    private static Date obtenerFecha2() {

        String fechaUsuario = "";
        Date fecha = null;

        while(true) {
            try {
                System.out.print("Formato fecha [dd/mm/yyyy]: ");
                fechaUsuario = teclado.next();
                fecha = UtilidadesFecha.getStringAFecha(fechaUsuario);
                break;
            } catch (ParseException e) {
                System.out.println("Debe ingresa un dato valido: " + e.getMessage());
            }
        }

        return fecha;
    }


    private static Connection conectarBaseDeDatos() throws SQLException {
        Connection conexion = null;
        try {
            String driver = "org.mariadb.jdbc.Driver";
            String url = "jdbc:mariadb://localhost:3306/javasabado";
            String usuario = "root";
            String clave = "";

            Class.forName(driver);

            //Crear la conexion
            conexion = DriverManager.getConnection(url, usuario, clave);

        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    private  static void insertar(Empleado empleado) {

        try {
            Connection conexion = conectarBaseDeDatos();
            String sql = "INSERT INTO empleados (TipoDocumento, NumeroDocumento, Nombre, Apellido, FechaNacimiento, " +
                    " FechaCargo, sueldo, Tipo) VALUES " +
                    "('" + empleado.getDocumento().getTipoDocumento() + "',"
                    + empleado.getDocumento().getNroDocumento()  + ", '" + empleado.getNombre() + "' , '"
                    + empleado.getApellido() + "', '"
                    + UtilidadesFecha.getFechaAStringSQL(empleado.getFechaNacimiento()) + "', '"
                    + UtilidadesFecha.getFechaAStringSQL(empleado.getFechaCargo()) + "', "
                    + empleado.getSueldo() + "," + 4 + ")";
            Statement query = conexion.createStatement();
            query.execute(sql);
            System.out.println("Se agrego registro");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
