package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Hello world!
 *
 */


public class App_Map {


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Cordoba");
        map.put(2, "Santa Fe");
        map.put(3, "San Juan");
        map.put(4, "Buenos Aires");
        map.put(5, "Mendoza");

        // Imprimimos el map con un Iterator
        Iterator it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
    }

}

