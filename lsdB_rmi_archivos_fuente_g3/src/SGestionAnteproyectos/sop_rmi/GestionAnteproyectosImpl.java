/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.AnteproyectoDTO;
import SGestionAnteproyectos.dto.AsignadoDTO;
import SGestionAnteproyectos.dto.FormatoADTO;
import SGestionAnteproyectos.dto.FormatoBDTO;
import SGestionAnteproyectos.dto.FormatoCDTO;
import SGestionAnteproyectos.dto.FormatoDDTO;
import SGestionAnteproyectos.dto.RegistroDTO;
import SGestionAnteproyectos.utilidades.UtilidadesRegistroC;
import SSeguimientoAnteProyectos.sop_rmi.GestionSeguimientoInt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author juanf
 */
public class GestionAnteproyectosImpl extends UnicastRemoteObject implements GestionAnteproyectosInt {

    private static int secuencial = 0;
    List<AnteproyectoDTO> listaAnteproyectos;
    List<AnteproyectoDTO> listAnteproyectosNoApro;
    List<AnteproyectoDTO> listNoRemitidos;
    private GestionSeguimientoInt objReferenciaRemotaSeguimiento;
    private static List<RegistroDTO> atrDirectores;

    public GestionAnteproyectosImpl() throws RemoteException {
        listaAnteproyectos = new ArrayList<>();
        listAnteproyectosNoApro = new ArrayList<>();
        atrDirectores = new ArrayList<>();
        listNoRemitidos = new ArrayList<>();
    }

    @Override
    public long generarCodigo() throws RemoteException {
        System.out.println("===Desde Generar Codigo===");
        Calendar objCalendar = Calendar.getInstance();
        long varCodigo = objCalendar.get(Calendar.YEAR);
        int aux = 1;
        int mm = objCalendar.get(Calendar.MONTH);
        if (mm > 6) {
            aux = 2;
        }
        varCodigo = varCodigo * 10;
        varCodigo = varCodigo + aux;
        varCodigo = varCodigo * 1000;
        varCodigo = varCodigo + secuencial;
        secuencial = secuencial + 1;
        System.out.println("===Saliendo de generarCodigo()...===");
        return varCodigo;
    }

    @Override
    public boolean registrarFormatoA(FormatoADTO prmFormato) throws RemoteException {
        System.out.println("===Desde registrar Formato A===");
        try {
            for (int i = 0; i < listaAnteproyectos.size(); i++) {
                AnteproyectoDTO objAnteproyecto = listaAnteproyectos.get(i);
                if (objAnteproyecto.getCodigoAnteproyecto() == prmFormato.getCodigoAnteproyecto()) {
                    objAnteproyecto.setFormatoA(prmFormato);
                    System.out.println("===saliendo de RegistrarFormatoA()...===");
                    return true;
                }
            }
            AnteproyectoDTO objAnteproyecto = new AnteproyectoDTO();
            objAnteproyecto.setCodigoAnteproyecto(prmFormato.getCodigoAnteproyecto());
            objAnteproyecto.setFormatoA(prmFormato);
            listaAnteproyectos.add(objAnteproyecto);
            System.out.println("===saliendo de RegistrarFormatoA()...===");
            return true;
        } catch (Exception e) {
            System.out.println("===saliendo de RegistrarFormatoA()...===");
            return false;
        }

    }

