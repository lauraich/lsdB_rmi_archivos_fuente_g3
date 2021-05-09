
package SSeguimientoAnteProyectos.dto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Laura
 */
public class ResolucionDTO implements Serializable{
    private String atrCodigoResolucion;
    private long atrCodigoAnteproyecto;
    private LocalDate atrFecha;

    public ResolucionDTO(String atrCodigoResolucion, long atrCodigoAnteproyecto, LocalDate atrFecha) {
        this.atrCodigoResolucion = atrCodigoResolucion;
        this.atrCodigoAnteproyecto = atrCodigoAnteproyecto;
        this.atrFecha = atrFecha;
    }

    public String getAtrCodigo() {
        return atrCodigoResolucion;
    }

    public void setAtrCodigo(String atrCodigo) {
        this.atrCodigoResolucion = atrCodigo;
    }

    public long getAtrCodigoAnteproyecto() {
        return atrCodigoAnteproyecto;
    }

    public void setAtrCodigoAnteproyecto(long atrCodigoAnteproyecto) {
        this.atrCodigoAnteproyecto = atrCodigoAnteproyecto;
    }

    public LocalDate getAtrFecha() {
        return atrFecha;
    }

    public void setAtrFecha(LocalDate atrFecha) {
        this.atrFecha = atrFecha;
    }
    
    
}
