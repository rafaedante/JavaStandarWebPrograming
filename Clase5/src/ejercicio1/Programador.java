package ejercicio1;

public class Programador extends Empleado{

    int lineasDeCodigoPorHora;
    String lenguajeDominante;

    public Programador() {}

    public Programador(String pNombre, String pCedula, int pEdad,
                       boolean pCasado, double pSalario, int pLineasDeCodigoPorHora,
                       String pLenguajeDominante) {

        super(pNombre, pCedula, pEdad, pCasado, pSalario);
        this.lineasDeCodigoPorHora = pLineasDeCodigoPorHora;
        this.lenguajeDominante = pLenguajeDominante;
    }

    public void ImprimirEmpleado() {
        super.ImprimirEmpleado();
        System.out.println(this.lineasDeCodigoPorHora);
        System.out.println(this.lenguajeDominante);
    }
}
