/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.dto;

import SGestionAnteproyectos.dto.*;
import java.io.Serializable;

/**
 *
 * @author Laura
 */
public class AnteproyectoDTO implements Serializable{
  private long atrCodigoAnteproyecto;
    private FormatoADTO atrFormatoA;
    private FormatoBDTO atrFormatoB1;
    private FormatoBDTO atrFormatoB2;
    private FormatoCDTO atrFormatoC;
    private FormatoDDTO atrFormatoD;

    public AnteproyectoDTO(long atrCodigoAnteproyecto, SSeguimientoAnteproyectos.dto.FormatoADTO atrFormatoA, SSeguimientoAnteproyectos.dto.FormatoBDTO atrFormatoB1, SSeguimientoAnteproyectos.dto.FormatoBDTO atrFormatoB2, SSeguimientoAnteproyectos.dto.FormatoCDTO atrFormatoC, SSeguimientoAnteproyectos.dto.FormatoDDTO atrFormatoD) {
        this.atrCodigoAnteproyecto = atrCodigoAnteproyecto;
        this.atrFormatoA = atrFormatoA;
        this.atrFormatoB1 = atrFormatoB1;
        this.atrFormatoB2 = atrFormatoB2;
        this.atrFormatoC = atrFormatoC;
        this.atrFormatoD = atrFormatoD;
    }
    
    

    public long getCodigoAnteproyecto() {
        return atrCodigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(long atrCodigoAnteproyecto) {
        this.atrCodigoAnteproyecto = atrCodigoAnteproyecto;
    }

    public FormatoADTO getFormatoA() {
        return atrFormatoA;
    }

    public void setFormatoA(FormatoADTO prmFormatoA) {
        this.atrFormatoA = prmFormatoA;
    }

    public FormatoBDTO getFormatoB1() {
        return atrFormatoB1;
    }

    public void setFormatoB1(FormatoBDTO prmFormatoB) {
        this.atrFormatoB1 = prmFormatoB;
    }

    public FormatoBDTO getFormatoB2() {
        return atrFormatoB2;
    }

    public void setFormatoB2(FormatoBDTO atrFormatoB2) {
        this.atrFormatoB2 = atrFormatoB2;
    }

    public FormatoCDTO getFormatoC() {
        return atrFormatoC;
    }

    public void setFormatoC(FormatoCDTO prmFormatoC) {
        this.atrFormatoC = prmFormatoC;
    }

    public FormatoDDTO getFormatoD() {
        return atrFormatoD;
    }

    public void setFormatoD(FormatoDDTO prmFormatoD) {
        this.atrFormatoD = prmFormatoD;
    }
}
