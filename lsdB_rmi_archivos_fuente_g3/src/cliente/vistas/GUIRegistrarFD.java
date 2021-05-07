/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.FormatoADTO;
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

        boton_grupo_concepto.add(rbtnAprobado);
        boton_grupo_concepto.add(rbtnNoAprobado);
        boton_grupo_estruc.add(rbtnIncorrecta);
        boton_grupo_estruc.add(rbtnCorrecta);
        atrGUICoordinador = prmGUI;
        cargarComboBox();

    }

    public GUIRegistrarFD() {
        initComponents();

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
        pnlRegistro = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEstructura = new javax.swing.JLabel();
        rbtnCorrecta = new javax.swing.JRadioButton();
        rbtnIncorrecta = new javax.swing.JRadioButton();
        lblConcepto = new javax.swing.JLabel();
        rbtnAprobado = new javax.swing.JRadioButton();
        rbtnNoAprobado = new javax.swing.JRadioButton();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Registrar Formato TI-D");

        lblEstructura.setText("Estructura:");

        rbtnCorrecta.setSelected(true);
        rbtnCorrecta.setText("Correcta");

        rbtnIncorrecta.setText("Incorrecta");

        lblConcepto.setText("Concepto:");

        rbtnAprobado.setSelected(true);
        rbtnAprobado.setText("Aprobado");

        rbtnNoAprobado.setText("No Aprobado");

        lblObservaciones.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCodigo.setText("Seleccione el codigo del anteproyecto:");

        cmbCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Anteproyecto" }));

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroLayout.createSequentialGroup()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnIncorrecta)
                            .addComponent(rbtnNoAprobado))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162))
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEstructura)
                    .addComponent(lblConcepto)
                    .addComponent(lblCodigo)
                    .addComponent(lblObservaciones))
                .addGap(47, 47, 47)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(rbtnAprobado))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnCorrecta)
                            .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(41, 41, 41)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstructura)
                    .addComponent(rbtnCorrecta)
                    .addComponent(rbtnIncorrecta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblConcepto)
                        .addComponent(rbtnAprobado))
                    .addComponent(rbtnNoAprobado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservaciones))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarFD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarFD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarFD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarFD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarFD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boton_grupo_concepto;
    private javax.swing.ButtonGroup boton_grupo_estruc;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbCodigo;
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