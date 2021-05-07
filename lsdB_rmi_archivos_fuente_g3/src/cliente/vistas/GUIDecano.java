/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.*;
import SSeguimientoAnteproyectos.dto.ResolucionDTO;
import cliente.ClienteDeObjetos;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class GUIDecano extends javax.swing.JFrame {

    GUIInicioSesion objGuiInicioSesion;
    ClienteDeObjetos atrCO;

    /**
     * Creates new form GUIDecano
     */
    public GUIDecano() {
        initComponents();

    }

    public GUIDecano(GUIInicioSesion prmGUI) {
        initComponents();
        objGuiInicioSesion = prmGUI;
        llenarTblAprobados();
        llenarTblHistorial();
        llenarTblAnteproyectos();
        cargarCombobox();
    }

    public void cargarCombobox() {
        try {
            atrCO = ClienteDeObjetos.getInstancia();
            List<FormatoDDTO> listaAnteproyectos;
            listaAnteproyectos = atrCO.getObjRemotoAnteproyectos().consultarFormatoD();
            for (FormatoDDTO formatoDDTO : listaAnteproyectos) {
                cmbCodigo.addItem(String.valueOf(formatoDDTO.getCodigoAnteproyecto()));
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GUIRegistrarFD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabListar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnteproyectos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblAprobados = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCoDirector = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFormatoA = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFormatoC = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFormatoB = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblFormatoD = new javax.swing.JTable();
        lblFormatoA = new javax.swing.JLabel();
        lblFormatoB = new javax.swing.JLabel();
        lblFormatoC = new javax.swing.JLabel();
        lblFormatoD = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        pnlResolucion = new javax.swing.JPanel();
        lblTituloRes = new javax.swing.JLabel();
        lblCodigoAnte = new javax.swing.JLabel();
        lblCodRes = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblCodigoA = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();
        lblFechaG = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DECANO");
        setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        setIconImage(getIconImage());

        tabListar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        tblAnteproyectos.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tblAnteproyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Anteproyecto", "Concepto Coordinador", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnteproyectos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        tabListar.addTab("Listar Anteproyectos", jPanel1);

        tblAprobados.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tblAprobados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Anteproyecto", "Codigo Resolución", "Fecha Registro"
            }
        ));
        jScrollPane6.setViewportView(tblAprobados);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Listado de Anteproyectos aprobados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(325, 325, 325))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        tabListar.addTab("Consultar Aprobados", jPanel4);

        tblFormatoA.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tblFormatoA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Anteproyecto", "Nombre Programa", "Ttiulo Anteproyecto", "Nombre Estudiante 1", "Codigo Estudiante 1", "Nombre Estudiante 2", "Codigo Estudiante 2", "Director", "Co-Director", "Objetivos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFormatoA);

        tblFormatoC.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tblFormatoC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Anteproyecto", "Concepto 1", "Concepto 2", "Estructura", "Concepto departamento", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblFormatoC);

        tblFormatoB.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tblFormatoB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Anteproyecto", "Id Evaluador", "Concepto", "Observaciones", "Fecha de Evaluación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblFormatoB);

        tblFormatoD.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tblFormatoD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estructura", "Concepto del coordinador", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblFormatoD);

        lblFormatoA.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblFormatoA.setText("Formato A");

        lblFormatoB.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblFormatoB.setText("Formato B");

        lblFormatoC.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblFormatoC.setText("Formato C");

        lblFormatoD.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblFormatoD.setText("Formato D");

        javax.swing.GroupLayout lblCoDirectorLayout = new javax.swing.GroupLayout(lblCoDirector);
        lblCoDirector.setLayout(lblCoDirectorLayout);
        lblCoDirectorLayout.setHorizontalGroup(
            lblCoDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblCoDirectorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(lblCoDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblCoDirectorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(lblCoDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblCoDirectorLayout.createSequentialGroup()
                        .addComponent(lblFormatoA)
                        .addGap(413, 413, 413))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblCoDirectorLayout.createSequentialGroup()
                        .addComponent(lblFormatoB)
                        .addGap(410, 410, 410))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblCoDirectorLayout.createSequentialGroup()
                        .addComponent(lblFormatoC)
                        .addGap(407, 407, 407))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblCoDirectorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFormatoD)
                .addGap(403, 403, 403))
        );
        lblCoDirectorLayout.setVerticalGroup(
            lblCoDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblCoDirectorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblFormatoA)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblFormatoB)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFormatoC)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lblFormatoD)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        tabListar.addTab("Consultar Historial", lblCoDirector);

        lblCodigo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblCodigo.setText("Selecciones el codigo del anteproyecto:");

        cmbCodigo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Anteproyecto" }));

        btnOK.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        pnlResolucion.setEnabled(false);

        lblTituloRes.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblTituloRes.setText("Resolucion Generada");

        lblCodigoAnte.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblCodigoAnte.setText("Codigo Anteproyecto:");

        lblCodRes.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblCodRes.setText("Codigo de Resolución:");

        lblFecha.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblFecha.setText("Fecha de Generación:");

        lblCodigoA.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblCodigoA.setText("-");

        lblRes.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblRes.setText("-");

        lblFechaG.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblFechaG.setText("-");

        javax.swing.GroupLayout pnlResolucionLayout = new javax.swing.GroupLayout(pnlResolucion);
        pnlResolucion.setLayout(pnlResolucionLayout);
        pnlResolucionLayout.setHorizontalGroup(
            pnlResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResolucionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addGroup(pnlResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCodRes)
                        .addComponent(lblCodigoAnte)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigoA)
                    .addComponent(lblRes)
                    .addComponent(lblFechaG))
                .addGap(76, 76, 76))
            .addGroup(pnlResolucionLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblTituloRes)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pnlResolucionLayout.setVerticalGroup(
            pnlResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResolucionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTituloRes)
                .addGap(45, 45, 45)
                .addGroup(pnlResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoAnte)
                    .addComponent(lblCodigoA))
                .addGap(29, 29, 29)
                .addGroup(pnlResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodRes)
                    .addComponent(lblRes))
                .addGap(28, 28, 28)
                .addGroup(pnlResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblFechaG))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnlResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(30, 30, 30)
                        .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOK)
                        .addGap(399, 399, 399))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlResolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        tabListar.addTab("Generar Resolucion", jPanel2);

        jMenu2.setText("Cerrar Sesion");
        jMenu2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabListar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabListar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

        limpiar();
        if (cmbCodigo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un AnteProyecto", "INFO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            long codigo = Long.parseLong(cmbCodigo.getSelectedItem().toString());
            try {
                atrCO = ClienteDeObjetos.getInstancia();
                ResolucionDTO resolucion = atrCO.getObjRemotoSeguimiento().generarResolucion(codigo);
                if (resolucion == null) {
                    JOptionPane.showMessageDialog(this, "Error al generar la resolucion", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    pnlResolucion.enable(true);
                    lblCodigoA.setText(String.valueOf(resolucion.getAtrCodigoAnteproyecto()));
                    lblRes.setText(resolucion.getAtrCodigo());
                    lblFechaG.setText(String.valueOf(resolucion.getAtrFecha()));
                    JOptionPane.showMessageDialog(this, "Resolucion generada correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    //this.dispose();
                    atrCO.getObjRemotoAnteproyectos().eliminarAnteproyecto(codigo);
                    llenarTblAprobados();
                    llenarTblAnteproyectos();

                    //cargarCombobox();
                }
            } catch (RemoteException ex) {
                Logger.getLogger(GUIDecano.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed
    private void limpiar() {
        lblCodigoA.setText("-");
        lblRes.setText("-");
        lblFechaG.setText("-");
    }
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        this.dispose();
        objGuiInicioSesion.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void llenarTblAnteproyectos() {
        try {
            atrCO = ClienteDeObjetos.getInstancia();
            List<FormatoDDTO> listaAnteproyectos = atrCO.getObjRemotoAnteproyectos().consultarFormatoD();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo Anteproyecto");
            modelo.addColumn("Concepto Coordinador");
            modelo.addColumn("Observaciones");
            tblAnteproyectos.setEnabled(false);
            for (FormatoDDTO Anteproyecto : listaAnteproyectos) {
                Object[] obj = new Object[]{Anteproyecto.getCodigoAnteproyecto(), Anteproyecto.getConceptoCoordinador(), Anteproyecto.getObservaciones()};
                modelo.addRow(obj);
            }
            tblAnteproyectos.setModel(modelo);
        } catch (Exception e) {
        }
    }

    private void llenarTblHistorial() {
        try {
            atrCO = ClienteDeObjetos.getInstancia();
            List<AnteproyectoDTO> listaAnteproyectos = atrCO.getObjRemotoSeguimiento().consultarHistorial();
            DefaultTableModel modeloA = new DefaultTableModel();
            DefaultTableModel modeloB = new DefaultTableModel();
            DefaultTableModel modeloC = new DefaultTableModel();
            DefaultTableModel modeloD = new DefaultTableModel();
            modeloA.addColumn("Codigo Anteproyecto");
            modeloA.addColumn("Nombre Programa");
            modeloA.addColumn("Titulo del Anteproyecto");
            modeloA.addColumn("Nombre del estudiante 1");
            modeloA.addColumn("Codigo del estudiante 1");
            modeloA.addColumn("Nombre del estudiante 2");
            modeloA.addColumn("Codigo del estudiante 2");
            modeloA.addColumn("Nombre del director");
            modeloA.addColumn("Nombre del Co-director");
            modeloA.addColumn("Objetivos");

            modeloB.addColumn("Codigo Anteproyecto");
            modeloB.addColumn("Id Evaluador");
            modeloB.addColumn("Concepto");
            modeloB.addColumn("Observaciones");
            modeloB.addColumn("Fecha de Evaluación");

            modeloC.addColumn("Codigo Anteproyecto");
            modeloC.addColumn("Concepto 1");
            modeloC.addColumn("Concepto 2");
            modeloC.addColumn("Estructura");
            modeloC.addColumn("Concepto del departamento");
            modeloC.addColumn("Observaciones");

            modeloD.addColumn("Codigo Anteproyecto");
            modeloD.addColumn("Estructura");
            modeloD.addColumn("Concepto del coordinador");
            modeloD.addColumn("Observaciones");

            tblFormatoA.setEnabled(false);
            tblFormatoB.setEnabled(false);
            tblFormatoC.setEnabled(false);
            tblFormatoD.setEnabled(false);
            for (AnteproyectoDTO Anteproyecto : listaAnteproyectos) {
                System.out.println("Size: " + listaAnteproyectos.size());
                Object[] objA = new Object[]{Anteproyecto.getFormatoA().getCodigoAnteproyecto(),
                    Anteproyecto.getFormatoA().getNombrePrograma(), Anteproyecto.getFormatoA().getTituloAnteproyecto(),
                    Anteproyecto.getFormatoA().getNomEstudiante1(), Anteproyecto.getFormatoA().getIdEstudiante1(),
                    Anteproyecto.getFormatoA().getNomEstudiante2(), Anteproyecto.getFormatoA().getIdEstudiante2(),
                    Anteproyecto.getFormatoA().getNombreDirector(), Anteproyecto.getFormatoA().getNombreCoDirector(), Anteproyecto.getFormatoA().getObjetivos()};
                modeloA.addRow(objA);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                Object[] objB1 = new Object[]{Anteproyecto.getFormatoB1().getCodigoAnteproyecto(), Anteproyecto.getFormatoB1().getIdEvaluador(), Anteproyecto.getFormatoB1().getConcepto(),
                    Anteproyecto.getFormatoB1().getObservaciones(), dateFormat.format(Anteproyecto.getFormatoB1().getFechaEvaluacion())};
                modeloB.addRow(objB1);

                Object[] objB2 = new Object[]{Anteproyecto.getFormatoB2().getCodigoAnteproyecto(), Anteproyecto.getFormatoB2().getIdEvaluador(), Anteproyecto.getFormatoB2().getConcepto(),
                    Anteproyecto.getFormatoB2().getObservaciones(), dateFormat.format(Anteproyecto.getFormatoB2().getFechaEvaluacion())};
                modeloB.addRow(objB2);

                Object[] objC = new Object[]{Anteproyecto.getFormatoC().getCodigoAnteproyecto(), Anteproyecto.getFormatoC().getConcepto1(), Anteproyecto.getFormatoC().getConcepto2(),
                    Anteproyecto.getFormatoC().getEstructura(), Anteproyecto.getFormatoC().getConceptoDepto(), Anteproyecto.getFormatoC().getObservaciones()};
                modeloC.addRow(objC);

                Object[] objD = new Object[]{Anteproyecto.getFormatoD().getCodigoAnteproyecto(), Anteproyecto.getFormatoD().getEstructura(),
                    Anteproyecto.getFormatoD().getConceptoCoordinador(), Anteproyecto.getFormatoD().getObservaciones()};
                modeloD.addRow(objD);
            }
            tblFormatoA.setModel(modeloA);
            tblFormatoB.setModel(modeloB);
            tblFormatoC.setModel(modeloC);
            tblFormatoD.setModel(modeloD);
        } catch (Exception e) {
        }
    }

    private void llenarTblAprobados() {
        try {
            atrCO = ClienteDeObjetos.getInstancia();
            List<ResolucionDTO> listAprobados = atrCO.getObjRemotoSeguimiento().consultarAprobados();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Numero de resolución");
            modelo.addColumn("Fecha de registro");
            tblAprobados.setEnabled(false);
            for (ResolucionDTO anteproyectoAprobado : listAprobados) {
                Object[] obj = new Object[]{anteproyectoAprobado.getAtrCodigoAnteproyecto(), anteproyectoAprobado.getAtrCodigo(), anteproyectoAprobado.getAtrFecha()};
                modelo.addRow(obj);
            }
            tblAprobados.setModel(modelo);
        } catch (RemoteException ex) {
            Logger.getLogger(GUIDecano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel lblCoDirector;
    private javax.swing.JLabel lblCodRes;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoA;
    private javax.swing.JLabel lblCodigoAnte;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaG;
    private javax.swing.JLabel lblFormatoA;
    private javax.swing.JLabel lblFormatoB;
    private javax.swing.JLabel lblFormatoC;
    private javax.swing.JLabel lblFormatoD;
    private javax.swing.JLabel lblRes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloRes;
    private javax.swing.JPanel pnlResolucion;
    private javax.swing.JTabbedPane tabListar;
    private javax.swing.JTable tblAnteproyectos;
    private javax.swing.JTable tblAprobados;
    private javax.swing.JTable tblFormatoA;
    private javax.swing.JTable tblFormatoB;
    private javax.swing.JTable tblFormatoC;
    private javax.swing.JTable tblFormatoD;
    // End of variables declaration//GEN-END:variables
}
