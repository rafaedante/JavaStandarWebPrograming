package com;

import java.sql.*;

public class App_Base {

    public static void main(String[] args) {

        System.out.println("Pruebas de base de datos");

        // actualizamos registros
        //actualizar();

        // insertamos registros
        //insertar();

        // eliminar registros
        //eliminar();

        //consultar datos
        consultar();

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

    private static void actualizar() {
        try (Connection conexion = conectarBaseDeDatos()){
            String sql = "UPDATE autoFamiliar SET patenteActiva = 1 WHERE patenteActiva = 0";
            Statement query = conexion.createStatement();
            query.execute(sql);
            System.out.println("Se actualizaron los registros");
        }catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error -> : " + ex.getMessage());
        }
    }

    private static void insertar() {
        try {

            Connection conexion = conectarBaseDeDatos();
            String sql = "INSERT INTO autoFamiliar (patenteNumero, patenteActiva, marca, categoria, color) "
                    + "VALUES ('ABC-005', 0, 'AUDI', 'Audi-01', 'GRIS')";
            Statement query = conexion.createStatement();
            query.execute(sql);
            System.out.println("Se inserto un registro");



        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void eliminar() {
        try {
            Connection conexion = conectarBaseDeDatos();
            String sql = "DELETE FROM autoFamiliar WHERE patenteNumero = 'ABC-005' AND patenteActiva = 0";
            Statement query = conexion.createStatement();
            query.execute(sql);
            System.out.println("Se eliminan registros");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void consultar() {
        try{
            Connection conexion = conectarBaseDeDatos();
            String sql = "SELECT patenteNumero, patenteActiva, marca, categoria, color FROM autoFamiliar";
            Statement query = conexion.createStatement();
            ResultSet resultado = query.executeQuery(sql);

            while (resultado.next()) {
                System.out.println("----Inicio Registro Auto Familiar-----");
                System.out.println(resultado.getString("patenteNumero"));
                System.out.println(resultado.getBoolean("patenteActiva"));
                System.out.println(resultado.getString("marca"));
                System.out.println(resultado.getString("categoria"));
                System.out.println(resultado.getString("color"));
                System.out.println("----Fin Registro Auto Familiar-----");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
