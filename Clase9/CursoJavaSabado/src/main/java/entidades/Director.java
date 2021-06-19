package entidades;

import java.util.Date;

public class Director extends Empleado{

    private String carrera;

    public Director(String pNombre, String pApellido, Documento documento, Date pFechaNacimiento, Date fechaCargo,
                    Float sueldo, String carrera) {
        super(pNombre, pApellido, documento, pFechaNacimiento, fechaCargo, sueldo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String mostrarTipoPersona() {
        return getNombre() + " - " + getApellido() + " es Director";
    }

    @Override
    public String toString() {
        return "Director{" +
                "toString()= " + super.toString() +
                "carrera='" + carrera + '\'' +
                '}';
    }

    @Override
    public void guardar() {
        System.out.println("Se ha guardado correctamente el Director");
    }

    @Override
    public void eliminar() {
        System.out.println("Se ha eliminado correctamente el Director");
    }

    @Override
    public void modificar() {
        System.out.println("Se ha modificado correctamente el Director");
    }
}
