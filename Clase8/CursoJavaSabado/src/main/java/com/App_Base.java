package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App_Base {

    public static void main(String[] args) {

        System.out.println("Pruebas de base de datos");
        actualizar();

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
            String sql = "UPDATE autoFamiliar SET patenteActiva = 0 WHERE patenteActiva = 1";
            Statement query = conexion.createStatement();
            query.execute(sql);
            System.out.println("Se actualizaron los registros");
        }catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error -> : " + ex.getMessage());
        }
    }
}
