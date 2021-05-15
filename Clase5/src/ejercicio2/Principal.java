package ejercicio2;

public class Principal {

    public static void main(String[] args) {

        Animal animal = new Perro("tommy") ;
        animal.tipoAnimal();
        animal.comunicarse();
        System.out.println();

        Perro perro = new Perro("hercules");
        perro.tipoAnimal();
        System.out.println();

        Animal animal1 = new Gato("luna");
        animal1.tipoAnimal();
        animal1.comunicarse();
        System.out.println();

        // array de colecciones
        System.out.println("---ARRAY----");
        Animal animales[] = {new Perro("simon"), new Perro("paco"), new Perro("chiqui")};
        for(Animal a : animales) {
            a.tipoAnimal();
            a.comunicarse();
        }

    }
}
