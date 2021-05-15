package ejercicio1;

public class Principal {

    public static void main(String[] args) {
        Empleado e = new Empleado("Orlando Fuentes", "123456",23,true, 2000);
        Programador p = new Programador("Ana Perez", "234567", 36,
                false, 3000, 100, "java");

        p.AumentarSalario(0.25);
        System.out.println("Datos del programador");
        p.ImprimirEmpleado();

        System.out.println();
        System.out.println("Datos del empleado");
        e.ImprimirEmpleado();
    }
}
