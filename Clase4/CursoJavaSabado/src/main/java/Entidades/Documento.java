package Entidades;

public class Documento {

    String tipoDocumento;
    int nroDocumento;

    public Documento() {}

    public Documento(String tipoDocumento, int nroDocumento) {
        this.nroDocumento = nroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    String mostrarValores() {
        return " tipoDocumento= " + tipoDocumento + ", numeroDocumento= " + nroDocumento;
    }
}
