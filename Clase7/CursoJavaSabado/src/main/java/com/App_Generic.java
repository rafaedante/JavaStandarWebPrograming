package com;

/**
 * Hello world!
 *
 */

class Gen<T> {
    // T es el parametro de tipo generico
    // se declara un objeto de tipo T
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    //muestra el tipo de T
    void mostrarTipo() {
        System.out.println("El tipo de T es: " + ob.getClass().getName());
    }
}

public class App_Generic {


    public static void main(String[] args) {

        System.out.println("Prueba Generico");

        //Crea una referencia Gen para Integers
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(28);
        iOb.mostrarTipo();

        int v = iOb.getOb();
        System.out.println("El valor de v: " + v);
        System.out.println();

        //Crea referencia para String
        Gen<String> strOb = new Gen<String>("Prueba de genericos");
        strOb.mostrarTipo();

        String str = strOb.getOb();
        System.out.println("El valor de str: " + str);

    }

}

