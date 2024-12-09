package vista;

import Controlador.AlumnosDAO;
import Controlador.BitacoraDAO;
import Modelo.Bitacora;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.VentanaConsultarBitacoras;

public class VentanaCambiosBitacoras extends javax.swing.JFrame {

    DefaultTableModel modelo;
    int id_bitacora;

    public VentanaCambiosBitacoras() throws SQLException {

        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar bitacoras de tutorias");
        modelo = (DefaultTableModel) tbl_bitacoras.getModel();
        new VentanaConsultarBitacoras().mostrar(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_num_control = new javax.swing.JLabel();
        txt_num_control = new javax.swing.JTextField();
        lbl_fecha_tutoria = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        lbl_duracia = new javax.swing.JLabel();
        txt_duracion = new javax.swing.JTextField();
        lbl_observacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        btn_modificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_bitacoras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        lbl_titulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        lbl_titulo.setText("Modificar Bitacoras");

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
                .addGap(30, 30, 30)
                .addComponent(lbl_titulo)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        lbl_num_control.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_num_control.setText("Numero de Control del Alumno:");

        txt_num_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_controlKeyTyped(evt);
            }
        });

        lbl_fecha_tutoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_fecha_tutoria.setText("Fecha de la Tutoria (aaaa-mm-dd):");

        txt_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechaKeyTyped(evt);
            }
        });

        lbl_duracia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_duracia.setText("Duracion de la Sesion de Tutorias: ");

        txt_duracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_duracionKeyTyped(evt);
            }
        });

        lbl_observacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_observacion.setText("Obrservacion:");

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane1.setViewportView(txt_observaciones);

        btn_modificar.setText("Actualizar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
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

            },
            new String [] {
                "id_bitacora", "num_control", "fecha_tutorias", "duracion_tutorias", "observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_bitacoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bitacorasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_bitacoras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_observacion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl_duracia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lbl_num_control)
                                            .addGap(22, 22, 22)
                                            .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lbl_fecha_tutoria)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_num_control)
                            .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fecha_tutoria)
                            .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_duracia)
                            .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(lbl_observacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
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

    private void txt_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechaKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-' || txt_fecha.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_fechaKeyTyped

    private void txt_duracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_duracionKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_duracion.getText().length() == 1) {

            evt.consume();

        }


    }//GEN-LAST:event_txt_duracionKeyTyped

    private void tbl_bitacorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bitacorasMouseClicked

        id_bitacora = Integer.parseInt(modelo.getValueAt(tbl_bitacoras.getSelectedRow(), 0).toString());
        txt_num_control.setText(modelo.getValueAt(tbl_bitacoras.getSelectedRow(), 1).toString());
        txt_fecha.setText(modelo.getValueAt(tbl_bitacoras.getSelectedRow(), 2).toString());
        txt_duracion.setText(modelo.getValueAt(tbl_bitacoras.getSelectedRow(), 3).toString());
        txt_observaciones.setText(modelo.getValueAt(tbl_bitacoras.getSelectedRow(), 4).toString());

    }//GEN-LAST:event_tbl_bitacorasMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (!(txt_num_control.getText().equals("")) || !(txt_fecha.getText().equals("")) || !(txt_duracion.getText().equals("")) || !(txt_observaciones.getText().equals(""))) {

            int num_control = Integer.parseInt(txt_num_control.getText());

            byte duracion = Byte.parseByte(txt_duracion.getText());
            String observaciones = txt_observaciones.getText();
            byte contador = 0;
            String fecha_bitacora = txt_fecha.getText();

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

                    if (AlumnosDAO.BuscarNumControlIgualDAO2(String.valueOf(num_control))) {

                        if (BitacoraDAO.ModificiarDAO(new Bitacora(id_bitacora, fecha_bitacora, duracion, observaciones, num_control))) {
                            try {
                                new VentanaConsultarBitacoras().mostrar(modelo);
                            } catch (SQLException ex) {
                                Logger.getLogger(VentanaCambiosBitacoras.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            JOptionPane.showMessageDialog(this, "Bitacora modificada correctamente.");

                        }

                    } else {

                        JOptionPane.showMessageDialog(this, "No se encontro ningun alumno con ese numero de control.");

                    }//If para verificar que exista el alumno en la BD

                } else {

                    JOptionPane.showMessageDialog(this, "Ingrese la fecha como en la sugerencia.");

                }//If para verificar los 4 digitos de año

            } else {

                JOptionPane.showMessageDialog(this, "Ingrese la fecha como en la sugerencia.");

            }

        }
    }//GEN-LAST:event_btn_modificarActionPerformed

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
                    new VentanaCambiosBitacoras().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaCambiosBitacoras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_duracia;
    private javax.swing.JLabel lbl_fecha_tutoria;
    private javax.swing.JLabel lbl_num_control;
    private javax.swing.JLabel lbl_observacion;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tbl_bitacoras;
    private javax.swing.JTextField txt_duracion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_num_control;
    private javax.swing.JTextArea txt_observaciones;
    // End of variables declaration//GEN-END:variables

}
