/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.sop_rmi;

import java.rmi.RemoteException;

/**
 *
 * @author Laura
 */
public interface GestionNotificacion {
    public boolean enviarNotificacion()throws RemoteException;
}
