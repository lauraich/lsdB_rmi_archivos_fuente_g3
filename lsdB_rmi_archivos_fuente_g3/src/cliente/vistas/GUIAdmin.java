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
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.Element;
import javax.swing.text.TableView;

/**
 *
 * @author juanf
 */
public class GUIAdmin extends javax.swing.JFrame {
    GUIInicioSesion objGuiInicioSesion;
     ClienteDeObjetos atrCO;
    /**
     * Creates new form GUIAdmin
     */
    public GUIAdmin() {
        initComponents();
    }
    public GUIAdmin(GUIInicioSesion prmGUI) throws RemoteException {
        initComponents();
        objGuiInicioSesion=prmGUI;
        mostrarUsuarios();
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/iconApp.png"));
        return retValue;
    }
    public void mostrarUsuarios() throws RemoteException{
        this.setVisible(true);
        atrCO=ClienteDeObjetos.getInstancia();
        List<UsuarioDTO> listaUsuarios= atrCO.getObjRemotoUsuarios().listarUsuarios();
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre Completo");
        modelo.addColumn("Role");
        modelo.addColumn("Departameto");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        
        tableUsuarios.setEnabled(false);
        for (int i = 0; i < listaUsuarios.size(); i++) {
            UsuarioDTO Usuario=listaUsuarios.get(i);
            Object [] obj=new Object[]{Usuario.getIdentificacion(),Usuario.getNombreCompleto(),Usuario.getRole(),Usuario.getDepartamento(),Usuario.getUsuario(),Usuario.getPassword()};
            modelo.addRow(obj);
        }
        
        tableUsuarios.setModel(modelo);
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
        btnCerrarSesion = new javax.swing.JButton();
        lblMenuAdmin = new javax.swing.JLabel();
        btnRegistrarUsu = new javax.swing.JButton();
        btnModififcarUsu = new javax.swing.JButton();
        btnConsultarInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarSesion.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        btnCerrarSesion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        lblMenuAdmin.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblMenuAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuAdmin.setText("Menu Administrador");
        jPanel1.add(lblMenuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        btnRegistrarUsu.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));
        btnRegistrarUsu.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnRegistrarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarUsuario.png"))); // NOI18N
        btnRegistrarUsu.setText("Registrar Usuario");
        btnRegistrarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 210, -1));

        btnModififcarUsu.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        btnModififcarUsu.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnModififcarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/modificarUsuario.png"))); // NOI18N
        btnModififcarUsu.setText("Modificar Info Usuario");
        btnModififcarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModififcarUsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnModififcarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 210, -1));

        btnConsultarInfo.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        btnConsultarInfo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnConsultarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/consultar-Usuario.png"))); // NOI18N
        btnConsultarInfo.setText("Consultar Info Usuario");
        btnConsultarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 210, -1));

        tableUsuarios.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Role", "Departamento", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsuarios.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tableUsuarios);
        tableUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 660, 420));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo-admin.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
       //this.setVisible(false);
       this.dispose();
       objGuiInicioSesion.setVisible(true);
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegistrarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuActionPerformed
        this.setVisible(false);
        new GUIFormularioUsuario(this,1).setVisible(true);
    }//GEN-LAST:event_btnRegistrarUsuActionPerformed

    private void btnModififcarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModififcarUsuActionPerformed
        this.setVisible(false);
        new GUIFormularioUsuario(this,2).setVisible(true);
    }//GEN-LAST:event_btnModififcarUsuActionPerformed

    private void btnConsultarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarInfoActionPerformed
       this.setVisible(false);
        new GUIFormularioUsuario(this,3).setVisible(true);
    }//GEN-LAST:event_btnConsultarInfoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarInfo;
    private javax.swing.JButton btnModififcarUsu;
    private javax.swing.JButton btnRegistrarUsu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMenuAdmin;
    private javax.swing.JTable tableUsuarios;
    // End of variables declaration//GEN-END:variables
}
