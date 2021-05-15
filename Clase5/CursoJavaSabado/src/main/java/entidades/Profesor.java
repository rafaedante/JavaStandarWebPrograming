package entidades;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado{

    private String[] cursos;

    public Profesor(String pNombre, String pApellido, Documento documento, Date pFechaNacimiento, Date fechaCargo, Float sueldo, String[] cursos) {
        super(pNombre, pApellido, documento, pFechaNacimiento, fechaCargo, sueldo);
        this.cursos = cursos;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
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
}
