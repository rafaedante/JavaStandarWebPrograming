package entidades;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona{

    private Date fechaIngreso;
    private int[] cursos;

    public Alumno(String pNombre, String pApellido, Documento documento, Date pFechaNacimiento,
                  Date fechaIngreso, int[] cursos) {
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

    public int[] getCursos() {
        return cursos;
    }

    public void setCursos(int[] cursos) {
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

    @Override
    public void guardar() {
        System.out.println("Se ha guardado correctamente el alumno");
    }

    @Override
    public void eliminar() {
        System.out.println("Se ha eliminado correctamente el alumno");
    }

    @Override
    public void modificar() {
        System.out.println("Se ha modificado correctamente el alumno");
    }
}
