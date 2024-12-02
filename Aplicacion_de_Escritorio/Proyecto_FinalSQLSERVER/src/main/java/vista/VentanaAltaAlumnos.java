package vista;

import javax.swing.JOptionPane;

public class VentanaAltaAlumnos extends javax.swing.JFrame {

    public VentanaAltaAlumnos() {

        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registrar Alumno");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_registro_alumnos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_num_control = new javax.swing.JLabel();
        txt_num_control = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_paterno = new javax.swing.JLabel();
        txt_paterno = new javax.swing.JTextField();
        lbl_materno = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        lbl_fecha_nac = new javax.swing.JLabel();
        txt_fecha_nac = new javax.swing.JTextField();
        lbl_num_telefono = new javax.swing.JLabel();
        txt_num_telefono = new javax.swing.JTextField();
        lbl_semestre = new javax.swing.JLabel();
        cmb_semestres = new javax.swing.JComboBox<>();
        lbl_carrera = new javax.swing.JLabel();
        cmb_carreras = new javax.swing.JComboBox<>();
        btn_registrar = new javax.swing.JButton();
        btn_limpiar_campos = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        lbl_registro_alumnos.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        lbl_registro_alumnos.setText("Registro de Alumnos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_registro_alumnos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_registro_alumnos)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(192, 192, 192));

        lbl_num_control.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_num_control.setText("Numero de Control:");

        txt_num_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_controlKeyTyped(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombres:");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        lbl_paterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_paterno.setText("Apellido Paterno:");

        txt_paterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paternoKeyTyped(evt);
            }
        });

        lbl_materno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_materno.setText("Apellido Materno:");

        txt_materno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_maternoKeyTyped(evt);
            }
        });

        lbl_fecha_nac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_fecha_nac.setText("Fecha de Nacimiento (aaaa-mm-dd): ");

        txt_fecha_nac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_nacKeyTyped(evt);
            }
        });

        lbl_num_telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_num_telefono.setText("Numero de Telefono: ");

        txt_num_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_telefonoKeyTyped(evt);
            }
        });

        lbl_semestre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_semestre.setText("Semestre:");

        cmb_semestres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12 " }));

        lbl_carrera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_carrera.setText("Carrera:");

        cmb_carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "ISC", "IM", "IIA", "LA", "CP" }));

        btn_registrar.setText("Registar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_limpiar_campos.setText("Limpiar Campos");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_materno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_materno))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_carrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_semestre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_semestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_num_control)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_num_control))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_nombre)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lbl_fecha_nac)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lbl_num_telefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_num_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_paterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_paterno)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btn_registrar)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar_campos)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_paterno))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_materno)
                    .addComponent(txt_materno, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fecha_nac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_num_telefono)
                    .addComponent(txt_num_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_semestre)
                    .addComponent(cmb_semestres, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_carrera))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed

        //Verificador de cajas llenas
        if (!(txt_num_control.getText().equals("") || txt_nombre.getText().equals("") || txt_paterno.getText().equals("") || txt_materno.getText().equals("") || txt_fecha_nac.getText().equals("") || txt_num_telefono.getText().equals("") || cmb_semestres.getSelectedIndex() == 0 || cmb_carreras.getSelectedIndex() == 0)) {

            int num_control = Integer.parseInt(txt_num_control.getText());
            String nombre = txt_nombre.getText();
            String paterno = txt_paterno.getText();
            String materno = txt_materno.getText();
            String fecha_nac = txt_fecha_nac.getText();
            long telefono = Long.parseLong(txt_num_telefono.getText());
            byte semestre = (byte) cmb_semestres.getSelectedIndex();
            byte carrera = (byte) cmb_carreras.getSelectedIndex();

        } else {

            JOptionPane.showMessageDialog(this, "Sea tan amable de llenar todos los campos...");

        }


    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_num_controlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_controlKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_num_control.getText().length() >= 8) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_num_controlKeyTyped

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed


    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && !Character.isWhitespace(c)) { // Permitir solo letras y espacios

            evt.consume(); // Ignorar el evento

        }


    }//GEN-LAST:event_txt_nombreKeyTyped

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

    private void txt_num_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_telefonoKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_num_telefono.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_num_telefonoKeyTyped

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        VentanaHubTutor vht = new VentanaHubTutor();
        vht.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
                new VentanaAltaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_limpiar_campos;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> cmb_carreras;
    private javax.swing.JComboBox<String> cmb_semestres;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_carrera;
    private javax.swing.JLabel lbl_fecha_nac;
    private javax.swing.JLabel lbl_materno;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_num_control;
    private javax.swing.JLabel lbl_num_telefono;
    private javax.swing.JLabel lbl_paterno;
    private javax.swing.JLabel lbl_registro_alumnos;
    private javax.swing.JLabel lbl_semestre;
    private javax.swing.JTextField txt_fecha_nac;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_num_control;
    private javax.swing.JTextField txt_num_telefono;
    private javax.swing.JTextField txt_paterno;
    // End of variables declaration//GEN-END:variables
}
