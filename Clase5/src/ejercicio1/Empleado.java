package ejercicio1;

public class Empleado {

    String nombre;
    String cedula;
    int edad;
    boolean casado;
    double salario;

    public Empleado() {}

    public  Empleado(String pNombre, String pCedula, int pEdad, boolean pCasado, double pSalario) {
        this.nombre = pNombre;
        this.cedula = pCedula;
        this.edad = pEdad;
        this.casado = pCasado;
        this.salario = pSalario;
    }

    public String Clasificacion() {

        String c = "";
        if (edad <= 21) {
            c = "Principiante";
        }
        else if ((edad >= 22) && (edad <=35)) {
            c = "Intermedio";
        }
        else {
            c = "Senior";
        }

        return c;
    }

    public void ImprimirEmpleado() {
        System.out.println(this.nombre);
        System.out.println(this.cedula);
        System.out.println(this.edad);
        if(casado)
            System.out.println("Casado");
        else
            System.out.println("Soltero");
        System.out.println(this.salario);
        System.out.println("Clasificacion: " + Clasificacion());
    }

    public void AumentarSalario(double pIncremento) {
        salario = salario * (1 + pIncremento);
    }

}
