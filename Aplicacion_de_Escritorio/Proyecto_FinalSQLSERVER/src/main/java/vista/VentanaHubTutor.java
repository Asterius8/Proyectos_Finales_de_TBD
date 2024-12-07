package vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VentanaHubTutor extends javax.swing.JFrame {

    public VentanaHubTutor() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Pagina principal Tutor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        lbl_bienvenido = new javax.swing.JLabel();
        lbl_intrucciones = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_seccion_alumnos = new javax.swing.JLabel();
        btn_registrar_alumnos = new javax.swing.JButton();
        btn_eliminar_alumnos = new javax.swing.JButton();
        btn_editar_alumnos = new javax.swing.JButton();
        btn_buscar_alumnos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_seccion_reportes = new javax.swing.JLabel();
        btn_registrar_reporte = new javax.swing.JButton();
        btn_eliminar_reporte = new javax.swing.JButton();
        btn_editar_reporte = new javax.swing.JButton();
        btn_buscar_reporte = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_bienvenido.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbl_bienvenido.setText("Bienvenido");

        lbl_intrucciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_intrucciones.setText("Seleccione accion desea realizar:");

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        lbl_seccion_alumnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_seccion_alumnos.setText("Alumnos:");

        btn_registrar_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notes_768920.png"))); // NOI18N
        btn_registrar_alumnos.setText("Registrar");
        btn_registrar_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_alumnosActionPerformed(evt);
            }
        });

        btn_eliminar_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete_12319395 (1).png"))); // NOI18N
        btn_eliminar_alumnos.setText("Eliminar");
        btn_eliminar_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_alumnosActionPerformed(evt);
            }
        });

        btn_editar_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/file_11235591 (1).png"))); // NOI18N
        btn_editar_alumnos.setText("Editar");
        btn_editar_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_alumnosActionPerformed(evt);
            }
        });

        btn_buscar_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/database_2596172.png"))); // NOI18N
        btn_buscar_alumnos.setText("Buscar");
        btn_buscar_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_alumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_registrar_alumnos)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar_alumnos)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar_alumnos))
                    .addComponent(lbl_seccion_alumnos))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_seccion_alumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        lbl_seccion_reportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_seccion_reportes.setText("Reportes");

        btn_registrar_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notes_768920.png"))); // NOI18N
        btn_registrar_reporte.setText("Registrar");
        btn_registrar_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_reporteActionPerformed(evt);
            }
        });

        btn_eliminar_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete_12319395 (1).png"))); // NOI18N
        btn_eliminar_reporte.setText("Eliminar");

        btn_editar_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/file_11235591 (1).png"))); // NOI18N
        btn_editar_reporte.setText("Editar");

        btn_buscar_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/database_2596172.png"))); // NOI18N
        btn_buscar_reporte.setText("Buscar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_registrar_reporte)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar_reporte)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar_reporte))
                    .addComponent(lbl_seccion_reportes))
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_seccion_reportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_intrucciones)
                    .addComponent(lbl_bienvenido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_bienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_intrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_alumnosActionPerformed

        VentanaAltaAlumnos vaa = new VentanaAltaAlumnos();
        vaa.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_registrar_alumnosActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed

        VentanaLoginTutor vlt = new VentanaLoginTutor();
        vlt.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminar_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_alumnosActionPerformed

        VentanaBajaAlumnos vba;
        try {
            vba = new VentanaBajaAlumnos();
            vba.setVisible(true);
        this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaHubTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_btn_eliminar_alumnosActionPerformed

    private void btn_editar_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_alumnosActionPerformed
        
        try {
            VentanaCambiosAlumnos vca = new VentanaCambiosAlumnos();
            vca.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaHubTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_editar_alumnosActionPerformed

    private void btn_buscar_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_alumnosActionPerformed

        try {
            VentanaConsultaAlumno vca1 = new VentanaConsultaAlumno();
            vca1.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaHubTutor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_buscar_alumnosActionPerformed

    private void btn_registrar_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_reporteActionPerformed

        

    }//GEN-LAST:event_btn_registrar_reporteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHubTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_alumnos;
    private javax.swing.JButton btn_buscar_reporte;
    private javax.swing.JButton btn_editar_alumnos;
    private javax.swing.JButton btn_editar_reporte;
    private javax.swing.JButton btn_eliminar_alumnos;
    private javax.swing.JButton btn_eliminar_reporte;
    private javax.swing.JButton btn_registrar_alumnos;
    private javax.swing.JButton btn_registrar_reporte;
    private javax.swing.JButton btn_salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_bienvenido;
    private javax.swing.JLabel lbl_intrucciones;
    private javax.swing.JLabel lbl_seccion_alumnos;
    private javax.swing.JLabel lbl_seccion_reportes;
    // End of variables declaration//GEN-END:variables
}
