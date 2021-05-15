package ejercicio2;

public class Gato extends Animal{

    public Gato(String pNombre) {
        super(pNombre);
        System.out.println("Constructot Gato, nombre: " + pNombre);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Tipo Animal: Es un Gato");
    }

    @Override
    public void comunicarse() {
        System.out.println("Metodo de comunicarse: El gato maulla...Miau Miau");
    }
}
