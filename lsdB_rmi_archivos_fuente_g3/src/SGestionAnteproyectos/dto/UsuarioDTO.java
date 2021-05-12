/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class UsuarioDTO implements Serializable {

    private long atrIdentificacion;
    private String atrNombreCompleto;
    private String atrRole;
    private String atrDepartamento;
    private String atrUsuario;
    private String atrPassword;

    public UsuarioDTO() {
    }

    public UsuarioDTO(long atrIdentificacion, String atrNombreCompleto, String atrRole, String atrDepartamento, String atrUsuario, String atrPassword) {
        this.atrIdentificacion = atrIdentificacion;
        this.atrNombreCompleto = atrNombreCompleto;
        this.atrRole = atrRole;
        this.atrDepartamento = atrDepartamento;
        this.atrUsuario = atrUsuario;
        this.atrPassword = atrPassword;
    }

    public long getIdentificacion() {
        return atrIdentificacion;
    }

    public void setIdentificacion(long prmIdentificacion) {
        this.atrIdentificacion = prmIdentificacion;
    }

    public String getNombreCompleto() {
        return atrNombreCompleto;
    }

    public void setNombreCompleto(String prmNombreCompleto) {
        this.atrNombreCompleto = prmNombreCompleto;
    }

    public String getRole() {
        return atrRole;
    }

    public void setRole(String prmRole) {
        this.atrRole = prmRole;
    }

    public String getDepartamento() {
        return atrDepartamento;
    }

    public void setDepartamento(String prmDepartamento) {
        this.atrDepartamento = prmDepartamento;
    }

    public String getUsuario() {
        return atrUsuario;
    }

    public void setUsuario(String prmUsuario) {
        this.atrUsuario = prmUsuario;
    }

    public String getPassword() {
        return atrPassword;
    }

    public void setPassword(String prmPassword) {
        this.atrPassword = prmPassword;
    }

}
