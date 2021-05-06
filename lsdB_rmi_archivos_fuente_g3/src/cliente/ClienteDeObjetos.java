/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import SGestionAnteproyectos.sop_rmi.GestionAnteproyectosInt;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosInt;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoInt;
import cliente.utilidades.UtilidadesConsola;
import cliente.utilidades.UtilidadesRegistroC;
import cliente.vistas.GUIConectarCliente;
import java.rmi.RemoteException;

/**
 *
 * @author Laura
 */
public class ClienteDeObjetos {

    private int numPuertoNS = 0;
    private String direccionNS = "";
    private GestionUsuariosInt objRemotoUsuarios;
    private GestionAnteproyectosInt objRemotoAnteproyectos;
    private GestionSeguimientoInt objRemotoSeguimiento;
    private static ClienteDeObjetos atrInstancia;

    private ClienteDeObjetos() throws RemoteException {

    }

    public static void main(String args[]) {
        GUIConectarCliente vistaCliente = new GUIConectarCliente();
        vistaCliente.setVisible(true);

    }

    public static ClienteDeObjetos getInstancia() throws RemoteException {
        if (atrInstancia == null) {
            atrInstancia = new ClienteDeObjetos();
        }
        return atrInstancia;
    }

    public void conectar() throws RemoteException {
        objRemotoUsuarios = (GestionUsuariosInt) UtilidadesRegistroC.obtenerObjRemoto(direccionNS, numPuertoNS,
                "ObjGestionUsuarios");

        objRemotoAnteproyectos = (GestionAnteproyectosInt) UtilidadesRegistroC.obtenerObjRemoto(direccionNS, numPuertoNS,
                "ObjGestionAnteproyectos");

        objRemotoSeguimiento = (GestionSeguimientoInt) UtilidadesRegistroC.obtenerObjRemoto(direccionNS, numPuertoNS,
                "ObjSeguimientoAnteproyectos");
    }

    public int getNumPuertoNS() {
        return numPuertoNS;
    }

    public void setNumPuertoNS(int numPuertoNS) {
        this.numPuertoNS = numPuertoNS;
    }

    public String getDireccionNS() {
        return direccionNS;
    }

    public void setDireccionNS(String direccionNS) {
        this.direccionNS = direccionNS;
    }

    public GestionUsuariosInt getObjRemotoUsuarios() {
        return objRemotoUsuarios;
    }

    public GestionAnteproyectosInt getObjRemotoAnteproyectos() {
        return objRemotoAnteproyectos;
    }

    public GestionSeguimientoInt getObjRemotoSeguimiento() {
        return objRemotoSeguimiento;
    }

    public void setObjRemotoSeguimiento(GestionSeguimientoInt objRemotoSeguimiento) {
        this.objRemotoSeguimiento = objRemotoSeguimiento;
    }

}
