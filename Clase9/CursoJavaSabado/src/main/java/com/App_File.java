package com;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class App_File {

    public static void main(String[] args) {

        String ruta = JOptionPane.showInputDialog("Introduce la ruta del archivo");
        String texto = JOptionPane.showInputDialog("Introduce el texto que quieres escribir en el archivo");
        escribirArchivo(ruta, texto);

        mostrarArchivo(ruta);

    }

    public static void escribirArchivo(String nombreArchivo, String texto) {
        try (FileWriter archivo = new FileWriter(nombreArchivo);) {

            // Escribimos el texto en el fichero
            archivo.write(texto);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + e);
        }
    }

    public static void mostrarArchivo(String nombreArchivo) {

        System.out.println("El contenido de: " + nombreArchivo + " es: ");
        // Leemos texto del fichero
        try (FileReader fr = new FileReader(nombreArchivo)) {

            int caracter = fr.read();

            while (caracter != -1) {

                System.out.print((char) caracter);
                caracter = fr.read();
            }

        } catch (IOException e) {
            System.out.println("Problema con la lectura en el archivo " + e);
        }

    }

}
