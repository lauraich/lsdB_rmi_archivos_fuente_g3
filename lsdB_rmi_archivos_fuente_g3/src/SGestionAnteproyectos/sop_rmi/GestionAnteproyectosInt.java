/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author juanf
 */
public interface GestionAnteproyectosInt extends Remote {

    public long generarCodigo() throws RemoteException;

    public boolean registrarFormatoA(FormatoADTO prmFormato) throws RemoteException;

    public boolean registrarFormatoB(FormatoBDTO prmFormato) throws RemoteException;

    public boolean registrarFormatoC(FormatoCDTO prmFormato) throws RemoteException;

    public boolean registrarFormatoD(FormatoDDTO prmFormato) throws RemoteException;

    public List<FormatoBDTO> consultarFormatosEvaluador(long prmIdEvaluador) throws RemoteException;

    public List<FormatoADTO> consultarFormatoA() throws RemoteException;

    public List<FormatoBDTO> consultarFormatoB() throws RemoteException;

    public List<FormatoCDTO> consultarFormatoC() throws RemoteException;

    public List<FormatoDDTO> consultarFormatoD() throws RemoteException;

    public boolean eliminarAnteproyecto(long prmCodigoAnteproyecto) throws RemoteException;

    public void registrarCallback(RegistroDTO prmRegistro) throws RemoteException;

}
