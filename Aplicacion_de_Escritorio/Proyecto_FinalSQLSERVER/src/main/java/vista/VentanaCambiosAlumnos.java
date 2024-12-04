package vista;

import Controlador.AlumnosDAO;
import Modelo.Alumnos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaCambiosAlumnos extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public VentanaCambiosAlumnos() throws SQLException {
        initComponents();
        modelo = (DefaultTableModel) tbl_alumnos.getModel();
        this.mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_intruccion = new javax.swing.JLabel();
        lbl_num_control = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_paterno = new javax.swing.JLabel();
        lbl_materno = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        lbl_edad = new javax.swing.JLabel();
        lbl_semestre = new javax.swing.JLabel();
        lbl_carrera = new javax.swing.JLabel();
        txt_num_control = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        txt_fecha_nac = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        cmb_semestres = new javax.swing.JComboBox<>();
        cmb_carreras = new javax.swing.JComboBox<>();
        btn_editar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_alumnos = new javax.swing.JTable();
        lbl_num_telefonico = new javax.swing.JLabel();
        txt_num_telefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        lbl_titulo.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        lbl_titulo.setText("Editar Alumno");

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_imagen)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(lbl_imagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        lbl_intruccion.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        lbl_intruccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_intruccion.setText("Haga click sobre el registro que desea editar.");

        lbl_num_control.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_num_control.setForeground(new java.awt.Color(255, 255, 255));
        lbl_num_control.setText("Numero de Control:");

        lbl_nombres.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setText("Nombres:");

        lbl_paterno.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_paterno.setForeground(new java.awt.Color(255, 255, 255));
        lbl_paterno.setText("Apellido Paterno");

        lbl_materno.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_materno.setForeground(new java.awt.Color(255, 255, 255));
        lbl_materno.setText("Apellido Materno");

        lbl_fecha.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha.setText("Fecha de nacimiento(aaaa-mm-dd):");

        lbl_edad.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_edad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_edad.setText("Edad:");

        lbl_semestre.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_semestre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_semestre.setText("Semestre:");

        lbl_carrera.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_carrera.setForeground(new java.awt.Color(255, 255, 255));
        lbl_carrera.setText("Carrera:");

        txt_num_control.setEnabled(false);

        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });

        txt_paterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paternoKeyTyped(evt);
            }
        });

        txt_materno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_maternoKeyTyped(evt);
            }
        });

        txt_fecha_nac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_nacKeyTyped(evt);
            }
        });

        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });

        cmb_semestres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cmb_carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "ISC", "IM", "IIA", "LA", "CP" }));

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
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
        tbl_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_alumnos);

        lbl_num_telefonico.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lbl_num_telefonico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_num_telefonico.setText("Numero telefonico:");

        txt_num_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_telefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_num_telefonico)
                        .addGap(18, 18, 18)
                        .addComponent(txt_num_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_fecha)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fecha_nac))
                            .addComponent(lbl_intruccion)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_carrera)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_edad)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_semestre)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmb_semestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_materno)
                                .addGap(18, 18, 18)
                                .addComponent(txt_materno))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_paterno)
                                .addGap(18, 18, 18)
                                .addComponent(txt_paterno))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_nombres)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombres))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_num_control)
                                .addGap(18, 18, 18)
                                .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_intruccion)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_num_control)
                            .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombres)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_paterno)
                            .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_materno)
                            .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fecha)
                            .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_edad)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_num_telefonico)
                    .addComponent(txt_num_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_semestre)
                    .addComponent(cmb_semestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_carrera)
                    .addComponent(cmb_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        //Verificador de cajas llenas
        if (!(txt_num_control.getText().equals("") || txt_nombres.getText().equals("") || txt_paterno.getText().equals("") || txt_materno.getText().equals("") || txt_fecha_nac.getText().equals("") || txt_num_telefono.getText().equals("") || cmb_semestres.getSelectedIndex() == 0 || cmb_carreras.getSelectedIndex() == 0)) {

            int num_control = Integer.parseInt(txt_num_control.getText());
            String nombre = txt_nombres.getText();
            String paterno = txt_paterno.getText();
            String materno = txt_materno.getText();
            String fecha_nac = txt_fecha_nac.getText();
            byte edad = Byte.parseByte(txt_edad.getText());
            long telefono = Long.parseLong(txt_num_telefono.getText());
            byte semestre = (byte) cmb_semestres.getSelectedIndex();
            String carrera = String.valueOf(cmb_carreras.getSelectedItem());
            byte contador = 0;

            for (int i = 0; i < fecha_nac.length(); i++) {

                if (fecha_nac.charAt(i) == '-') {

                    contador++;

                }
            }

            if (contador == 2) {

                String[] fecha;
                fecha = fecha_nac.split("-");

                if (fecha[0].length() == 4) {

                    if (fecha[1].length() == 2 && Integer.parseInt(fecha[1]) >= 01 && Integer.parseInt(fecha[1]) <= 12) {

                        if (fecha[2].length() == 2 && Integer.parseInt(fecha[2]) >= 01 && Integer.parseInt(fecha[2]) <= 31) {

                            if (AlumnosDAO.cambiosAlumnoDAO(new Alumnos(num_control, nombre, paterno, materno, fecha_nac, edad, telefono, semestre, carrera))) {

                                try {
                                    JOptionPane.showMessageDialog(this, "Exito");
                                    mostrar();
                                    this.limpiezaComponentes();
                                } catch (SQLException ex) {
                                    Logger.getLogger(VentanaCambiosAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Sea tan amable de ingresar la fecha en formato (aaaa-mm-dd)");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Sea tan amable de ingresar la fecha en formato (aaaa-mm-dd)");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Sea tan amable de ingresar la fecha en formato (aaaa-mm-dd)");
                }

            } else {

                JOptionPane.showMessageDialog(this, "Sea tan amable de ingresar la fecha en formato (aaaa-mm-dd)");

            }

        } else {

            JOptionPane.showMessageDialog(this, "Sea tan amable de llenar todos los campos...");

        }

    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        limpiezaComponentes();

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && !Character.isWhitespace(c)) { // Permitir solo letras y espacios

            evt.consume(); // Ignorar el evento

        }    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_paternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paternoKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isLetter(c)) { // Permitir solo letras

            evt.consume(); // Ignorar el evento

        }

    }//GEN-LAST:event_txt_paternoKeyTyped

    private void txt_maternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_maternoKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isLetter(c)) { // Permitir solo letras

            evt.consume(); // Ignorar el evento

        }

    }//GEN-LAST:event_txt_maternoKeyTyped

    private void txt_fecha_nacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_nacKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-' || txt_fecha_nac.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_fecha_nacKeyTyped

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_edad.getText().length() >= 2) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_edadKeyTyped

    private void txt_num_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_telefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_telefonoKeyTyped

    private void tbl_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alumnosMouseClicked

        txt_num_control.setText(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 0).toString());
        txt_nombres.setText(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 1).toString());
        txt_paterno.setText(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 2).toString());
        txt_materno.setText(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 3).toString());
        txt_fecha_nac.setText(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 4).toString());
        txt_edad.setText(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 5).toString());
        txt_num_telefono.setText(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 6).toString());
        cmb_semestres.setSelectedItem(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 7).toString());
        cmb_carreras.setSelectedItem(modelo.getValueAt(tbl_alumnos.getSelectedRow(), 8).toString());

    }//GEN-LAST:event_tbl_alumnosMouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        VentanaHubTutor vht = new VentanaHubTutor();
        vht.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCambiosAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCambiosAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCambiosAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCambiosAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaCambiosAlumnos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaCambiosAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cmb_carreras;
    private javax.swing.JComboBox<String> cmb_semestres;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_carrera;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_intruccion;
    private javax.swing.JLabel lbl_materno;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_num_control;
    private javax.swing.JLabel lbl_num_telefonico;
    private javax.swing.JLabel lbl_paterno;
    private javax.swing.JLabel lbl_semestre;
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

    public void limpiezaComponentes() {

        txt_num_control.setText("");
        txt_nombres.setText("");
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_fecha_nac.setText("");
        txt_edad.setText("");
        txt_num_telefono.setText("");
        cmb_semestres.setSelectedIndex(0);
        cmb_carreras.setSelectedIndex(0);

    }

}
