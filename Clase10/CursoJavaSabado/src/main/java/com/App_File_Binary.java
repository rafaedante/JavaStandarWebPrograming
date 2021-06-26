package com;

import javax.swing.*;
import java.io.*;

public class App_File_Binary {

    public static void main(String[] args) {

        final String RUTA = "C:\\Users\\rafaeli\\Documents\\CursoSabadoJavaWebStandart\\Clase10\\vehiculos.ddr";

        String matricula = JOptionPane.showInputDialog("Introduce la matricula");
        String marca = JOptionPane.showInputDialog("Introduce la marca");
        String modelo = JOptionPane.showInputDialog("Introduce el modelo");
        String texto_Deposito = JOptionPane.showInputDialog("Introduce el tamaño del deposito");
        double tamañoDeposito = Double.parseDouble(texto_Deposito);

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(RUTA, true));
            DataInputStream dis = new DataInputStream(new FileInputStream(RUTA))) {

            introducirDatos(dos, matricula, marca, modelo, tamañoDeposito);
            mostrarDatos(dis);

        }catch (EOFException ex) {

        }
        catch(IOException ex) {
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void introducirDatos(DataOutputStream dos,
                                       String matricula,
                                       String marca,
                                       String modelo,
                                       double deposito) throws IOException{

        dos.writeUTF(matricula);
        dos.writeUTF(marca);
        dos.writeUTF(modelo);
        dos.writeDouble(deposito);

    }

    public static void mostrarDatos(DataInputStream dis) throws IOException{
        //Cuando se termine la lectura saltara la excepcion
        while(true) {
            JOptionPane.showMessageDialog(null, "El vehiculo tiene una matricula " + dis.readUTF() +
                    ", su marca es " + dis.readUTF() + ", el modelo es " + dis.readUTF() +
                    "y su capacidad de litros de tanque es " + dis.readDouble());
        }
    }



}
