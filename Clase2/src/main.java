import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        // definimos vectores de notas y nombres
        double[] notas_alumno;
        String[] nombres_alumnos;
        int cant_alumnos;

        // pedir al usuario cantida de notas
        System.out.print("ingrese la cantidad de notas a cargar: ");
        cant_alumnos = entrada.nextInt();

        notas_alumno = new double[cant_alumnos];
        nombres_alumnos = new String[cant_alumnos];

        for(int i = 0; i < cant_alumnos; i++) {

            System.out.print("Ingrese el nombre del alumno [" + (i + 1) + "]: ");
            nombres_alumnos[i] = entrada.next();

            System.out.print("Ingrese la nota del alumno [" + (i + 1) + "]: ");
            notas_alumno[i] = entrada.nextDouble();
        }

        System.out.println("-----------------------------------------");

        double promedio = 0, suma = 0, nota_mayor = notas_alumno[0], nota_menor=notas_alumno[0];
        int posicionMayor = 0, posicionMenor=0;

        for(int i = 0; i < cant_alumnos; i++) {

            //acumular la suma de las notas
            suma = suma + notas_alumno[i];

            //buscar nota mayor
            if(nota_mayor < notas_alumno[i]) {

                nota_mayor = notas_alumno[i];
                posicionMayor = i;
            }

            //buscar nota menor
            if(nota_menor > notas_alumno[i]) {

                nota_menor = notas_alumno[i];
                posicionMenor = i;
            }

        }

        promedio = (suma  / cant_alumnos);


        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("El alumno con la mejor nota es " + nombres_alumnos[posicionMayor] + " que obtuvo la nota: " + nota_mayor);

        System.out.println("El alumno con la menor nota es " + nombres_alumnos[posicionMenor] + " que obtuvo la nota: " + nota_menor);
    }
}
