/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.UsuarioDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanf
 */
public class GestionUsuariosImpl extends UnicastRemoteObject implements GestionUsuariosInt {

    List<UsuarioDTO> listaUsuarios;
    boolean existeDecano = false;

    public GestionUsuariosImpl() throws RemoteException {
        listaUsuarios = new ArrayList<>();
        UsuarioDTO objAdmin = new UsuarioDTO();
        objAdmin.setIdentificacion(1);
        objAdmin.setNombreCompleto("JUAN f CM");
        objAdmin.setUsuario("fernando");
        objAdmin.setPassword("123321");
        objAdmin.setRole("ADMIN");
        objAdmin.setDepartamento("Sistemas");
        listaUsuarios.add(objAdmin);
    }

    @Override
    public boolean registrarUsuario(UsuarioDTO prmUsuario) throws RemoteException {
        System.out.println("===desde registrarUsuario()===");
        try {
            if(existeDecano && prmUsuario.getRole().compareTo("DECANO")==0){
                return false;
            }
            if(prmUsuario.getRole().compareTo("DECANO")==0){
                existeDecano=true;
            }
            listaUsuarios.add(prmUsuario);
            System.out.println("===saliendo de registrarUsuario()...===");
            return true;
        } catch (Exception e) {
            System.out.println("===saliendo de registrarUsuario()...===");
            return false;
        }
    }

    @Override
    public boolean existeUsuario(String pmrUser) throws RemoteException {
        System.out.println("===desde existeUsuario()===");
        for (UsuarioDTO Usuario : listaUsuarios) {
            if (Usuario.getUsuario().compareTo(pmrUser) == 0) {
                System.out.println("======");
                return true;
            }
        }
        System.out.println("===Salieno existeUsuario()...===");
        return false;
    }

    @Override
    public boolean modificarUsuario(UsuarioDTO prmUsuario) throws RemoteException {
        System.out.println("===desde de ModificarUsuario()===");
        try {
            boolean encontro = false;
            for (int i = 0; i < listaUsuarios.size(); i++) {
                UsuarioDTO Usuario = listaUsuarios.get(i);
                if (Usuario.getIdentificacion() == prmUsuario.getIdentificacion()) {
                    listaUsuarios.remove(i);
                    listaUsuarios.add(prmUsuario);
                    encontro = true;
                    break;
                }
            }
            System.out.println("===Saliendo de ModificarUsuario()...===");
            return encontro;
        } catch (Exception e) {
            System.out.println("===Saliendo de ModificarUsuario()...===");
            return false;
        }

    }

    @Override
    public UsuarioDTO consultarUsuario(long prmIdentificacion) throws RemoteException {
        System.out.println("===desde ConsultarUsuarios()===");
        try {
            for (UsuarioDTO objUsuario : listaUsuarios) {
                if (objUsuario.getIdentificacion() == prmIdentificacion) {
                    System.out.println("===Saliendo de ConsultarUsuarios()...===");
                    return objUsuario;
                }
            }
        } catch (Exception e) {

        }
        System.out.println("===Saliendo de ConsultarUsuarios()...===");
        return null;
    }

    @Override
    public UsuarioDTO validarUsuario(String prmUsuario, String prmPassword) throws RemoteException {
        System.out.println("===desde validarUsuario()===");
        System.out.println("...Desde Validar Usuario: " + prmUsuario + "   " + prmPassword);
        for (UsuarioDTO objUsuario : listaUsuarios) {
            if (objUsuario.getUsuario().compareTo(prmUsuario) == 0 && objUsuario.getPassword().compareTo(prmPassword) == 0) {
                System.out.println("===Saliendo de validarUsuario()...===");
                return objUsuario;
            }
        }
        System.out.println("===Saliendo de validarUsuario()...===");
        return null;
    }

    @Override
    public List<UsuarioDTO> listarUsuarios() {
        System.out.println("===Desde Listar Usuarios()===");
        System.out.println("===Saleindo de listar Usuarios()...===");
        return listaUsuarios;
    }

    @Override
    public boolean existeDecano() throws RemoteException {
        return existeDecano;
    }
    
   
}
