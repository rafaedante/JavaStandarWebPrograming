package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );

        List<String> languages = Arrays.asList("Java", "Php", "Python", "C++", "Solidity", "VisualBasic");
        System.out.println("Languages which starts with P");
        filter(languages, (str) -> ((String)str).startsWith("P"));

        System.out.println("Languages whose length greater than 4");
        filter(languages, (str) -> ((String)str).length() > 4);
    }

    public static void filter(List<String> names, Predicate condition) {

        for(String name : names) {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }

    }

}
