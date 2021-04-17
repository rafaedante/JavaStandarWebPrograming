/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_ej1;

/**
 *
 * @author rafaeli
 */
public class main2 {
    
    public static void main(String[] args) {
    
        // Vectores
        
        String[] nombres = new String[4];
        int[] numeros = new int[4];
        
        String miNombre = "Rafael";
        
        nombres[0] = "Carlos";
        numeros[0] = 1;
        nombres[1] = miNombre;
        numeros[1] = 12;
        nombres[2] = "Sofia";
        numeros[2] = 10;
        nombres[3] = "Ana";
        numeros[3] = 16;
        
        System.out.println("Numero posicion 2: " + numeros[2] + " Nombre en posicion 3: " + nombres[3]);
        System.out.println("-----------------------------");
        for(int a = 0; a < nombres.length; a++) {
            System.out.println("Numero posicion " + a + ": " + numeros[a] + " - Nombre en posicion " + a + ": " + nombres[a]);
        }
        
        System.out.println("----------Segunda parte------------------");
        int[] vec = {3,10, 5, 2, 3, 10, 30, 23, 20, 10, 10, 5, 20, 15, 35, 1};
        
        System.out.println(vec[1]);
        
        System.out.println("----------Buscar Maximo y minimo y cantidad de 10------------------");
        //Buscar el numero maximo y minimo en el vector
        //Contar cuantas veces aparece el numero 10
        int maximo = vec[0], minimo=vec[0], contador = 0;
        for(int x=0; x < vec.length; x++) {
            if(vec[x] > maximo) {
                maximo = vec[x];
            }
            
            if(vec[x] < minimo) {
                minimo = vec[x];
            }
            
            if(vec[x] == 10) {
                contador++;
            }
        }
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);
        System.out.println("El numero 10 aparece: " + contador + " veces.");
        
         System.out.println("----------Ejercicio ------------------");
         // dado el vector numeros = {11, -22, 33, -44, 55, -66, 77, -88, 99}
         //crear 2 vectores, en donde en uno se debe guardar los elementos positivos
         // y en el otro los elementos negativos
         // 1- imprimir todos los numeros
         // 2- imprimir los numeros negativos
         // 3- imprimir los numeros positivos
         // por ultimo mostrar el resultado de la suma de los elementos positivos mas negativos
         
        int[] vecNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
        int[] vecPositivos = new int[10];
        int[] vecNegativos = new int[10];
        int indicePositivo = 0;
        int indiceNegativo = 0;
        int totalPositivos = 0;
        int totalNegativos = 0;
        
        for(int i=0; i < vecNumeros.length; i++) {
        
            if(vecNumeros[i] < 0) {
                vecNegativos[indiceNegativo] = vecNumeros[i];
                indiceNegativo++;
                totalNegativos = totalNegativos + vecNumeros[i];
                System.out.println("Total Negativo parcial: " + totalNegativos);
            } else {
                vecPositivos[indicePositivo] = vecNumeros[i];
                indicePositivo++;
                totalPositivos += vecNumeros[i];
                System.out.println("Total Positivo parcial: " + totalPositivos);
            }
        }
        
        System.out.println("Todos los numeros");
        for(int i=0; i < vecNumeros.length; i++) {
            System.out.print(vecNumeros[i] + " ");
        }
        
        System.out.println();
        System.out.println("numeros positivos");
        for(int i=0; i < indicePositivo; i++) {
            System.out.print(vecPositivos[i] + " ");
        }
        
        System.out.println();
        System.out.println("numeros negativos");
        for(int i=0; i < indiceNegativo; i++) {
            System.out.print(vecNegativos[i] + " ");
        }
    
        System.out.println();
        System.out.println("Total Negativo: " + totalNegativos);
        System.out.println("Total Positivo: " + totalPositivos);
        System.out.println("Suma de positivos mas negativos: " + (totalPositivos + totalNegativos ));
    }
    
}
