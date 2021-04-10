/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_jse;

/**
 *
 * @author rafaeli
 */
public class main_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        System.out.print("JAVA SE");
        System.out.println(1);
        
        int nro1;
        nro1 = 12;
        
        int b = 5;
        
        int q = 4, s= 10, p = 3;
        
        int a = 10;
        a = 12;
        a = 5;       
        
        int c = a + b;
        a = 4;
        int d = 100 + a;
        
        System.out.print("VARIABLE A = ");
        System.out.println(a);
        System.out.print("VARIABLE B = ");
        System.out.println(b);
        System.out.print("VARIABLE C = ");
        System.out.println(c);
        System.out.print("VARIABLE D = ");
        System.out.println(d);
        
        System.out.println("----------------");
        
        System.out.println("A + B = " + (a + b));
        
        // Ejercicio 1
        // Declaras 2 variables numericas (con el valor que deseen)
        // mostrar x consola la suma, resta, multiplicacion , division y modulo
        //(resto de la division)
        
        System.out.println("------------Ejercicio 1----------");
        
        int num1=10, num2=5;
        
        int suma1 = num1 + num2;
        
        System.out.println("Variable num1: " + num1);
        System.out.println("Variable num2: " + num2);
        System.out.println("------------------------------");
        System.out.println("Operaciones entre num1 y num2:");
        System.out.println(" Suma: " + suma1);
        System.out.println(" Resta: " + (num1 - num2));
        System.out.println(" División: " + (num1 / num2));
        System.out.println(" Multiplicación: " + (num1 * num2));
        System.out.println(" Módulo: " + (num1 % num2));
        
        System.out.println("------------Ejercicio 1 otra forma----------");
        //Declaración de 2 Variables Númericas
        int A ;
        A = 95;
        
        int B = 5;
        //B = 5;
        
        int suma;
        suma = A + B;        
        System.out.print("Resultado SUMA =  ");
        System.out.println(suma);
        
        int resta;
        resta = A - B;        
        System.out.println("Resultado RESTA =  ");
        System.out.println(resta);
        
        int multip;
        multip = A * B;        
        System.out.println("Resultado Multiplicación =  ");
        System.out.println(multip);
        
        int div; 
        div = A/B;        
        System.out.println("Resultado Division =  ");
        System.out.println(div);               
        
    }
    
}
