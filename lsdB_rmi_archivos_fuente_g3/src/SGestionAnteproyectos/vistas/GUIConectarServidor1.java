/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.vistas;

import SGestionAnteproyectos.ServidorDeObjetos1;
import java.awt.Image;
import java.awt.Toolkit;
import java.rmi.RemoteException;

/**
 *
 * @author Laura
 */
public class GUIConectarServidor1 extends javax.swing.JFrame {

    static GUIConectarServidor1 vistaGestion;

    /**
     * Creates new form GUIConectarServidor1
     */
    public GUIConectarServidor1() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        lblDireccionIp1 = new javax.swing.JLabel();
        txtDireccionIp1 = new javax.swing.JTextField();
        lblTituloCnx1 = new javax.swing.JLabel();
        lblPuerto1 = new javax.swing.JLabel();
        txtPuerto1 = new javax.swing.JTextField();
        btnConectarS1 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONECTAR SERVIDOR DE GESTION");
        setIconImage(getIconImage());

        jPanel1.setPreferredSize(new java.awt.Dimension(423, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDireccionIp1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblDireccionIp1.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccionIp1.setText("Cual es el la dirección ip donde se encuentra  el n_s");
        jPanel1.add(lblDireccionIp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 79, -1, -1));

        txtDireccionIp1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtDireccionIp1.setText("localhost");
        jPanel1.add(txtDireccionIp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 117, 227, -1));

        lblTituloCnx1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblTituloCnx1.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloCnx1.setText("Conexion Servidor");
        jPanel1.add(lblTituloCnx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 36, -1, -1));

        lblPuerto1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblPuerto1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuerto1.setText("Cual es el número de puerto por el cual escucha el n_s");
        jPanel1.add(lblPuerto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 172, -1, -1));

        txtPuerto1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtPuerto1.setText("2021");
        jPanel1.add(txtPuerto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 210, 224, -1));

        btnConectarS1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnConectarS1.setText("Conectar");
        btnConectarS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarS1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectarS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 267, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 420, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarS1ActionPerformed
        String IP = txtDireccionIp1.getText();
        int puerto = Integer.parseInt(txtPuerto1.getText());
        try {
            ServidorDeObjetos1 SO = new ServidorDeObjetos1(IP, puerto);
            SO.conectar();
            this.dispose();
        } catch (RemoteException ex) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + ex.getMessage());
        }
    }//GEN-LAST:event_btnConectarS1ActionPerformed

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/iconApp.png"));
        return retValue;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectarS1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDireccionIp1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPuerto1;
    private javax.swing.JLabel lblTituloCnx1;
    private javax.swing.JTextField txtDireccionIp1;
    private javax.swing.JTextField txtPuerto1;
    // End of variables declaration//GEN-END:variables
}
