package SSeguimientoAnteProyectos.sop_rmi;

import SGestionAnteproyectos.dto.AnteproyectoDTO;
import SSeguimientoAnteProyectos.utilidades.MiObjectOutputStream;
import SSeguimientoAnteProyectos.dto.ResolucionDTO;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura
 */
public class GestionSeguimientoImpl extends UnicastRemoteObject implements GestionSeguimientoInt {

    private boolean bandera = false;
    private int incremental = 000;

    public GestionSeguimientoImpl() throws RemoteException {
        super();
    }

    @Override
    public ResolucionDTO generarResolucion(long prmCodigoAnteproyecto) throws RemoteException {
        System.out.println("===desde GenerarResolución()===");
        boolean band = false;
        FileInputStream ficheroEntrada = null;
        FileOutputStream ficheroSalida = null;
        AnteproyectoDTO temp;

        ResolucionDTO resolucion = null;

        try {

            if (leerResolucion(prmCodigoAnteproyecto) != true) {
                resolucion = new ResolucionDTO("8.4.2" + "-" + "90.14/" + incremental, prmCodigoAnteproyecto, LocalDate.now());
                escribeFicheroRes("listadoTGIAprobados.txt", resolucion);
            }

        } catch (Exception ex) {
            //ex.printStackTrace();
        }
        System.out.println("===Saliendo de generarResolución()...===");
        return resolucion;
    }

    @Override
    public boolean registrarHistorial(AnteproyectoDTO prmAnteproyecto) throws RemoteException {
        boolean result = false;
        System.out.println("===desde RegistrarHistorial()===");

        try {
            if (validar("historialTGI.txt") == false) {
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("historialTGI.txt"));
                oos.writeObject(prmAnteproyecto);
                oos.close();
                bandera = true;
            } else {
                MiObjectOutputStream objectOutput = new MiObjectOutputStream(
                        new FileOutputStream("historialTGI.txt", true));

                objectOutput.writeUnshared(prmAnteproyecto);
                objectOutput.close();
            }

        } catch (Exception e) {
            //e.printStackTrace();
        }
        System.out.println("===Saliendo de registrarHistorial()...===");
        return result;
    }

    @Override
    public List<AnteproyectoDTO> consultarHistorial() throws RemoteException {
        System.out.println("===desde ConsultarHistorial()===");
        AnteproyectoDTO temp;
        List<AnteproyectoDTO> listAnteproyectos = new ArrayList();

        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("historialTGI.txt"));

            // Se lee el primer objeto
            Object aux = ois.readObject();

            // Mientras haya objetos
            while (aux != null) {
                if (aux instanceof AnteproyectoDTO) {
                    listAnteproyectos.add((AnteproyectoDTO) aux);
                }
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
           //System.out.println("Fin de fichero");
        } catch (Exception e2) {
            //e2.printStackTrace();
        }

        System.out.println("===Saliendo de consultarHistorial()...===");
        return listAnteproyectos;
    }

    @Override
    public List<ResolucionDTO> consultarAprobados() throws RemoteException {
        System.out.println("===desde ConsultarAprobados()===");

        List<ResolucionDTO> listResolucion = new ArrayList();
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("listadoTGIAprobados.txt"));

            // Se lee el primer objeto
            Object aux = ois.readObject();

            // Mientras haya objetos
            while (aux != null) {
                if (aux instanceof ResolucionDTO) {
                    listResolucion.add((ResolucionDTO) aux);
                }
                //formatos.add(aux)
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
            //System.out.println("Fin de fichero");
        } catch (Exception e2) {
            //e2.printStackTrace();
        }
        System.out.println("===Saliendo de consultarAprobados()...===");
        return listResolucion;
    }

    public void escribeFicheroRes(String fichero, ResolucionDTO resolucion) {
        try {
            if (validar(fichero) == false) {
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(fichero));
                oos.writeObject(resolucion);
                oos.close();
                bandera = true;
            } else {
                MiObjectOutputStream objectOutput = new MiObjectOutputStream(
                        new FileOutputStream(fichero, true));
                // Se hace el new fuera del bucle, s�lo hay una instancia de persona.
                // Se debe usar entonces writeUnshared().
                objectOutput.writeUnshared(resolucion);
                objectOutput.close();
            }

        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

    public boolean leerResolucion(long prmCodigoAnteproyecto) throws FileNotFoundException, IOException {
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("listadoTGIAprobados.txt"));

            // Se lee el primer objeto
            Object aux = ois.readObject();

            // Mientras haya objetos
            while (aux != null) {
                if (aux instanceof ResolucionDTO) {
                    if (((ResolucionDTO) aux).getAtrCodigoAnteproyecto() == prmCodigoAnteproyecto) {
                        System.out.println("La resolucion ya existe");
                        return true;
                    }
                }
                //formatos.add(aux)
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e2) {
            //e2.printStackTrace();
        }
        return false;
    }

    public boolean validar(String fichero) throws FileNotFoundException, IOException {
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));

            // Se lee el primer objeto
            Object aux = ois.readObject();

            // Mientras haya objetos
            while (aux != null) {
                return true;
                //formatos.add(aux)
            }
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e2) {
            return false;
            //e2.printStackTrace();
        }

        return false;
    }
}
