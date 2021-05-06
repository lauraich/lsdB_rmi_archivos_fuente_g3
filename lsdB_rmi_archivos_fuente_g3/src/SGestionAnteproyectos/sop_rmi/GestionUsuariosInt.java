/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;
import SGestionAnteproyectos.dto.UsuarioDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author juanf
 */
public interface GestionUsuariosInt extends Remote{
    public boolean registrarUsuario(UsuarioDTO prmUsuario)throws RemoteException;
    public boolean modificarUsuario(UsuarioDTO prmUsuario)throws RemoteException;
    public UsuarioDTO consultarUsuario(long prmIdentificacion)throws RemoteException;
    public UsuarioDTO validarUsuario(String prmUsuario, String prmPassword)throws RemoteException;
    public List<UsuarioDTO> listarUsuarios()throws RemoteException;
    public boolean existeUsuario(String pmrUser)throws RemoteException;
}
