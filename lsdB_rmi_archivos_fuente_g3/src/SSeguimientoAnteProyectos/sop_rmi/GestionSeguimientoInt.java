package SSeguimientoAnteProyectos.sop_rmi;

import SGestionAnteproyectos.dto.AnteproyectoDTO;
import java.rmi.Remote;
import SSeguimientoAnteProyectos.dto.ResolucionDTO;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface GestionSeguimientoInt extends Remote {

    public ResolucionDTO generarResolucion(long prmCodigoAnteproyecto) throws RemoteException;

    public boolean registrarHistorial(AnteproyectoDTO prmAnteproyecto) throws RemoteException;

    public List<AnteproyectoDTO> consultarHistorial() throws RemoteException;

    public List<ResolucionDTO> consultarAprobados() throws RemoteException;
}
