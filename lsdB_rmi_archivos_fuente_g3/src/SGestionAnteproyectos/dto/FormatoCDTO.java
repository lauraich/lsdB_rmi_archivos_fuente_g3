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
public class FormatoCDTO implements Serializable {

    private long atrCodigoAnteproyecto;
    private String atrConcepto1;
    private String atrConcepto2;
    private String atrEstructura;
    private String atrConceptoDepto;
    private String atrObservaciones;

    public long getCodigoAnteproyecto() {
        return atrCodigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(long prmCodigoAnteproyecto) {
        this.atrCodigoAnteproyecto = prmCodigoAnteproyecto;
    }

    public String getConcepto1() {
        return atrConcepto1;
    }

    public void setConcepto1(String prmConcepto1) {
        this.atrConcepto1 = prmConcepto1;
    }

    public String getConcepto2() {
        return atrConcepto2;
    }

    public void setConcepto2(String prmConcepto2) {
        this.atrConcepto2 = prmConcepto2;
    }

    public String getEstructura() {
        return atrEstructura;
    }

    public void setEstructura(String prmEstructura) {
        this.atrEstructura = prmEstructura;
    }

    public String getConceptoDepto() {
        return atrConceptoDepto;
    }

    public void setConceptoDepto(String prmConceptoDepto) {
        this.atrConceptoDepto = prmConceptoDepto;
    }

    public String getObservaciones() {
        return atrObservaciones;
    }

    public void setObservaciones(String prmObservaciones) {
        this.atrObservaciones = prmObservaciones;
    }

}
