/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vistas;

import SGestionAnteproyectos.dto.FormatoBDTO;
import cliente.ClienteDeObjetos;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class GUIJefeDepto extends javax.swing.JFrame {

    GUIInicioSesion objGuiInicioSesion;
    ClienteDeObjetos atrCO;
    List<FormatoBDTO> atrList;

    /**
     * Creates new form GUIJefeDepto
     */
    public GUIJefeDepto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public GUIJefeDepto(GUIInicioSesion prmGUI) {
        initComponents();
        this.setLocationRelativeTo(null);
        objGuiInicioSesion = prmGUI;
        cargarFormatos();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/iconApp.png"));
        return retValue;
    }

    public void cargarFormatos() {
        try {
            atrCO = ClienteDeObjetos.getInstancia();
            atrList = atrCO.getObjRemotoAnteproyectos().consultarFormatoB();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Codigo Anteproyecto");
            model.addColumn("Id Evaluador");
            for (FormatoBDTO formatoB : atrList) {
                Object[] obj = new Object[]{formatoB.getCodigoAnteproyecto(), formatoB.getIdEvaluador()};
                model.addRow(obj);
            }
            tblFormatos.setModel(model);
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

        pnlFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFormatos = new javax.swing.JTable();
        lbFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JEFE DE DEPARTAMENTO");
        setAlwaysOnTop(true);
        setIconImage(getIconImage());

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFormatos.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tblFormatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblFormatos.setEnabled(false);
        jScrollPane1.setViewportView(tblFormatos);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 470, 320));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoJefeD.jpg"))); // NOI18N
        pnlFondo.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 360));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarFormato.png"))); // NOI18N
        jMenu1.setText("Registrar Fomato C");
        jMenu1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrarS.png"))); // NOI18N
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
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        objGuiInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        GUIFC vtn = new GUIFC(this, atrList);
        vtn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTable tblFormatos;
    // End of variables declaration//GEN-END:variables
}
