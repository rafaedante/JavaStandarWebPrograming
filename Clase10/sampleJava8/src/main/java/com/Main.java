package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main( String[] args ) {
        Saludo saludo1 = (str) -> "Buen dia " + str + "!!!";
        Saludo saludo2 = (str) -> "Buenas tardes " + str + "!!!";

        System.out.println(saludo1.saluda("Juan"));
        System.out.println(saludo2.saluda("Ana"));

        Calculadora cal = (a, b) -> a + b;
        System.out.println(cal.suma(10, 25));

        ArrayList<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona("Pablo"));
        lista.add(new Persona("Juan"));
        lista.add(new Persona("Elsa"));
        lista.add(new Persona("Sofia"));

        Collections.sort(lista, (Persona p1, Persona p2) -> p1.getNombre().compareTo(p2.getNombre()));

        for (Persona p : lista) {
            System.out.println(p.getNombre());
        }
    }
}
