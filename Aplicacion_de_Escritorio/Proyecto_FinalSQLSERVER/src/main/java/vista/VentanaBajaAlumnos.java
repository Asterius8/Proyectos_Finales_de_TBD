package vista;

import Controlador.AlumnosDAO;
import Modelo.AlumnoCaretaker;
import Modelo.AlumnoMemento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaBajaAlumnos extends javax.swing.JFrame {

    DefaultTableModel modelo;
    private AlumnoCaretaker caretaker = new AlumnoCaretaker();

    public VentanaBajaAlumnos() throws SQLException {
        initComponents();
        modelo = (DefaultTableModel) tbl_alumnos.getModel();
        this.mostrar();
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
        lbl_eliminar = new javax.swing.JLabel();
        lbl_imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_intrucciones = new javax.swing.JLabel();
        lbl_num_control = new javax.swing.JLabel();
        txt_num_control = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_alumnos = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_deshacer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_eliminar.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        lbl_eliminar.setText("Eliminar Alumno");

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lbl_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_imagen)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(lbl_imagen))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_eliminar)
                .addGap(43, 43, 43))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        lbl_intrucciones.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_intrucciones.setForeground(new java.awt.Color(255, 255, 255));
        lbl_intrucciones.setText("Ingrese el numero de control del alumno que desea eliminar");

        lbl_num_control.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        lbl_num_control.setForeground(new java.awt.Color(255, 255, 255));
        lbl_num_control.setText("Numero de Control: ");

        txt_num_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_controlKeyTyped(evt);
            }
        });

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
        jScrollPane1.setViewportView(tbl_alumnos);

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_deshacer.setText("Deshacer");
        btn_deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deshacerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_intrucciones)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_num_control)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_deshacer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_intrucciones)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_num_control)
                    .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deshacer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_num_controlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_controlKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_num_control.getText().length() >= 8) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_num_controlKeyTyped

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        VentanaHubTutor vht = new VentanaHubTutor();
        vht.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        String numeroDeControl = txt_num_control.getText();

        if (!numeroDeControl.isEmpty()) {
            
            if (AlumnosDAO.BuscarNumControlIgualDAO2(numeroDeControl)) {
                // Obtener datos del alumno antes de eliminar
                ResultSet alumno = AlumnosDAO.buscarPorNumDAO(numeroDeControl);
                try {
                    if (alumno.next()) {
                        // Crear memento y guardarlo en el caretaker
                        AlumnoMemento memento = new AlumnoMemento(
                                alumno.getString(1), alumno.getString(2), alumno.getString(3),
                                alumno.getString(4), alumno.getString(5), alumno.getInt(6),
                                alumno.getString(7), alumno.getString(8), alumno.getString(9)
                        );
                        caretaker.saveMemento(memento);

                        // Eliminar al alumno
                        if (AlumnosDAO.eliminarAlumnoDAO(txt_num_control.getText())) {
                            JOptionPane.showMessageDialog(this, "Alumno eliminado correctamente");
                            mostrar();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaBajaAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún registro con ese número de control");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un número de control válido");
        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_deshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deshacerActionPerformed

        AlumnoMemento memento = caretaker.restoreMemento();
        if (memento != null) {
            if (AlumnosDAO.restaurarAlumnoDAO(memento)) {
                JOptionPane.showMessageDialog(this, "Alumno restaurado correctamente");
                try {
                    mostrar();
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaBajaAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo restaurar el alumno");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay alumnos para restaurar");
        }

    }//GEN-LAST:event_btn_deshacerActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaBajaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBajaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBajaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBajaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaBajaAlumnos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaBajaAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_deshacer;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_intrucciones;
    private javax.swing.JLabel lbl_num_control;
    private javax.swing.JTable tbl_alumnos;
    private javax.swing.JTextField txt_num_control;
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

}
