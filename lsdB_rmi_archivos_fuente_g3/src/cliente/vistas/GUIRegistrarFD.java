/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.FormatoCDTO;
import SGestionAnteproyectos.dto.FormatoDDTO;
import cliente.ClienteDeObjetos;
import java.awt.Image;
import java.awt.Toolkit;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class GUIRegistrarFD extends javax.swing.JFrame {

    GUICoordinador atrGUICoordinador;
    ClienteDeObjetos atrCO;

    /**
     * Creates new form GUIRegistrarFD
     */
    public GUIRegistrarFD(GUICoordinador prmGUI) {
        initComponents();
        this.setLocationRelativeTo(null);
        boton_grupo_concepto.add(rbtnAprobado);
        boton_grupo_concepto.add(rbtnNoAprobado);
        boton_grupo_estruc.add(rbtnIncorrecta);
        boton_grupo_estruc.add(rbtnCorrecta);
        atrGUICoordinador = prmGUI;
        cargarComboBox();

    }

    public GUIRegistrarFD() {
        initComponents();
        this.setLocationRelativeTo(null);
        boton_grupo_concepto.add(rbtnAprobado);
        boton_grupo_concepto.add(rbtnNoAprobado);
        boton_grupo_estruc.add(rbtnIncorrecta);
        boton_grupo_estruc.add(rbtnCorrecta);
        cargarComboBox();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/iconApp.png"));
        return retValue;
    }

    public void cargarComboBox() {
        try {
            List<FormatoCDTO> listaAnteproyectos;
            atrCO = ClienteDeObjetos.getInstancia();
            listaAnteproyectos = atrCO.getObjRemotoAnteproyectos().consultarFormatoC();
            for (FormatoCDTO formatoCDTO : listaAnteproyectos) {
                cmbCodigo.addItem(String.valueOf(formatoCDTO.getCodigoAnteproyecto()));
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

        boton_grupo_concepto = new javax.swing.ButtonGroup();
        boton_grupo_estruc = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEstructura = new javax.swing.JLabel();
        rbtnCorrecta = new javax.swing.JRadioButton();
        rbtnIncorrecta = new javax.swing.JRadioButton();
        rbtnAprobado = new javax.swing.JRadioButton();
        rbtnNoAprobado = new javax.swing.JRadioButton();
        lblConcepto = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();
        btnVolver2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRAR FORMATO D");
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registrar Formato TI-D");

        lblEstructura.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblEstructura.setText("Estructura:");

        rbtnCorrecta.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        rbtnCorrecta.setText("Correcta");

        rbtnIncorrecta.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        rbtnIncorrecta.setSelected(true);
        rbtnIncorrecta.setText("Incorrecta");

        rbtnAprobado.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        rbtnAprobado.setText("Aprobado");

        rbtnNoAprobado.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        rbtnNoAprobado.setSelected(true);
        rbtnNoAprobado.setText("No Aprobado");

        lblConcepto.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblConcepto.setText("Concepto:");

        lblObservaciones.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblObservaciones.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblCodigo.setText("Seleccione el codigo del anteproyecto:");

        cmbCodigo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Anteproyecto" }));

        btnVolver2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnVolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back.png"))); // NOI18N
        btnVolver2.setText("Volver");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoCoordinado.png"))); // NOI18N

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstructura)
                            .addComponent(lblConcepto)
                            .addComponent(lblCodigo)))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addComponent(rbtnAprobado)
                        .addGap(10, 10, 10)
                        .addComponent(rbtnNoAprobado)
                        .addGap(0, 236, Short.MAX_VALUE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnCorrecta)
                            .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(rbtnIncorrecta)
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(332, 332, 332))
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(lblObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 158, Short.MAX_VALUE))
            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegistroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addGap(32, 32, 32)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstructura)
                    .addComponent(rbtnCorrecta)
                    .addComponent(rbtnIncorrecta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConcepto)
                    .addComponent(rbtnAprobado)
                    .addComponent(rbtnNoAprobado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservaciones))
                .addGap(37, 37, 37)
                .addComponent(btnGuardar)
                .addContainerGap())
            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegistroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //long codigo = Long.parseLong(txtFCodigo.getText());
        if (cmbCodigo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un AnteProyecto", "INFO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String estructura;
            String concepto;
            long codigo = Long.parseLong(cmbCodigo.getSelectedItem().toString());
            if (rbtnCorrecta.isSelected()) {
                estructura = "CORRECTA";
            } else {
                estructura = "INCORRECTA";
            }
            if (rbtnAprobado.isSelected()) {
                concepto = "APROBADO";
            } else {
                concepto = "NO APROBADO";
            }
            String observaciones = txtObservaciones.getText();
            try {
                atrCO = ClienteDeObjetos.getInstancia();
                FormatoDDTO formato = new FormatoDDTO(codigo, estructura, concepto, observaciones);
                if (atrCO.getObjRemotoAnteproyectos().registrarFormatoD(formato)) {
                    JOptionPane.showMessageDialog(this, "Formato registrado correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    atrGUICoordinador.mostrarAnteproyectos();
                    this.dispose();
                    atrGUICoordinador.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "El formato no se pudo registrar", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                this.dispose();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        this.dispose();
        atrGUICoordinador.setVisible(true);
        atrGUICoordinador.mostrarAnteproyectos();
    }//GEN-LAST:event_btnVolver2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boton_grupo_concepto;
    private javax.swing.ButtonGroup boton_grupo_estruc;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblEstructura;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JRadioButton rbtnAprobado;
    private javax.swing.JRadioButton rbtnCorrecta;
    private javax.swing.JRadioButton rbtnIncorrecta;
    private javax.swing.JRadioButton rbtnNoAprobado;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