    @Override
    public boolean registrarFormatoB(FormatoBDTO prmFormato) throws RemoteException {
        System.out.println("===Desde registrar Formato B===");
        try {
            for (int i = 0; i < listaAnteproyectos.size(); i++) {
                AnteproyectoDTO objAnteproyecto = listaAnteproyectos.get(i);

                if (objAnteproyecto.getCodigoAnteproyecto() == prmFormato.getCodigoAnteproyecto()) {

                    if (objAnteproyecto.getFormatoB1() != null) {
                        if (objAnteproyecto.getFormatoB1().getIdEvaluador() == prmFormato.getIdEvaluador()) {
                            objAnteproyecto.setFormatoB1(prmFormato);
                            if (objAnteproyecto.getFormatoB1().getConcepto() != null && objAnteproyecto.getFormatoB2().getConcepto() != null) {
                                if (objAnteproyecto.getFormatoB1().getConcepto().compareTo("APROBADO") != 0 || objAnteproyecto.getFormatoB2().getConcepto().compareTo("APROBADO") != 0) {
                                    listAnteproyectosNoApro.add(objAnteproyecto);
                                    listaAnteproyectos.remove(i);
                                    System.out.println("===saliendo de RegistrarFormatoB()...===");
                                    return true;
                                }
                                if (objAnteproyecto.getFormatoB1().getConcepto().compareTo("APROBADO") == 0 && objAnteproyecto.getFormatoB2().getConcepto().compareTo("APROBADO") == 0) {
                                     listNoRemitidos.add(objAnteproyecto);
                                    enviarNotificaciones(objAnteproyecto);
                                }
                            }
                            System.out.println("===saliendo de RegistrarFormatoB()...===");
                            return true;
                        } else if (objAnteproyecto.getFormatoB2() != null) {
                            objAnteproyecto.setFormatoB2(prmFormato);
                            if (objAnteproyecto.getFormatoB1().getConcepto() != null && objAnteproyecto.getFormatoB2().getConcepto() != null) {
                                if (objAnteproyecto.getFormatoB1().getConcepto().compareTo("APROBADO") != 0 || objAnteproyecto.getFormatoB2().getConcepto().compareTo("APROBADO") != 0) {
                                    listAnteproyectosNoApro.add(objAnteproyecto);
                                    listaAnteproyectos.remove(i);
                                    System.out.println("===saliendo de RegistrarFormatoB()...===");
                                    return true;
                                }
                                if (objAnteproyecto.getFormatoB1().getConcepto().compareTo("APROBADO") == 0 && objAnteproyecto.getFormatoB2().getConcepto().compareTo("APROBADO") == 0) {
                                     listNoRemitidos.add(objAnteproyecto);
                                    enviarNotificaciones(objAnteproyecto);
                                   
                                }
                            }
                            System.out.println("===saliendo de RegistrarFormatoB()...===");
                            return true;
                        } else {
                            objAnteproyecto.setFormatoB2(prmFormato);
                            System.out.println("===saliendo de RegistrarFormatoB()...===");
                            return true;
                        }

                    } else {
                        objAnteproyecto.setFormatoB1(prmFormato);
                        System.out.println("===saliendo de RegistrarFormatoB()...===");
                        return true;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Mensaje error: " + e.getMessage());
        }
        System.out.println("===saliendo de RegistrarFormatoB()...===");
        return false;
    }

    private void enviarNotificaciones(AnteproyectoDTO prmAnteproyecto) {
        boolean band = false;
        try {
            System.out.println("===Enviando Notificaciones()===");
            AsignadoDTO objAsignado = new AsignadoDTO(prmAnteproyecto.getCodigoAnteproyecto(), prmAnteproyecto.getFormatoB1().getIdEvaluador(), prmAnteproyecto.getFormatoB2().getIdEvaluador());
            for (RegistroDTO objDirector : atrDirectores) {
                for (int i = 0; i < objDirector.getIdAnteproyecto().size(); i++) {
                    if ((long) objDirector.getIdAnteproyecto().get(i) == prmAnteproyecto.getCodigoAnteproyecto()) {
                        objDirector.getReferenciaDirector().informarNotificacion(objAsignado);
                        band = true;
                        break;
                    }
                }
                if (band == true) {
                    break;
                }
            }

        } catch (Exception e) {
        }

    }

    @Override
    public boolean registrarFormatoC(FormatoCDTO prmFormato) throws RemoteException {
        System.out.println("===Desde registrar Formato C===");
        try {

            for (int i = 0; i < listaAnteproyectos.size(); i++) {
                AnteproyectoDTO objAnteproyecto = listaAnteproyectos.get(i);

                if (objAnteproyecto.getCodigoAnteproyecto() == prmFormato.getCodigoAnteproyecto()) {
                    objAnteproyecto.setFormatoC(prmFormato);
                    if (prmFormato.getConceptoDepto().compareTo("APROBADO") != 0) {
                        listAnteproyectosNoApro.add(objAnteproyecto);
                        listaAnteproyectos.remove(i);
                        System.out.println("===saliendo de RegistrarFormatoC()...===");
                        return true;
                    }
                    System.out.println("===saliendo de RegistrarFormatoC()...===");
                    return true;
                }
            }
        } catch (Exception e) {
        }
        System.out.println("===saliendo de RegistrarFormatoC()...===");
        return false;
    }

    @Override
    public boolean registrarFormatoD(FormatoDDTO prmFormato) throws RemoteException {
        System.out.println("===Desde registrar Formato D===");
        try {
            for (int i = 0; i < listaAnteproyectos.size(); i++) {
                AnteproyectoDTO objAnteproyecto = listaAnteproyectos.get(i);
                if (objAnteproyecto.getCodigoAnteproyecto() == prmFormato.getCodigoAnteproyecto()) {
                    objAnteproyecto.setFormatoD(prmFormato);
                    if (prmFormato.getConceptoCoordinador().compareTo("APROBADO") != 0) {
                        listAnteproyectosNoApro.add(objAnteproyecto);
                        listaAnteproyectos.remove(i);
                        System.out.println("===saliendo de RegistrarFormatoD()...===");
                        return true;
                    }

                    if (objReferenciaRemotaSeguimiento.registrarHistorial(objAnteproyecto)) {
                        System.out.println("===saliendo de RegistrarFormatoD()...===");
                        return true;
                    }
                    System.out.println("===saliendo de RegistrarFormatoD()...===");
                    return true;
                }
            }
        } catch (Exception e) {
        }
        System.out.println("===saliendo de RegistrarFormatoD()...===");
        return false;
    }

    @Override
    public List<FormatoBDTO> consultarFormatosEvaluador(long prmIdEvaluador) throws RemoteException {
        System.out.println("===Desde consultar Formato===");
        List<FormatoBDTO> varLista = new ArrayList<>();
        try {
            for (AnteproyectoDTO objAnteproyecto : listaAnteproyectos) {
                if (objAnteproyecto.getFormatoB1() == null) {
                    continue;
                }
                if (objAnteproyecto.getFormatoB1().getIdEvaluador() == prmIdEvaluador && objAnteproyecto.getFormatoB1().getConcepto() == null) {
                    varLista.add(objAnteproyecto.getFormatoB1());
                }
                if (objAnteproyecto.getFormatoB2().getIdEvaluador() == prmIdEvaluador && objAnteproyecto.getFormatoB2().getConcepto() == null) {
                    varLista.add(objAnteproyecto.getFormatoB2());
                }
            }
        } catch (Exception e) {
        }
        return varLista;
    }

    @Override
    public List<FormatoADTO> consultarFormatoA() throws RemoteException {
        System.out.println("===Desde consultar FormatoA===");
        List<FormatoADTO> varList = new ArrayList<>();
        try {
            for (AnteproyectoDTO objAnteproyecto : listaAnteproyectos) {
                if (objAnteproyecto.getFormatoA() != null && objAnteproyecto.getFormatoB1() == null) {
                    varList.add(objAnteproyecto.getFormatoA());
                }
            }
        } catch (Exception e) {
        }
        System.out.println("===Saliendo de registrarFormatoA()...===");
        return varList;
    }

    @Override
    public List<FormatoBDTO> consultarFormatoB() throws RemoteException {
        System.out.println("===Desde consultar FormatoB===");
        List<FormatoBDTO> varList = new ArrayList<>();
        try {
            for (AnteproyectoDTO objAnteproyecto : listaAnteproyectos) {
                if (objAnteproyecto.getFormatoB1() != null && objAnteproyecto.getFormatoB2() != null && objAnteproyecto.getFormatoC() == null) {
                    if (objAnteproyecto.getFormatoB1().getConcepto().compareTo("") != 0 && objAnteproyecto.getFormatoB1().getConcepto().compareTo("") != 0 && isRemitido(objAnteproyecto.getCodigoAnteproyecto())) {
                        varList.add(objAnteproyecto.getFormatoB1());
                        //varList.add(objAnteproyecto.getFormatoB2());
                    }
                }
            }
        } catch (Exception e) {
        }
        System.out.println("===Saliendo de registrarFormatoB()...===");
        return varList;
    }
    private boolean isRemitido(long prmCodigoAnteproyectp){
        for (AnteproyectoDTO NoRemitido : listNoRemitidos) {
            if(NoRemitido.getCodigoAnteproyecto()==prmCodigoAnteproyectp){
                return false;
            }
        }
        return true;
    }

    @Override
    public List<FormatoCDTO> consultarFormatoC() throws RemoteException {
        System.out.println("===Desde consultar FormatoC===");
        List<FormatoCDTO> varList = new ArrayList<>();
        try {
            for (AnteproyectoDTO objAnteproyecto : listaAnteproyectos) {
                if (objAnteproyecto.getFormatoC() != null && objAnteproyecto.getFormatoD() == null) {
                    varList.add(objAnteproyecto.getFormatoC());
                }
            }
        } catch (Exception e) {
        }
        System.out.println("===Saliendo de registrarFormatoC()...===");
        return varList;
    }

    @Override
    public List<FormatoDDTO> consultarFormatoD() throws RemoteException {
        System.out.println("===Desde consultar FormatoD===");
        List<FormatoDDTO> varList = new ArrayList<>();
        try {
            for (AnteproyectoDTO objAnteproyecto : listaAnteproyectos) {
                if (objAnteproyecto.getFormatoD() != null) {
                    varList.add(objAnteproyecto.getFormatoD());
                }
            }
        } catch (Exception e) {
        }
        System.out.println("===Saliendo de registrarFormatoD()...===");
        return varList;
    }

    public void consultarReferenciaRemota(String direccionIpRMIRegistry, int numPuertoRMIRegistry) {
        System.out.println(" ");
        System.out.println("Desde consultarReferenciaRemotaDeNotificacion()...");
        this.objReferenciaRemotaSeguimiento = (GestionSeguimientoInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,
                numPuertoRMIRegistry, "ObjSeguimientoAnteproyectos");
    }

    @Override
    public boolean eliminarAnteproyecto(long prmCodigoAnteproyecto) throws RemoteException {
        try {
            for (int i = 0; i < listaAnteproyectos.size(); i++) {
                if (prmCodigoAnteproyecto == listaAnteproyectos.get(i).getCodigoAnteproyecto()) {
                    listaAnteproyectos.remove(i);
                    return true;
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public void registrarCallback(RegistroDTO prmRegistro) throws RemoteException {
        System.out.println("===Desde registrarCALLBACK===");
        boolean band = false;

        for (RegistroDTO atrDirector : atrDirectores) {
            if (atrDirector.getIdDirector() == prmRegistro.getIdDirector()) {
                atrDirector.setReferenciaDirector(prmRegistro.getReferenciaDirector());
                atrDirector.setSesion(true);
                band = true;
                break;
            }
        }

        if (!band) {
            atrDirectores.add(prmRegistro);
        }
        System.out.println("===Saliendo de registrarCallback()...===");
    }

    @Override
    public void asociarAnteproyectoDirector(long idAnteproyecto, long idDirector) throws RemoteException {
        for (RegistroDTO Director : atrDirectores) {
            if (Director.getIdDirector() == idDirector) {
                Director.getIdAnteproyecto().add(idAnteproyecto);
            }
        }
    }

    @Override
    public boolean verificarSesion(long idDirector) throws RemoteException {
        for (RegistroDTO director : atrDirectores) {
            if (director.getIdDirector() == idDirector) {
                if (director.getSesion()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public void actualizarSesion(long idDirector) throws RemoteException {
        for (RegistroDTO director : atrDirectores) {
            if (director.getIdDirector() == idDirector) {
                director.setSesion(false);
                break;
            }
        }
    }

    @Override
    public List<Long> consultarNoRemitidos(long prmIdDirector) throws RemoteException {
        List<Long> aux=new ArrayList<>();
        for (AnteproyectoDTO NoRemitido : listNoRemitidos) {
            for (RegistroDTO objDirector : atrDirectores) {
                if(objDirector.getIdDirector()==prmIdDirector){
                    for (int i = 0; i <objDirector.getIdAnteproyecto().size(); i++) {
                        if(NoRemitido.getCodigoAnteproyecto()==(long)objDirector.getIdAnteproyecto().get(i)){
                            aux.add(NoRemitido.getCodigoAnteproyecto());
                        }
                    }
                }
            }
        }
        return aux;
    }

    @Override
    public boolean remitir(long prmCodigoAnteproyecto) throws RemoteException {
        for (int i = 0; i < listNoRemitidos.size(); i++) {
            if(prmCodigoAnteproyecto==listNoRemitidos.get(i).getCodigoAnteproyecto()){
                listNoRemitidos.remove(i);
                return true;
            }
        }
        return false;
    }

}
