/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.UsuarioDTO;
import cliente.ClienteDeObjetos;
import java.awt.Image;
import java.awt.Toolkit;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juanf
 */
public class GUIFormularioUsuario extends javax.swing.JFrame {

    GUIAdmin atrGUIAdmin;
    ClienteDeObjetos atrCO;
    int atrCreacion = 1;
    boolean banderaActualizar = false;

    /**
     * Creates new form GUICrearUsuario
     */
    public GUIFormularioUsuario() {
        initComponents();
    }

    public GUIFormularioUsuario(GUIAdmin prmGUI, int prmAccion) {
        initComponents();
        atrCreacion = prmAccion;
        atrGUIAdmin = prmGUI;
        if (prmAccion == 1) {
            lblRegistrarUsuario.setText("Registrar Usuario");
            setTitle("REGISTRAR USUARIO");
            panelMain.setVisible(true);
            btnBuscar.setVisible(false);
            banderaActualizar = false;
        } else if (prmAccion == 2) {
            setTitle("ACTUALIZAR USUARIO");
            lblRegistrarUsuario.setText("Actualizar Usuario");
            panelMain.setVisible(false);
            btnBuscar.setVisible(true);
            banderaActualizar = true;
        } else {
            setTitle("CONSULTAR USUARIO");
            banderaActualizar = false;
            lblRegistrarUsuario.setText("Info Usuario");
            //btnGuardar.setText("Volver");
            panelMain.setVisible(false);
            btnBuscar.setVisible(true);
        }
    }
@Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/iconApp.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        lblRegistrarUsuario = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        txtDepartamento = new javax.swing.JTextField();
        lblIDepartamento = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORULARIO USUARIO");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdentificacion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        lblIdentificacion.setText("Identificación:");
        jPanel1.add(lblIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        txtIdentificacion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 230, -1));

        lblRegistrarUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarUsuario.setText("Registrar Usuario");
        jPanel1.add(lblRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        panelMain.setBackground(new java.awt.Color(204, 204, 204));

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre Completo:");

        lblRole.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblRole.setText("Rol:");

        cmbRole.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "COORDINADOR", "DIRECTOR", "EVALUADOR", "JEFE DEPARTAMENTO", "DECANO" }));

        txtDepartamento.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lblIDepartamento.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblIDepartamento.setText("Departamento:");

        lblUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblPassword.setText("Contraseña:");

        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(lblIDepartamento)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblRole)
                            .addComponent(lblUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre)
                            .addComponent(txtDepartamento)
                            .addComponent(txtUsuario)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(88, 88, 88))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRole)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDepartamento)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        jPanel1.add(panelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupaBuscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        btnVolver.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FondoRegistroU.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 570, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            atrCO = ClienteDeObjetos.getInstancia();
            long id = Long.parseLong(txtIdentificacion.getText());
            String nombre = txtNombre.getText();
            String departamento = txtDepartamento.getText();
            String usuario = txtUsuario.getText();
            String password = txtPassword.getText();
            String rol = (String) cmbRole.getSelectedItem();
            UsuarioDTO objUsuario = new UsuarioDTO(id, nombre, rol, departamento, usuario, password);
            if (validarCamposVacios()) {
                if (atrCO.getObjRemotoUsuarios().consultarUsuario(id) != null || atrCO.getObjRemotoUsuarios().existeUsuario(usuario)) {
                    JOptionPane.showMessageDialog(this, "Ya existe un usuario con la información suministrada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (nombre.length() > 65) {
                        JOptionPane.showMessageDialog(this, "El nombre y apellido no puede tener más de 64 caracteres", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (validar(usuario, "El Usuario ") && validar(password, "La Contraseña ")) {

                            if (atrCreacion == 1) {

                                if (atrCO.getObjRemotoUsuarios().registrarUsuario(objUsuario)) {
                                    JOptionPane.showMessageDialog(this, "Usuario registrado correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
                                    this.dispose();
                                } else {
                                    JOptionPane.showMessageDialog(this, "El usuario no se pudo registrar", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                            } else if (atrCreacion == 2) {
                                if (atrCO.getObjRemotoUsuarios().modificarUsuario(objUsuario)) {
                                    JOptionPane.showMessageDialog(this, "Usuario Actualizado correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            this.dispose();
                            atrGUIAdmin.mostrarUsuarios();
                        }
                    }
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GUIFormularioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    public boolean validarCamposVacios() {
        if (txtIdentificacion.getText().length() == 0 || txtDepartamento.getText().length() == 0 || txtNombre.getText().length() == 0 || cmbRole.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Se debe diligenciar todos los campos del formulario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }

    public boolean validar(String prmCadena, String credencial) {
        if (prmCadena.length() < 9) {
            JOptionPane.showMessageDialog(this, credencial + " debe de ser de 8 caracteres", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        char textoIngresado;

        byte conNumero = 0, conLetra = 0;

        for (byte i = 0; i < prmCadena.length(); i++) {
            textoIngresado = prmCadena.charAt(i);
            String aux = String.valueOf(textoIngresado);

            if (aux.matches("[a-z]") || aux.matches("[A-Z]")) {
                conLetra++;
            } else if (aux.matches("[0-9]")) {
                conNumero++;
            }
        }

        if (conNumero > 0 && conLetra > 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, credencial + " debe de tener numeros y letras", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            atrCO = ClienteDeObjetos.getInstancia();
            long id = Long.parseLong(txtIdentificacion.getText());
            UsuarioDTO objUsuario = atrCO.getObjRemotoUsuarios().consultarUsuario(id);
            if (objUsuario != null) {
                if (banderaActualizar) {
                    if (objUsuario.getRole() == "ADMIN") {
                        JOptionPane.showMessageDialog(this, "El usuario ingresado es admin por lo que no se puede modificar su información", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    panelMain.setVisible(true);
                    btnBuscar.setVisible(false);
                    txtNombre.setText(objUsuario.getNombreCompleto());
                    cmbRole.setSelectedItem(objUsuario.getRole());
                    txtDepartamento.setText(objUsuario.getDepartamento());
                    txtUsuario.setText(objUsuario.getUsuario());
                    txtPassword.setText(objUsuario.getPassword());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario No Encontrado", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        try {
            this.dispose();
            atrGUIAdmin.mostrarUsuarios();
        } catch (RemoteException ex) {
            Logger.getLogger(GUIFormularioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIDepartamento;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegistrarUsuario;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
