package interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface UtilidadesFecha {

    final String PATRON_FECHA = "dd/MM/yyyyy";
    final String PATRON_FECHA_SQL = "yyyy-MM-dd";
    final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat(PATRON_FECHA);
    final SimpleDateFormat FORMATO_FECHA_SQL = new SimpleDateFormat(PATRON_FECHA_SQL);

    static String getFechaAString(Date fecha) {
        return FORMATO_FECHA.format(fecha);
    }

    static Date getStringAFecha(String fecha) throws ParseException {
        return FORMATO_FECHA.parse(fecha);
    }

    static String getFechaAStringSQL(Date fecha) {
        return FORMATO_FECHA_SQL.format(fecha);
    }
}
