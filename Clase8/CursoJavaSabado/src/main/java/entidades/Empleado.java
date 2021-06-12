package entidades;

import java.util.Date;

public abstract class Empleado extends Persona {

    private Date fechaCargo;
    private Float sueldo;

    public Empleado(String pNombre, String pApellido, Documento documento, Date pFechaNacimiento, Date fechaCargo, Float sueldo) {
        super(pNombre, pApellido, documento, pFechaNacimiento);
        this.fechaCargo = fechaCargo;
        this.sueldo = sueldo;
    }

    public Date getFechaCargo() {
        return fechaCargo;
    }

    public void setFechaCargo(Date fechaCargo) {
        this.fechaCargo = fechaCargo;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "Empleado [toString()=" + super.toString() + ", fechaCargo= " +
                fechaCargo + ", sueldo= " + sueldo + "]";
    }
}
