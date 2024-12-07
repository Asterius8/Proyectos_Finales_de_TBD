package vista;

import Controlador.AlumnosDAO;
import Modelo.Alumnos;
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

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        lbl_titulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 153, 204));
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

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        bg1.add(jrb_num_control);
        jrb_num_control.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_num_control.setText("Numero de Control:");
        jrb_num_control.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrb_num_controlMouseClicked(evt);
            }
        });
        jrb_num_control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_num_controlActionPerformed(evt);
            }
        });

        bg1.add(jrb_paterno);
        jrb_paterno.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_paterno.setText("Apellido Paterno:");
        jrb_paterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_paternoActionPerformed(evt);
            }
        });

        bg1.add(jrb_nombres);
        jrb_nombres.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_nombres.setText("Nombres:");
        jrb_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_nombresActionPerformed(evt);
            }
        });

        bg1.add(jrb_materno);
        jrb_materno.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_materno.setText("Apellido Materno:");
        jrb_materno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_maternoActionPerformed(evt);
            }
        });

        bg1.add(jrb_fecha_nac);
        jrb_fecha_nac.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_fecha_nac.setText("Fecha de Nacimiento (aaaa-mm-dd):");
        jrb_fecha_nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_fecha_nacActionPerformed(evt);
            }
        });

        bg1.add(jrb_num_telefono);
        jrb_num_telefono.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_num_telefono.setText("Numero de Telefono:");
        jrb_num_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_num_telefonoActionPerformed(evt);
            }
        });

        bg1.add(jrb_edad);
        jrb_edad.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jrb_edad.setText("Edad:");
        jrb_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_edadActionPerformed(evt);
            }
        });

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

        txt_num_control.setEnabled(false);
        txt_num_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_controlKeyTyped(evt);
            }
        });

        txt_fecha_nac.setEnabled(false);
        txt_fecha_nac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_nacKeyTyped(evt);
            }
        });

        txt_nombres.setEnabled(false);
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });

        txt_paterno.setEnabled(false);
        txt_paterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paternoActionPerformed(evt);
            }
        });
        txt_paterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paternoKeyTyped(evt);
            }
        });

        txt_materno.setEnabled(false);
        txt_materno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_maternoKeyTyped(evt);
            }
        });

        txt_num_telefono.setEnabled(false);
        txt_num_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_telefonoKeyTyped(evt);
            }
        });

        txt_edad.setEnabled(false);
        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });

        cmb_semestres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmb_semestres.setEnabled(false);

        cmb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "ISC", "IM", "IIA", "LA", "CP" }));
        cmb_carrera.setEnabled(false);

        bg1.add(jrb_mostrar_todo);
        jrb_mostrar_todo.setSelected(true);
        jrb_mostrar_todo.setText("Mostrar Todo");
        jrb_mostrar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_mostrar_todoActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrb_mostrar_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
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

        txt_num_control.enable(true);
        txt_nombres.enable(false);
        txt_paterno.enable(false);
        txt_materno.enable(false);
        txt_fecha_nac.enable(false);
        txt_edad.enable(false);
        txt_num_telefono.enable(false);
        cmb_semestres.enable(false);
        cmb_carrera.enable(false);

    }//GEN-LAST:event_jrb_num_controlActionPerformed

    private void tbl_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alumnosMouseClicked

    }//GEN-LAST:event_tbl_alumnosMouseClicked

    private void txt_paternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paternoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //-------------------------------------------------------------------------------------------
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

                String fecha_nac = txt_fecha_nac.getText();
                byte contador = 0;

                for (int i = 0; i < fecha_nac.length(); i++) {

                    if (fecha_nac.charAt(i) == '-') {

                        contador++;

                    }
                }

                if (contador == 2) {

                    String[] fecha = new String[3];
                    fecha = fecha_nac.split("-");

                    if (fecha[0].length() == 4) {

                        if (fecha[1].length() == 2 && Integer.parseInt(fecha[1]) >= 01 && Integer.parseInt(fecha[1]) <= 12) {

                            if (fecha[2].length() == 2 && Integer.parseInt(fecha[2]) >= 01 && Integer.parseInt(fecha[2]) <= 31) {

                                ResultSet rs = AlumnosDAO.buscarPorFechaNacDAO(txt_fecha_nac.getText());
                                mostrarfiltrados(rs);

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

                if (!cmb_semestres.getSelectedItem().toString().equals("Seleccione una opcion...")) {

                    ResultSet rs = AlumnosDAO.buscarPorSemestreDAO(cmb_semestres.getSelectedItem().toString());
                    mostrarfiltrados(rs);

                } else {

                    JOptionPane.showMessageDialog(this, "verifique que seleccion un valor para Semestre");

                }

            } catch (SQLException ex) {

                Logger.getLogger(VentanaConsultaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (jrb_carrera.isSelected()) {

            try {

                if (!cmb_carrera.getSelectedItem().toString().equals("Seleccione una opcion...")) {
                    ResultSet rs = AlumnosDAO.buscarPorCarreraDAO(cmb_carrera.getSelectedItem().toString());
                    mostrarfiltrados(rs);

                } else {

                    JOptionPane.showMessageDialog(this, "verifique que agrego un valor para Carrera");

                }

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        VentanaHubTutor vht = new VentanaHubTutor();
        vht.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_num_controlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_controlKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_num_control.getText().length() >= 8) {

            evt.consume();

        }
    }//GEN-LAST:event_txt_num_controlKeyTyped

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && !Character.isWhitespace(c)) { // Permitir solo letras y espacios

            evt.consume(); // Ignorar el evento

        }    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_paternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paternoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c)) { // Permitir solo letras

            evt.consume(); // Ignorar el evento

        }    }//GEN-LAST:event_txt_paternoKeyTyped

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

        if (!Character.isDigit(c) || txt_num_telefono.getText().length() >= 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txt_edadKeyTyped

    private void txt_num_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_telefonoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_num_telefono.getText().length() >= 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txt_num_telefonoKeyTyped

    private void jrb_num_controlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrb_num_controlMouseClicked
        //txt_nombres.enable(false);
    }//GEN-LAST:event_jrb_num_controlMouseClicked

    private void jrb_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_nombresActionPerformed

        txt_num_control.enable(false);
        txt_nombres.enable(true);
        txt_paterno.enable(false);
        txt_materno.enable(false);
        txt_fecha_nac.enable(false);
        txt_edad.enable(false);
        txt_num_telefono.enable(false);
        cmb_semestres.enable(false);
        cmb_carrera.enable(false);

    }//GEN-LAST:event_jrb_nombresActionPerformed

    private void jrb_paternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_paternoActionPerformed
        txt_num_control.enable(false);
        txt_nombres.enable(false);
        txt_paterno.enable(true);
        txt_materno.enable(false);
        txt_fecha_nac.enable(false);
        txt_edad.enable(false);
        txt_num_telefono.enable(false);
        cmb_semestres.enable(false);
        cmb_carrera.enable(false);
    }//GEN-LAST:event_jrb_paternoActionPerformed

    private void jrb_maternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_maternoActionPerformed
        txt_num_control.enable(false);
        txt_nombres.enable(false);
        txt_paterno.enable(false);
        txt_materno.enable(true);
        txt_fecha_nac.enable(false);
        txt_edad.enable(false);
        txt_num_telefono.enable(false);
        cmb_semestres.enable(false);
        cmb_carrera.enable(false);
    }//GEN-LAST:event_jrb_maternoActionPerformed

    private void jrb_fecha_nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_fecha_nacActionPerformed
        txt_num_control.enable(false);
        txt_nombres.enable(false);
        txt_paterno.enable(false);
        txt_materno.enable(false);
        txt_fecha_nac.enable(true);
        txt_edad.enable(false);
        txt_num_telefono.enable(false);
        cmb_semestres.enable(false);
        cmb_carrera.enable(false);
    }//GEN-LAST:event_jrb_fecha_nacActionPerformed

    private void jrb_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_edadActionPerformed
        txt_num_control.enable(false);
        txt_nombres.enable(false);
        txt_paterno.enable(false);
        txt_materno.enable(false);
        txt_fecha_nac.enable(false);
        txt_edad.enable(true);
        txt_num_telefono.enable(false);
        cmb_semestres.enable(false);
        cmb_carrera.enable(false);
    }//GEN-LAST:event_jrb_edadActionPerformed

    private void jrb_num_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_num_telefonoActionPerformed
        txt_num_control.enable(false);
        txt_nombres.enable(false);
        txt_paterno.enable(false);
        txt_materno.enable(false);
        txt_fecha_nac.enable(false);
        txt_edad.enable(false);
        txt_num_telefono.enable(true);
        cmb_semestres.enable(false);
        cmb_carrera.enable(false);
    }//GEN-LAST:event_jrb_num_telefonoActionPerformed

    private void jrb_mostrar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_mostrar_todoActionPerformed
                txt_num_control.enable(false);
        txt_nombres.enable(false);
        txt_paterno.enable(false);
        txt_materno.enable(false);
        txt_fecha_nac.enable(false);
        txt_edad.enable(false);
        txt_num_telefono.enable(false);
        cmb_semestres.enable(false);
        cmb_carrera.enable(false);
    }//GEN-LAST:event_jrb_mostrar_todoActionPerformed

    public static void main(String args[]) {

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
