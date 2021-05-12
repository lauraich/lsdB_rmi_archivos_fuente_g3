package cliente.sop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import SGestionAnteproyectos.dto.*;

public interface DirectorCllbckInt extends Remote {

    public void informarNotificacion(AsignadoDTO objAsignado) throws RemoteException;
}
