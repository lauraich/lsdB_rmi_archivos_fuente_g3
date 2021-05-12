package SGestionAnteproyectos.dto;

import java.io.Serializable;

import cliente.sop_rmi.DirectorCllbckInt;

public class RegistroDTO implements Serializable {

    private long idAnteproyecto;
    private long idDirector;
    private DirectorCllbckInt referenciaDirector;

    public RegistroDTO(long idAnteproyecto, long idEvaluador, DirectorCllbckInt referenciaEvaluador) {
        this.idAnteproyecto = idAnteproyecto;
        this.idDirector = idEvaluador;
        this.referenciaDirector = referenciaEvaluador;
    }

    public long getIdAnteproyecto() {
        return idAnteproyecto;
    }

    public void setIdAnteproyecto(long idAnteproyecto) {
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
