package SGestionAnteproyectos.dto;

import java.io.Serializable;

public class AsignadoDTO implements Serializable{
    private long idAnteproyecto;
    private long idEvaluador1;
    private long idEvaluador2;
    
    public AsignadoDTO(long idAnteproyecto, long idEvaluador1, long idEvaluador2) {
        this.idAnteproyecto = idAnteproyecto;
        this.idEvaluador1 = idEvaluador1;
        this.idEvaluador2 = idEvaluador2;
    }
    public long getIdAnteproyecto() {
        return idAnteproyecto;
    }
    public void setIdAnteproyecto(long idAnteproyecto) {
        this.idAnteproyecto = idAnteproyecto;
    }
    public long getIdEvaluador1() {
        return idEvaluador1;
    }
    public void setIdEvaluador1(long idEvaluador1) {
        this.idEvaluador1 = idEvaluador1;
    }
    public long getIdEvaluador2() {
        return idEvaluador2;
    }
    public void setIdEvaluador2(long idEvaluador2) {
        this.idEvaluador2 = idEvaluador2;
    }

    
}
