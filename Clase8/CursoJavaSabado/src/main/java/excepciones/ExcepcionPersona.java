package excepciones;

import interfaces.Constantes;

import java.util.Arrays;

public class ExcepcionPersona extends Exception {

    private Integer codigo;

    public ExcepcionPersona(Integer codigo) {
        super();
        this.codigo = codigo;
    }

    public ExcepcionPersona(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        switch (codigo) {
            case 1:
                return "Los tipos de documentos validos son: " + Arrays.toString(Constantes.tipoDocumento);
            default:
                return super.getMessage();
        }

    }
}
