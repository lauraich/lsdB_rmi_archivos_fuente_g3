/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class FormatoDDTO implements Serializable {

    private long atrCodigoAnteproyecto;
    private String atrEstructura;
    String atrConceptoCoordinador;
    String atrObservaciones;

    public FormatoDDTO(long atrCodigoAnteproyecto, String atrEstructura, String atrConceptoCoordinador, String atrObservaciones) {
        this.atrCodigoAnteproyecto = atrCodigoAnteproyecto;
        this.atrEstructura = atrEstructura;
        this.atrConceptoCoordinador = atrConceptoCoordinador;
        this.atrObservaciones = atrObservaciones;
    }

    public long getCodigoAnteproyecto() {
        return atrCodigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(long prmCodigoAnteproyecto) {
        this.atrCodigoAnteproyecto = prmCodigoAnteproyecto;
    }

    public String getEstructura() {
        return atrEstructura;
    }

    public void setEstructura(String prmEstructura) {
        this.atrEstructura = prmEstructura;
    }

    public String getConceptoCoordinador() {
        return atrConceptoCoordinador;
    }

    public void setConceptoCoordinador(String prmConceptoCoordinador) {
        this.atrConceptoCoordinador = prmConceptoCoordinador;
    }

    public String getObservaciones() {
        return atrObservaciones;
    }

    public void setObservaciones(String prmObservaciones) {
        this.atrObservaciones = prmObservaciones;
    }

}
