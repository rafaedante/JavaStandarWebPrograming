package entidades;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado{

    private int[] cursos;

    public Profesor(String pNombre, String pApellido, Documento documento, Date pFechaNacimiento, Date fechaCargo, Float sueldo, int[] cursos) {
        super(pNombre, pApellido, documento, pFechaNacimiento, fechaCargo, sueldo);
        this.cursos = cursos;
    }

    public int[] getCursos() {
        return cursos;
    }

    public void setCursos(int[] cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "toString()= " + super.toString() +
                "cursos=" + Arrays.toString(cursos) +
                '}';
    }

    @Override
    public String mostrarTipoPersona() {
        return getNombre() + " - " + getApellido() + " es Profesor";
    }

    @Override
    public void guardar() {
        System.out.println("Se ha guardado correctamente el Profesor");
    }

    @Override
    public void eliminar() {
        System.out.println("Se ha eliminado correctamente el Profesor");
    }

    @Override
    public void modificar() {
        System.out.println("Se ha modificado correctamente el Profesor");
    }
}
