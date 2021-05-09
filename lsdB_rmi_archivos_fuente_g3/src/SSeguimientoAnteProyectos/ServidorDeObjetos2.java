package SSeguimientoAnteProyectos;

import SSeguimientoAnteProyectos.utilidades.UtilidadesRegistroS;
import SSeguimientoAnteProyectos.sop_rmi.GestionSeguimientoImpl;
import SSeguimientoAnteProyectos.vistas.GUIConectarServidor2;
import java.rmi.RemoteException;
/**
 *
 * @author Laura
 */
public class ServidorDeObjetos2 {
    private String direccionNS;
    private int numPuertoNS;
    public static void main(String args[]) {
        GUIConectarServidor2 vistaS = new GUIConectarServidor2();
        vistaS.setVisible(true);
    }
    public ServidorDeObjetos2(String direccionIpNS, int puertoNS) throws RemoteException{
        this.direccionNS = direccionIpNS;
        this.numPuertoNS = puertoNS;
        //conectar();
    }
    
    public void conectar() throws RemoteException{
        GestionSeguimientoImpl objRemoto = new GestionSeguimientoImpl();
        try
        {
           UtilidadesRegistroS.arrancarNS(direccionNS,numPuertoNS);
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionNS, numPuertoNS, "ObjSeguimientoAnteproyectos");
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        }
    }
}
