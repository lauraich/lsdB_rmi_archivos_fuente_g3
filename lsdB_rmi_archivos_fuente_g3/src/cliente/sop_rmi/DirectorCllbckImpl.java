package cliente.sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import SGestionAnteproyectos.dto.*;
import cliente.vistas.GUIDirector;

public class DirectorCllbckImpl extends UnicastRemoteObject implements DirectorCllbckInt {

    GUIDirector atrGui;

    public DirectorCllbckImpl(GUIDirector prmGui) throws RemoteException {
        atrGui = prmGui;
    }

    @Override
    public void informarNotificacion(AsignadoDTO objAsignado) throws RemoteException {
        atrGui.cargarAnteproyectos();
        atrGui.mostrarNotificacion("El Anteproyecto con id " + objAsignado.getIdAnteproyecto() + " fue aprobado por los evaluadores con id [" + objAsignado.getIdEvaluador1() + "] y [" + objAsignado.getIdEvaluador2() + "]");
    }
}
