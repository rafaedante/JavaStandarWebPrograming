package ejercicio2;

public class Perro extends Animal{

    public Perro(String pNombre) {
        super(pNombre);
        System.out.println("Constructor Perro, nombre: " + pNombre);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Tipo Animal: Es un Perro");
    }

    @Override
    public void comunicarse() {
        System.out.println("Metodo de comunicarse: El perro ladra...Guau Guau");
    }
}
