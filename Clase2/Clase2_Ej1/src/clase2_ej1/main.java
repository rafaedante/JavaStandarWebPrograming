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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int a =1; a<=10; a++) {
            
            if( a == 6) {
                //break;
                continue;
            }
        
            if(a%2==0) {
                System.out.println(a);
            }
        }
        System.out.println("Fin del ciclo for");
        
        //Recorrer una cadena
        System.out.println("-----------------------------");
        String frase = "Hola hoy es sabado";
        for(int i=0; i < frase.length(); i++) {
            
            char caracter = frase.charAt(i);
            
            if ((caracter == 'h') || (caracter == 'H')) {
                //continue;
                break;
            }
            
            System.out.println(caracter);
        }
        System.out.println("Fin del ciclo for de cadenas");
        
        System.out.println("----------WHILE-------------------");
        
        int b = 0;
        while (b < 10){
            System.out.println(b);
            b++;
        }
        System.out.println("Fin del ciclo while");
        System.out.println(b);
        
        
        //usar while
        //imprimir los numeros del 1 al 10 salteando de a 2, uno abajo del otro
    
        System.out.println("-----ejercicio 1-------------");
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i+=2;
            //i = i +2 
        }
        
        //imprimir los numeros del 1 al 30
        // sin imprimir numeros entre el 10 y el 20
        // imprimir uno abajo del otro
        System.out.println("-----ejercicio 2-------------");
        /*
        int x=0;
        while(x<=30)
        {
            if(x==11){x=21;}
            System.out.println("Numero:"+x);
            x++;
        }
        */
        
        /*
        int c=1;
        while (c<=30){
           if(c>=10 && c<=20){
               c++;
               continue;
           }
           System.out.println(c);
           c++;
       }
        */
        
        /*
        for (int j = 1; j <= 30; j++) {
            if(j>=10 && j<=20){
                continue;
            }
            System.out.println(j);
        }
        */
        
        int x = 1;
        while( (x <= 30) ) {
            
            if ( (x < 10) || (x > 20) )
                System.out.println(x);
            
            x++;
        }




        
    }   
}
