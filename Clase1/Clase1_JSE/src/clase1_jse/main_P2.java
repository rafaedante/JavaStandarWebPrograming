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
public class main_P2 {
    
    public static void main(String[] args) {
        
        //operador if
        
        /*
        continuamos programando
        en java
        clase 1
        */
        
        int condicion = 3;
        if (condicion == 3) {
            System.out.println("La variable condicion es igual a 3");
        }
        
//        if (condicion == 3) 
//          System.out.println("La variable condicion es igual a 3 - sin llaves");
        
        if (condicion == 4) {
            System.out.println("La variable condicion es igual a 3");
        } else {
            System.out.println("La variable condicion NO es igual a 3");
        }   
        
        // CONDICIONES ANIDADAS
        String clima = "bueno", plata = "si";
        
        if (clima == "bueno") {
            if (plata == "no") {
                System.out.println("ponete la bata porque hoy no salimos no hay plata");
            }
            else {
                System.out.println("Vamos que salimos!!!!");
            }
        }else {
            System.out.println("ponete la bata porque hoy no salimos el clima esta malo");
        }
        
        
        // switch
        int mi_variable = 12;
        
        switch (mi_variable) {        
            case 10:
                System.out.println("El valor es 10");
                break;
            case 11:
                System.out.println("El valor es 11");
                break;
            case 12:
                System.out.println("El valor es 12");
                break;
            case 13:
                System.out.println("El valor es 13");
                break;
            default:
                System.out.println("El valor es otro");
        }  
        
        
        //Ejercicio 2
    // dado las siguientes variables
    // nro1 = 100, nro2 = 500, nro3 = 250
    // informar cual es el mayor
    
    int nro1 = 1000;
    int nro2 = 50;
    int nro3 = 250;

    if(nro1 > nro2){
        if(nro1 > nro3){
            System.out.println("Numero 1 es mayor");
        }else {
            System.out.println("Numero 3 es mayor");
        }
    } else {
         if(nro2 > nro3){
            System.out.println("Numero 2 es mayor");
        }else {
            System.out.println("Numero 3 es mayor");
        }    
    }
        
    
  }
    
    
    
}


