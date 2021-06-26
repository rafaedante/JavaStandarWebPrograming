package entidades;

import java.util.Date;

public class Administrativo extends Empleado{


    public Administrativo(String pNombre, String pApellido, Documento documento, Date pFechaNacimiento, Date fechaCargo, Float sueldo) {
        super(pNombre, pApellido, documento, pFechaNacimiento, fechaCargo, sueldo);
    }


    @Override
    public String toString() {
        return "Administrativo{ + " +
                "toString()= " + super.toString() +
                " }";
    }

    @Override
    public String mostrarTipoPersona() {
        return getNombre() + " - " + getApellido() + " es Administrativo";
    }

    @Override
    public void guardar() {
        System.out.println("Se ha guardado correctamente el Administrativo");
    }

    @Override
    public void eliminar() {
        System.out.println("Se ha eliminado correctamente el Administrativo");
    }

    @Override
    public void modificar() {
        System.out.println("Se ha modificado correctamente el Administrativo");
    }
}
