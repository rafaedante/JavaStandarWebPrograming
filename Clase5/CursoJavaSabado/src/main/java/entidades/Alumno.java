package entidades;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona{

    private Date fechaIngreso;
    private String[] cursos;

    public Alumno(String pNombre, String pApellido, Documento documento, Date pFechaNacimiento,
                  Date fechaIngreso, String[] cursos) {
        super(pNombre, pApellido, documento, pFechaNacimiento);
        this.fechaIngreso = fechaIngreso;
        this.cursos = cursos;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "toString()= " + super.toString() +
                "fechaIngreso=" + fechaIngreso +
                ", cursos=" + Arrays.toString(cursos) +
                '}';
    }

    @Override
    public String mostrarTipoPersona() {
        return getNombre() + " - " + getApellido() + " es Alumno";
    }
}
