package vista;

import Controlador.AlumnosDAO;
import Controlador.BitacoraDAO;
import Modelo.Bitacora;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaConsultarBitacoras extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public VentanaConsultarBitacoras() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Buscar Bitacoras de Tutorias");
        modelo = (DefaultTableModel) tbl_bitacoras.getModel();
        txt_id_bitacora.enable(false);
        txt_num_control.enable(false);
        txt_fecha_tutoria.enable(false);
        txt_duracion.enable(false);
        txt_observaciones.enable(false);
        mostrar(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbn_num_control = new javax.swing.JRadioButton();
        txt_num_control = new javax.swing.JTextField();
        rbn_fecha_tut = new javax.swing.JRadioButton();
        txt_fecha_tutoria = new javax.swing.JTextField();
        rbn_sesion = new javax.swing.JRadioButton();
        txt_duracion = new javax.swing.JTextField();
        rbn_observaciones = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        rbn_mostrar_todo = new javax.swing.JRadioButton();
        btn_buscar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_bitacoras = new javax.swing.JTable();
        rbn_id_bitacora = new javax.swing.JRadioButton();
        txt_id_bitacora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        lbl_titulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        lbl_titulo.setText("Buscar Bitacoras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_titulo)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(18, 203, 255));

        buttonGroup1.add(rbn_num_control);
        rbn_num_control.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbn_num_control.setText("Numero de Control del Estudiante:");
        rbn_num_control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_num_controlActionPerformed(evt);
            }
        });

        txt_num_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_controlKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbn_fecha_tut);
        rbn_fecha_tut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbn_fecha_tut.setText("Fecha de la Tutoria (aaaa-mm-dd):");
        rbn_fecha_tut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_fecha_tutActionPerformed(evt);
            }
        });

        txt_fecha_tutoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_tutoriaKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbn_sesion);
        rbn_sesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbn_sesion.setText("Duracion de la Sesion de Tutorias:");
        rbn_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_sesionActionPerformed(evt);
            }
        });

        txt_duracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_duracionKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbn_observaciones);
        rbn_observaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbn_observaciones.setText("Observaciones:");
        rbn_observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_observacionesActionPerformed(evt);
            }
        });

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane1.setViewportView(txt_observaciones);

        buttonGroup1.add(rbn_mostrar_todo);
        rbn_mostrar_todo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbn_mostrar_todo.setSelected(true);
        rbn_mostrar_todo.setText("Mostrar Todos");
        rbn_mostrar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_mostrar_todoActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        tbl_bitacoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_Bitacora", "Numero de control del estudiante", "Fecha de Tutoria", "Duracion en Horas", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_bitacoras);

        buttonGroup1.add(rbn_id_bitacora);
        rbn_id_bitacora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbn_id_bitacora.setText("Id_Bitacora");
        rbn_id_bitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_id_bitacoraActionPerformed(evt);
            }
        });

        txt_id_bitacora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_id_bitacoraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rbn_observaciones, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(rbn_sesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(rbn_fecha_tut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha_tutoria, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbn_num_control)
                                    .addComponent(rbn_id_bitacora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id_bitacora)
                                    .addComponent(txt_num_control))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbn_mostrar_todo))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbn_id_bitacora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_id_bitacora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbn_num_control)
                            .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbn_fecha_tut)
                            .addComponent(txt_fecha_tutoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbn_sesion)
                            .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rbn_observaciones))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(rbn_mostrar_todo)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void rbn_num_controlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_num_controlActionPerformed

        txt_id_bitacora.enable(false);
        txt_num_control.enable(true);
        txt_fecha_tutoria.enable(false);
        txt_duracion.enable(false);
        txt_observaciones.enable(false);

    }//GEN-LAST:event_rbn_num_controlActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        VentanaHubTutor vht = new VentanaHubTutor();
        vht.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_num_controlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_controlKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_num_control.getText().length() >= 8) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_num_controlKeyTyped

    private void txt_id_bitacoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id_bitacoraKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_id_bitacoraKeyTyped

    private void txt_fecha_tutoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_tutoriaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-' || txt_fecha_tutoria.getText().length() >= 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txt_fecha_tutoriaKeyTyped

    private void txt_duracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_duracionKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_duracion.getText().length() == 1) {

            evt.consume();

        }
    }//GEN-LAST:event_txt_duracionKeyTyped

    private void rbn_id_bitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_id_bitacoraActionPerformed

        txt_id_bitacora.enable(true);
        txt_num_control.enable(false);
        txt_fecha_tutoria.enable(false);
        txt_duracion.enable(false);
        txt_observaciones.enable(false);

    }//GEN-LAST:event_rbn_id_bitacoraActionPerformed

    private void rbn_fecha_tutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_fecha_tutActionPerformed

        txt_id_bitacora.enable(false);
        txt_num_control.enable(false);
        txt_fecha_tutoria.enable(true);
        txt_duracion.enable(false);
        txt_observaciones.enable(false);

    }//GEN-LAST:event_rbn_fecha_tutActionPerformed

    private void rbn_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_sesionActionPerformed

        txt_id_bitacora.enable(false);
        txt_num_control.enable(false);
        txt_fecha_tutoria.enable(false);
        txt_duracion.enable(true);
        txt_observaciones.enable(false);

    }//GEN-LAST:event_rbn_sesionActionPerformed

    private void rbn_observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_observacionesActionPerformed

        txt_id_bitacora.enable(false);
        txt_num_control.enable(false);
        txt_fecha_tutoria.enable(false);
        txt_duracion.enable(false);
        txt_observaciones.enable(true);    }//GEN-LAST:event_rbn_observacionesActionPerformed

    private void rbn_mostrar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_mostrar_todoActionPerformed

        txt_id_bitacora.enable(false);
        txt_num_control.enable(false);
        txt_fecha_tutoria.enable(false);
        txt_duracion.enable(false);
        txt_observaciones.enable(false);

    }//GEN-LAST:event_rbn_mostrar_todoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        if (rbn_id_bitacora.isSelected()) {

            try {

                ResultSet rs = BitacoraDAO.buscarPorIdDAO(txt_id_bitacora.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (rbn_num_control.isSelected()) {

            try {

                ResultSet rs = BitacoraDAO.buscarPorNumDAO(txt_num_control.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (rbn_fecha_tut.isSelected()) {

            byte contador = 0;
            String fecha_bitacora = txt_fecha_tutoria.getText();

            for (int i = 0; i < fecha_bitacora.length(); i++) {

                if (fecha_bitacora.charAt(i) == '-') {

                    contador++;

                }
            }

            if (contador == 2) {

                String[] fecha = new String[3];
                fecha = fecha_bitacora.split("-");

                if (fecha[0].length() == 4
                        && (fecha[1].length() == 2 && Integer.parseInt(fecha[1]) >= 01 && Integer.parseInt(fecha[1]) <= 12)
                        && (fecha[2].length() == 2 && Integer.parseInt(fecha[2]) >= 01 && Integer.parseInt(fecha[2]) <= 31)) {

                    try {

                        ResultSet rs = BitacoraDAO.buscarPorFechaDAO(txt_fecha_tutoria.getText());
                        mostrarfiltrados(rs);

                    } catch (SQLException ex) {

                        Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {

                    JOptionPane.showMessageDialog(this, "Ingrese la fecha como en la sugerencia.");

                }//If para verificar los 4 digitos de año

            } else {

                JOptionPane.showMessageDialog(this, "Ingrese la fecha como en la sugerencia.");

            }

        } else if (rbn_sesion.isSelected()) {
            
            try {

                ResultSet rs = BitacoraDAO.buscarPorDuracionDAO(txt_duracion.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        } else if (rbn_observaciones.isSelected()) {
            
            try {

                ResultSet rs = BitacoraDAO.buscarPorObservacionesDAO(txt_observaciones.getText());
                mostrarfiltrados(rs);

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                mostrar(modelo);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaConsultarBitacoras.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAltaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaConsultarBitacoras().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaConsultarBitacoras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JRadioButton rbn_fecha_tut;
    private javax.swing.JRadioButton rbn_id_bitacora;
    private javax.swing.JRadioButton rbn_mostrar_todo;
    private javax.swing.JRadioButton rbn_num_control;
    private javax.swing.JRadioButton rbn_observaciones;
    private javax.swing.JRadioButton rbn_sesion;
    private javax.swing.JTable tbl_bitacoras;
    private javax.swing.JTextField txt_duracion;
    private javax.swing.JTextField txt_fecha_tutoria;
    private javax.swing.JTextField txt_id_bitacora;
    private javax.swing.JTextField txt_num_control;
    private javax.swing.JTextArea txt_observaciones;
    // End of variables declaration//GEN-END:variables

    public void mostrar(DefaultTableModel modelo) throws SQLException {

        ResultSet rs = BitacoraDAO.consultaCompleta();

        String datos[] = new String[5];

        //vaciar filas anteriores
        modelo.setRowCount(0);

        while (rs.next()) {

            datos[0] = rs.getString(1);
            datos[1] = rs.getString(5);
            datos[2] = rs.getString(2);
            datos[3] = rs.getString(3);
            datos[4] = rs.getString(4);

            modelo.addRow(datos);

        }

    }

    public void mostrarfiltrados(ResultSet rs) throws SQLException {

        String datos[] = new String[5];

        //vaciar filas anteriores
        modelo.setRowCount(0);

        while (rs.next()) {

            datos[0] = rs.getString(1);
            datos[1] = rs.getString(5);
            datos[2] = rs.getString(2);
            datos[3] = rs.getString(3);
            datos[4] = rs.getString(4);

            modelo.addRow(datos);

        }

    }

}
