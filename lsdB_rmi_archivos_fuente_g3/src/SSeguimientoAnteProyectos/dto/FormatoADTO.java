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
 * @author juanf
 */
public class FormatoADTO implements Serializable{
    private long atrCodigoAnteproyecto;
    String atrNombrePrograma;
    String atrTituloAnteproyecto;
    long atrIdEstudiante1;
    long atrIdEstudiante2;
    String atrNomEstudiante1;
    String atrNomEstudiante2;
    String atrNombreDirector;
    String atrNombreCoDirector;
    String atrObjetivos;

    public String getNombrePrograma() {
        return atrNombrePrograma;
    }

    public void setNombrePrograma(String prmNombrePrograma) {
        this.atrNombrePrograma = prmNombrePrograma;
    }

    public String getTituloAnteproyecto() {
        return atrTituloAnteproyecto;
    }

    public void setTituloAnteproyecto(String prmTituloAnteproyecto) {
        this.atrTituloAnteproyecto = prmTituloAnteproyecto;
    }

    public long getIdEstudiante1() {
        return atrIdEstudiante1;
    }

    public void setIdEstudiante1(long prmIdEstudiante1) {
        this.atrIdEstudiante1 = prmIdEstudiante1;
    }

    public long getIdEstudiante2() {
        return atrIdEstudiante2;
    }

    public void setIdEstudiante2(long atrIdEstudiante2) {
        this.atrIdEstudiante2 = atrIdEstudiante2;
    }

    public String getNomEstudiante1() {
        return atrNomEstudiante1;
    }

    public void setNomEstudiante1(String atrNomEstudiante1) {
        this.atrNomEstudiante1 = atrNomEstudiante1;
    }

    public String getNomEstudiante2() {
        return atrNomEstudiante2;
    }

    public void setNomEstudiante2(String atrNomEstudiante2) {
        this.atrNomEstudiante2 = atrNomEstudiante2;
    }

    public long getCodigoAnteproyecto() {
        return atrCodigoAnteproyecto;
    }

    public void setCodigoAnteproyecto(long atrCodigoAnteproyecto) {
        this.atrCodigoAnteproyecto = atrCodigoAnteproyecto;
    }

    public String getNombreDirector() {
        return atrNombreDirector;
    }

    public void setNombreDirector(String prmNombreDirector) {
        this.atrNombreDirector = prmNombreDirector;
    }

    public String getNombreCoDirector() {
        return atrNombreCoDirector;
    }

    public void setNombreCoDirector(String prmNombreCoDirector) {
        this.atrNombreCoDirector = prmNombreCoDirector;
    }

    public String getObjetivos() {
        return atrObjetivos;
    }

    public void setObjetivos(String prmObjetivos) {
        this.atrObjetivos = prmObjetivos;
    }
    
}
