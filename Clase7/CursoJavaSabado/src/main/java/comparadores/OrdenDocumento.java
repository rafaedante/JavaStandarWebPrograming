package comparadores;

import entidades.Persona;

import java.util.Comparator;

public class OrdenDocumento implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        int tipo = persona1.getDocumento().getTipoDocumento().toString()
                .compareTo(persona2.getDocumento().getTipoDocumento().toString());

        if(tipo == 0) {
            return persona1.getDocumento().getNroDocumento() - persona2.getDocumento().getNroDocumento();
        }

        return tipo;
    }
}
