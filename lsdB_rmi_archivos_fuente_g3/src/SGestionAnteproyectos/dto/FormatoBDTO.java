/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author juanf
 */
public class FormatoBDTO implements Serializable {

    private long atrCodigoAnteproyecto;
    private String atrConcepto;
    private String atrObservaciones;
    private Date atrFechaEvaluacion;
    private long atrIdEvaluador;

    public long getCodigoAnteproyecto() {
        return atrCodigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(long prmCodigoAnteproyecto) {
        this.atrCodigoAnteproyecto = prmCodigoAnteproyecto;
    }

    public String getConcepto() {
        return atrConcepto;
    }

    public void setAtrConcepto(String prmConcepto) {
        this.atrConcepto = prmConcepto;
    }

    public String getObservaciones() {
        return atrObservaciones;
    }

    public void setObservaciones(String prmObservaciones) {
        this.atrObservaciones = prmObservaciones;
    }

    public Date getFechaEvaluacion() {
        return atrFechaEvaluacion;
    }

    public void setFechaEvaluacion(Date prmFechaEvaluacion) {
        this.atrFechaEvaluacion = prmFechaEvaluacion;
    }

    public long getIdEvaluador() {
        return atrIdEvaluador;
    }

    public void setIdEvaluador(long prmIdEvaluador) {
        this.atrIdEvaluador = prmIdEvaluador;
    }

}
