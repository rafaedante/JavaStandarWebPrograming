package ejercicio2;

public abstract class Animal implements IAnimal{

    private String nombre;

    public Animal(String pNombre) {
        this.nombre = pNombre;
        System.out.println("Constructor Animal, nombre del animal: " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void tipoAnimal();
}
