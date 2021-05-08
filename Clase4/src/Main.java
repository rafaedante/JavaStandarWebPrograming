import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        //matriz cuadrada 4*4
        int matriz[][] = new int[4][4];

        //variables a utilizar
        boolean salir = false;
        int opcion, fila, columna;

        //variable para manejar si hemos ejecutado la opcion 1
        boolean rellenado = false;

        // Menu
        do {
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar Fila");
            System.out.println("3. Sumar Columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Media de los elementos");
            System.out.println("7. salir");
            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    rellenarMatriz(sc, matriz);
                    rellenado = true;
                    break;
                case 2:
                    if(rellenado) {

                        //validamos fila
                        do {
                            System.out.println("Elija una fila: ");
                            fila = sc.nextInt();
                        } while(!(fila >=0 && fila < matriz.length));

                        //ejecutamos la operacion
                        System.out.println("La suma de los valores de la fila " + fila
                                + " es: " + sumarFila(matriz, fila));

                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if(rellenado) {

                        //validamos columna
                        do {
                            System.out.println("Elija una columna: ");
                            columna = sc.nextInt();
                        } while(!(columna >=0 && columna < matriz.length));

                        //ejecutamos la operacion
                        System.out.println("La suma de los valores de la columna " + columna
                                + " es: " + sumarColumna(matriz, columna));

                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    if(rellenado) {
                        System.out.println("la suma de los elementos de la diagonal principal es: "
                                + sumaDiagonalPrincipal(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 5:
                    if(rellenado) {
                        System.out.println("la suma de los elementos de la diagonal inversa es: "
                                + sumaDiagonalInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 7:
                    salir = true;
                    break;
            }


        } while (!salir);

        System.out.println("Fin programa");
    }

    public static void rellenarMatriz(Scanner sc, int [][] matriz) {

        for(int i=0; i < matriz.length; i++) {

            for(int j=0; j < matriz[0].length; j++) {
                System.out.println("Escriba un numero en la posicion " + i + " " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static int sumarFila(int [][] matriz, int fila) {
        int suma = 0;

        for (int j = 0; j < matriz.length; j++) {
            suma = suma + matriz[fila][j];
        }

        return suma;
    }

    public static int sumarColumna(int [][] matriz, int columna) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma = suma + matriz[i][columna];
        }

        return suma;
    }

    public static int sumaDiagonalPrincipal(int [][] matriz) {
        int suma = 0;

        for (int i = 0, j= 0; i < matriz.length; i++, j++) {
            suma += matriz[i][j];
        }

        return suma;
    }

    public static int sumaDiagonalInversa(int [][] matriz) {
        int suma = 0;

        for (int i =0, j = 3; i < matriz.length; i++, j--) {
            suma += matriz[i][j];
        }

        return suma;
    }

    public static double media(int [][] matriz) {
        double suma = 0, media = 0;

        for(int i=0; i < matriz.length; i++) {

            for(int j=0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }

        media = suma / (matriz[0].length * matriz[1].length);
        return media;
    }
}
