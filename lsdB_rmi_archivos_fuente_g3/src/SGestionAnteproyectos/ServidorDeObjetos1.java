/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos;

import SGestionAnteproyectos.sop_rmi.GestionUsuariosImpl;
import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosImpl;
import SGestionAnteproyectos.utilidades.*;
import SGestionAnteproyectos.vistas.GUIConectarServidor1;
import java.rmi.RemoteException;

/**
 *
 * @author juanf
 */
public class ServidorDeObjetos1 {
    private String direccionNS;
    private int numPuertoNS;
    public static void main(String args[]) {
        GUIConectarServidor1 vistaS = new GUIConectarServidor1();
        vistaS.setVisible(true);

    }
    public ServidorDeObjetos1(String prmDireccionIpNS, int prmPuertoNS) throws RemoteException{
        this.direccionNS = prmDireccionIpNS;
        this.numPuertoNS = prmPuertoNS;
        //conectar();
    }
    
    public void conectar() throws RemoteException{
        GestionUsuariosImpl objRemoto2 = new GestionUsuariosImpl();
        //GestionAnteproyectosImpl objRemoto2=new GestionAnteproyectosImpl();
        GestionAnteproyectosImpl objRemoto = new GestionAnteproyectosImpl();
        objRemoto.consultarReferenciaRemota(direccionNS, numPuertoNS);
        //GestionUsuariosImpl objRemoto2 = new GestionUsuariosImpl();
        try
        {
           //UtilidadesRegistroS.arrancarNS(direccionNS,numPuertoNS);
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto2, direccionNS, numPuertoNS, "ObjGestionUsuarios");
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionNS, numPuertoNS, "ObjGestionAnteproyectos");
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        }
    }
}
