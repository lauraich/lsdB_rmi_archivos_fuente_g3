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
public class AnteproyectoDTO implements Serializable {

    private long atrCodigoAnteproyecto;
    private FormatoADTO atrFormatoA;
    private FormatoBDTO atrFormatoB1;
    private FormatoBDTO atrFormatoB2;
    private FormatoCDTO atrFormatoC;
    private FormatoDDTO atrFormatoD;

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

    public void setFormatoB2(FormatoBDTO prmFormatoB) {
        this.atrFormatoB2 = prmFormatoB;
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

    public long getCodigoAnteproyecto() {
        return atrCodigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(long prmCodigoAnteproyecto) {
        this.atrCodigoAnteproyecto = prmCodigoAnteproyecto;
    }

}
