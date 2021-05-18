package SGestionAnteproyectos.dto;

import java.io.Serializable;

import cliente.sop_rmi.DirectorCllbckInt;
import java.util.ArrayList;
import java.util.List;

public class RegistroDTO implements Serializable {

    private List idAnteproyecto;
    private long idDirector;
    private DirectorCllbckInt referenciaDirector;
    private boolean sesion;

    public RegistroDTO(List idAnteproyecto, long idEvaluador, DirectorCllbckInt referenciaEvaluador, boolean Sesion) {
        this.idAnteproyecto = idAnteproyecto;
        this.idDirector = idEvaluador;
        this.referenciaDirector = referenciaEvaluador;
        this.sesion=Sesion;
    }

    public boolean getSesion() {
        return sesion;
    }

    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }
    
    public List getIdAnteproyecto() {
        return idAnteproyecto;
    }

    public void setIdAnteproyecto(List idAnteproyecto) {
        this.idAnteproyecto = idAnteproyecto;
    }

    public long getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(long idDirector) {
        this.idDirector = idDirector;
    }

    public DirectorCllbckInt getReferenciaDirector() {
        return referenciaDirector;
    }

    public void setReferenciaDirector(DirectorCllbckInt referenciaDirector) {
        this.referenciaDirector = referenciaDirector;
    }

}
