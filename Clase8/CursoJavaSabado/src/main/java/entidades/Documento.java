package entidades;

import enumerados.TiposDocumento;

public class Documento {

    //String tipoDocumento;
    private TiposDocumento tipoDocumento;
    private int nroDocumento;

    public Documento() {}

    public Documento(TiposDocumento tipoDocumento, int nroDocumento) {
        super();
        this.nroDocumento = nroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public TiposDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TiposDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    String mostrarValores() {
        return " tipoDocumento= " + tipoDocumento.getDescripcion() + ", numeroDocumento= " + nroDocumento;
    }
}
