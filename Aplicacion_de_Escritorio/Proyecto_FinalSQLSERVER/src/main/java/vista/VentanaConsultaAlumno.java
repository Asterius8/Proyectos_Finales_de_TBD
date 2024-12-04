package vista;

import Controlador.AlumnosDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaConsultaAlumno extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public VentanaConsultaAlumno() throws SQLException {
        initComponents();
        modelo = (DefaultTableModel) tbl_alumnos.getModel();
        this.mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jrb_num_control = new javax.swing.JRadioButton();
        jrb_paterno = new javax.swing.JRadioButton();
        jrb_nombres = new javax.swing.JRadioButton();
        jrb_materno = new javax.swing.JRadioButton();
        jrb_fecha_nac = new javax.swing.JRadioButton();
        jrb_num_telefono = new javax.swing.JRadioButton();
        jrb_edad = new javax.swing.JRadioButton();
        jrb_carrera = new javax.swing.JRadioButton();
        jrb_semestre = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_alumnos = new javax.swing.JTable();
        txt_num_control = new javax.swing.JTextField();
        txt_fecha_nac = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        txt_num_telefono = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        cmb_semestres = new javax.swing.JComboBox<>();
        cmb_carrera = new javax.swing.JComboBox<>();
        jrb_mostrar_todo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        lbl_titulo.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        lbl_titulo.setText("Buscar Alumno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_imagen)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_imagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(45, 45, 45))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        bg1.add(jrb_num_control);
        jrb_num_control.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_num_control.setText("Numero de Control:");
        jrb_num_control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_num_controlActionPerformed(evt);
            }
        });

        bg1.add(jrb_paterno);
        jrb_paterno.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_paterno.setText("Apellido Paterno:");

        bg1.add(jrb_nombres);
        jrb_nombres.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_nombres.setText("Nombres:");

        bg1.add(jrb_materno);
        jrb_materno.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_materno.setText("Apellido Materno:");

        bg1.add(jrb_fecha_nac);
        jrb_fecha_nac.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_fecha_nac.setText("Fecha de Nacimiento (aaaa-mm-dd):");

        bg1.add(jrb_num_telefono);
        jrb_num_telefono.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_num_telefono.setText("Numero de Telefono:");

        bg1.add(jrb_edad);
        jrb_edad.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_edad.setText("Edad:");

        bg1.add(jrb_carrera);
        jrb_carrera.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_carrera.setText("Carrera:");

        bg1.add(jrb_semestre);
        jrb_semestre.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_semestre.setText("Semestre: ");

        tbl_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de control", "Nombres", "Ap. Paterno", "Ap. Materno", "Fecha de Nacimiento", "Edad", "Telefono", "Semestre", "Carrera"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_alumnos);

        txt_paterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paternoActionPerformed(evt);
            }
        });

        cmb_semestres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cmb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "ISC", "IM", "IIA", "LA", "CP" }));

        bg1.add(jrb_mostrar_todo);
        jrb_mostrar_todo.setSelected(true);
        jrb_mostrar_todo.setText("Mostrar Todo");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrb_fecha_nac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fecha_nac))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jrb_materno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_materno))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrb_paterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_paterno))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrb_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrb_num_control)
                        .addGap(25, 25, 25)
                        .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_edad)
                            .addComponent(jrb_num_telefono)
                            .addComponent(jrb_semestre)
                            .addComponent(jrb_carrera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_semestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_edad)
                                .addComponent(txt_num_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_mostrar_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_num_control)
                    .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrb_mostrar_todo))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrb_nombres)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrb_paterno)
                            .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrb_materno)
                            .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrb_fecha_nac)
                            .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrb_edad)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrb_num_telefono)
                            .addComponent(txt_num_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrb_semestre)
                            .addComponent(cmb_semestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_carrera)
                            .addComponent(cmb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_num_controlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_num_controlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_num_controlActionPerformed

    private void tbl_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alumnosMouseClicked

    }//GEN-LAST:event_tbl_alumnosMouseClicked

    private void txt_paternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paternoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jrb_num_control.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorNumDAO(txt_num_control.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_nombres.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorNombreDAO(txt_nombres.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_paterno.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorPaternoDAO(txt_paterno.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_materno.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorMaternoDAO(txt_materno.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_fecha_nac.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorFechaNacDAO(txt_fecha_nac.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_edad.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorEdadDAO(txt_edad.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_num_telefono.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorNumTelefonoDAO(txt_num_telefono.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_semestre.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorSemestreDAO(cmb_semestres.getSelectedItem().toString());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_carrera.isSelected()) {

            try {

                ResultSet rs = AlumnosDAO.buscarPorCarreraDAO(cmb_carrera.getSelectedItem().toString());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                mostrar();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaConsultaAlumno().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JComboBox<String> cmb_carrera;
    private javax.swing.JComboBox<String> cmb_semestres;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrb_carrera;
    private javax.swing.JRadioButton jrb_edad;
    private javax.swing.JRadioButton jrb_fecha_nac;
    private javax.swing.JRadioButton jrb_materno;
    private javax.swing.JRadioButton jrb_mostrar_todo;
    private javax.swing.JRadioButton jrb_nombres;
    private javax.swing.JRadioButton jrb_num_control;
    private javax.swing.JRadioButton jrb_num_telefono;
    private javax.swing.JRadioButton jrb_paterno;
    private javax.swing.JRadioButton jrb_semestre;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tbl_alumnos;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_fecha_nac;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_num_control;
    private javax.swing.JTextField txt_num_telefono;
    private javax.swing.JTextField txt_paterno;
    // End of variables declaration//GEN-END:variables

    public void mostrar() throws SQLException {

        ResultSet rs = AlumnosDAO.buscar();

        String datos[] = new String[9];

        //vaciar filas anteriores
        modelo.setRowCount(0);

        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            datos[6] = rs.getString(7);
            datos[7] = rs.getString(8);
            datos[8] = rs.getString(9);
            modelo.addRow(datos);

        }

    }

    public void mostrarfiltrados(ResultSet rs) throws SQLException {

        String datos[] = new String[9];

        //vaciar filas anteriores
        modelo.setRowCount(0);

        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            datos[6] = rs.getString(7);
            datos[7] = rs.getString(8);
            datos[8] = rs.getString(9);
            modelo.addRow(datos);

        }

    }

}
