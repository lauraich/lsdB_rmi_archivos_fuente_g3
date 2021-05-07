/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.FormatoADTO;
import cliente.ClienteDeObjetos;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class GUIDirector extends javax.swing.JFrame {

    GUIInicioSesion objGuiInicioSesion;
    ClienteDeObjetos objCO;

    /**
     * Creates new form GUIDirector
     */
    public GUIDirector() {
        initComponents();
    }

    public GUIDirector(GUIInicioSesion prmGUI) {
        initComponents();
        objGuiInicioSesion = prmGUI;
        try {
            objCO = ClienteDeObjetos.getInstancia();
            txtCodigoAnteproyecto.setText(String.valueOf(objCO.getObjRemotoAnteproyectos().generarCodigo()));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarNotificacion(String prmMensaje) {
        txtNotificaciones.setText(prmMensaje);
    }

    private void limpiar() {
        txtCodigoAnteproyecto.setText("");
        txtIdEstudiante1.setText("");
        txtIdEstudiante2.setText("");
        txtNombreCoDirector.setText("");
        txtNombreDirector.setText("");
        txtNombreEstudiante1.setText("");
        txtNombreEstudiante2.setText("");
        txtNombrePrograma.setText("");
        txtObjetivos.setText("");
        txtTituloAnteproyecto.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        lblCodigoAnteproyecto = new javax.swing.JLabel();
        txtCodigoAnteproyecto = new javax.swing.JTextField();
        lblNombrePrograma = new javax.swing.JLabel();
        txtNombrePrograma = new javax.swing.JTextField();
        txtTituloAnteproyecto = new javax.swing.JTextField();
        lblTituloAnteproyecto = new javax.swing.JLabel();
        lblIdEstudiante1 = new javax.swing.JLabel();
        lblNombreEstudiante1 = new javax.swing.JLabel();
        txtNombreEstudiante1 = new javax.swing.JTextField();
        txtIdEstudiante2 = new javax.swing.JTextField();
        lblIdEstudiante2 = new javax.swing.JLabel();
        txtNombreEstudiante2 = new javax.swing.JTextField();
        lblNombreEstudiante2 = new javax.swing.JLabel();
        txtNombreDirector = new javax.swing.JTextField();
        lblNombreDirector = new javax.swing.JLabel();
        lblNombreCoDirector = new javax.swing.JLabel();
        txtNombreCoDirector = new javax.swing.JTextField();
        lblObjetivos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObjetivos = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        txtIdEstudiante1 = new javax.swing.JTextField();
        lblRegistrarFormatoA = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        txtNotificaciones = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        lblCodigoAnteproyecto.setText("Codigo Anteproyecto: ");

        txtCodigoAnteproyecto.setEditable(false);

        lblNombrePrograma.setText("Nombre del Programa:");

        lblTituloAnteproyecto.setText("Titulo del Anteproyecto:");

        lblIdEstudiante1.setText("Id Estudiante 1:");

        lblNombreEstudiante1.setText("Nombre Estuadiante 1:");

        txtIdEstudiante2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEstudiante2KeyTyped(evt);
            }
        });

        lblIdEstudiante2.setText("Id Estudiante 2:");

        lblNombreEstudiante2.setText("Nombre Estudiante 2:");

        lblNombreDirector.setText("Nombre del Director:");

        lblNombreCoDirector.setText("Nombre del Codirector:");

        lblObjetivos.setText("Objetivos");

        txtObjetivos.setColumns(20);
        txtObjetivos.setRows(5);
        jScrollPane1.setViewportView(txtObjetivos);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtIdEstudiante1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEstudiante1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreDirector)
                                    .addComponent(lblNombreEstudiante2)
                                    .addComponent(lblIdEstudiante2)
                                    .addComponent(lblNombreEstudiante1)
                                    .addComponent(lblIdEstudiante1)
                                    .addComponent(lblTituloAnteproyecto)
                                    .addComponent(lblNombrePrograma)
                                    .addComponent(lblCodigoAnteproyecto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoAnteproyecto)
                                    .addComponent(txtNombrePrograma)
                                    .addComponent(txtTituloAnteproyecto)
                                    .addComponent(txtNombreEstudiante1)
                                    .addComponent(txtIdEstudiante2)
                                    .addComponent(txtNombreEstudiante2)
                                    .addComponent(txtNombreDirector)
                                    .addComponent(txtIdEstudiante1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(lblNombreCoDirector)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblObjetivos)
                                    .addComponent(txtNombreCoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoAnteproyecto)
                    .addComponent(txtCodigoAnteproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePrograma)
                    .addComponent(txtNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloAnteproyecto)
                    .addComponent(txtTituloAnteproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEstudiante1)
                    .addComponent(txtIdEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEstudiante1)
                    .addComponent(txtNombreEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEstudiante2)
                    .addComponent(txtIdEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEstudiante2)
                    .addComponent(txtNombreEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDirector)
                    .addComponent(txtNombreDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCoDirector)
                    .addComponent(txtNombreCoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObjetivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblRegistrarFormatoA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRegistrarFormatoA.setText("Registar Formato A");

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(lblRegistrarFormatoA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNotificaciones))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCerrarSesion)))
                .addGap(12, 12, 12)
                .addComponent(lblRegistrarFormatoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        objGuiInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        FormatoADTO objFA = new FormatoADTO();
        objFA.setCodigoAnteproyecto(Long.parseLong(txtCodigoAnteproyecto.getText()));
        objFA.setNombrePrograma(txtNombrePrograma.getText());
        objFA.setTituloAnteproyecto(txtTituloAnteproyecto.getText());
        objFA.setIdEstudiante1(Long.valueOf(txtIdEstudiante1.getText()));
        objFA.setNomEstudiante1(txtNombreEstudiante1.getText());
        String id2=txtIdEstudiante2.getText();
        if(id2.compareTo("")==0){
            objFA.setIdEstudiante2(-1);
        }else{
            objFA.setIdEstudiante2(Long.parseLong(id2));
        }
        
        objFA.setNomEstudiante2(txtNombreEstudiante2.getText());
        objFA.setNombreDirector(txtNombreDirector.getText());
        objFA.setNombreCoDirector(txtNombreCoDirector.getText());
        objFA.setObjetivos(txtObjetivos.getText());
        try {
            if (validarCamposVacios()) {
                objCO = ClienteDeObjetos.getInstancia();
                if (objCO.getObjRemotoAnteproyectos().registrarFormatoA(objFA)) {
                    JOptionPane.showMessageDialog(this, "Formato TI-A ha sido registrado correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    int mes = JOptionPane.showConfirmDialog(this, "Desea registrar otro Formato TI-A", "INFO", JOptionPane.YES_NO_OPTION);
                    if (mes == 0) {
                        try {
                            txtCodigoAnteproyecto.setText(String.valueOf(objCO.getObjRemotoAnteproyectos().generarCodigo()));
                            //txtIdEstudiante1 = new JFormattedTextField(new Long(3));
                        } catch (Exception e) {
                        }
                    } else if (mes == 1) {
                        objGuiInicioSesion.setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ha ocurrido un error al registrar el formato", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                System.out.println("Tamaño Lista: " + objCO.getObjRemotoAnteproyectos().consultarFormatoA().size());
                System.out.println("Id Es1: " + txtIdEstudiante1.getText());
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnGuardarActionPerformed
    private boolean validarCamposVacios() {
        if (txtNombrePrograma.getText().length() == 0 || txtTituloAnteproyecto.getText().length() == 0 || txtIdEstudiante1.getText().length() == 0 || txtNombreEstudiante1.getText().length() == 0 || txtNombreDirector.getText().length() == 0 || txtObjetivos.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Se debe diligenciar todos los campos del formulario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    private void txtIdEstudiante1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEstudiante1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIdEstudiante1KeyTyped

    private void txtIdEstudiante2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEstudiante2KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIdEstudiante2KeyTyped

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
            java.util.logging.Logger.getLogger(GUIDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDirector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoAnteproyecto;
    private javax.swing.JLabel lblIdEstudiante1;
    private javax.swing.JLabel lblIdEstudiante2;
    private javax.swing.JLabel lblNombreCoDirector;
    private javax.swing.JLabel lblNombreDirector;
    private javax.swing.JLabel lblNombreEstudiante1;
    private javax.swing.JLabel lblNombreEstudiante2;
    private javax.swing.JLabel lblNombrePrograma;
    private javax.swing.JLabel lblObjetivos;
    private javax.swing.JLabel lblRegistrarFormatoA;
    private javax.swing.JLabel lblTituloAnteproyecto;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtCodigoAnteproyecto;
    private javax.swing.JTextField txtIdEstudiante1;
    private javax.swing.JTextField txtIdEstudiante2;
    private javax.swing.JTextField txtNombreCoDirector;
    private javax.swing.JTextField txtNombreDirector;
    private javax.swing.JTextField txtNombreEstudiante1;
    private javax.swing.JTextField txtNombreEstudiante2;
    private javax.swing.JTextField txtNombrePrograma;
    private javax.swing.JTextField txtNotificaciones;
    private javax.swing.JTextArea txtObjetivos;
    private javax.swing.JTextField txtTituloAnteproyecto;
    // End of variables declaration//GEN-END:variables
}