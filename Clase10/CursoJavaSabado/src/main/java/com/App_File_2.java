package com;

import javax.swing.*;
import java.io.*;

public class App_File_2 {

    public static void main(String[] args) throws IOException {

        final String RUTA = "C:\\Users\\rafaeli\\Documents\\CursoSabadoJavaWebStandart\\Clase10\\archivoES\\salida\\destino.txt";

        //Instancia de archivo de salida
        File outputFile =  new File(RUTA);

        //Instancia de Filewriter que se encargara de escribir
        FileWriter out = new FileWriter(outputFile);

        // construir una cadena de texto
        String info = "Esta es una prueba de escritura de archivo";

        for(int i=0; i < info.length(); i++) {
            out.write(info.charAt(i));
        }

        out.close();

        System.out.println("El archivo ha sido escrito....");

    }





}
