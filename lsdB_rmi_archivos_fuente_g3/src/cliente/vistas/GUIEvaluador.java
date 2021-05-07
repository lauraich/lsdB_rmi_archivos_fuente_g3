/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.FormatoBDTO;
import SGestionAnteproyectos.dto.UsuarioDTO;
import cliente.ClienteDeObjetos;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class GUIEvaluador extends javax.swing.JFrame {
     GUIInicioSesion objGuiInicioSesion;
     ClienteDeObjetos atrCO;
     List<FormatoBDTO> listFB;
     UsuarioDTO atrUser;
    /**
     * Creates new form GUIEvaluador
     */
    public GUIEvaluador() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
    public GUIEvaluador(GUIInicioSesion prmGUI, UsuarioDTO prmUsuario) {
        initComponents();
         this.setLocationRelativeTo(null);
        objGuiInicioSesion = prmGUI;
        atrUser=prmUsuario;
        cargarFormatos();
    }
    public void cargarFormatos(){
        try {
            atrCO=ClienteDeObjetos.getInstancia();
            listFB=atrCO.getObjRemotoAnteproyectos().consultarFormatosEvaluador(atrUser.getIdentificacion());
            DefaultTableModel model=new DefaultTableModel();
            model.addColumn("Id Anteproyecto");
            model.addColumn("ID Evaluador");
            for (FormatoBDTO formatoB : listFB) {
                Object[] obj= new Object[]{formatoB.getCodigoAnteproyecto(), formatoB.getIdEvaluador()};
                model.addRow(obj);
            }
            tblFormatosA.setModel(model);
        } catch (Exception e) {
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

        pnlfondo = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFormatosA = new javax.swing.JTable();
        lblListado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EVALUADOR");
        setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        setIconImage(getIconImage());

        pnlfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(153, 153, 255));

        tblFormatosA.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tblFormatosA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo Anteproyecto", "Id Evaluador"
            }
        ));
        jScrollPane1.setViewportView(tblFormatosA);

        lblListado.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblListado.setText("Listado de anteproyectos");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListado)
                .addGap(273, 273, 273))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblListado)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pnlfondo.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 780, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarFormato.png"))); // NOI18N
        jMenu1.setText("Registrar Formato B");
        jMenu1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrarS.png"))); // NOI18N
        jMenu2.setText("Salir");
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
            .addComponent(pnlfondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
      GUIFB vtn=new GUIFB(this, listFB);
      vtn.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        objGuiInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(GUIEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEvaluador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListado;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnlfondo;
    private javax.swing.JTable tblFormatosA;
    // End of variables declaration//GEN-END:variables
}
