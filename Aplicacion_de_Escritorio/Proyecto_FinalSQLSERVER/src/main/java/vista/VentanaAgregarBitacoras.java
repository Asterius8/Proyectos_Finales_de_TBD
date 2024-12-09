package vista;

import Controlador.AlumnosDAO;
import Controlador.BitacoraDAO;
import Modelo.Bitacora;
import javax.swing.JOptionPane;

public class VentanaAgregarBitacoras extends javax.swing.JFrame {

    public VentanaAgregarBitacoras() {

        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registrar bitacoras de tutorias");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_fecha_bitacora = new javax.swing.JLabel();
        txt_num_control = new javax.swing.JTextField();
        lbl_duracion = new javax.swing.JLabel();
        txt_duracion = new javax.swing.JTextField();
        lbl_duracion1 = new javax.swing.JLabel();
        txt_fecha_bitacora = new javax.swing.JTextField();
        lbl_observaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        btn_crear = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        lbl_titulo.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        lbl_titulo.setText("Crear Bitacora de Tutorias");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_titulo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lbl_fecha_bitacora.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_fecha_bitacora.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha_bitacora.setText("Fecha de la Tutoria (aaaa-mm-dd):");

        txt_num_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_controlKeyTyped(evt);
            }
        });

        lbl_duracion.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_duracion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_duracion.setText("Duracion total de la sesion de tutorias: ");

        txt_duracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_duracionKeyTyped(evt);
            }
        });

        lbl_duracion1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_duracion1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_duracion1.setText("Numero de Control del Estudiante:");

        txt_fecha_bitacora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_bitacoraKeyTyped(evt);
            }
        });

        lbl_observaciones.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_observaciones.setForeground(new java.awt.Color(255, 255, 255));
        lbl_observaciones.setText("Observaciones:");

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane1.setViewportView(txt_observaciones);

        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

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
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_observaciones))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_fecha_bitacora)
                            .addComponent(lbl_duracion)
                            .addComponent(lbl_duracion1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_bitacora, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_duracion1)
                            .addComponent(txt_num_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fecha_bitacora)
                            .addComponent(txt_fecha_bitacora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_duracion)
                            .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbl_observaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed

        VentanaHubTutor vht = new VentanaHubTutor();
        vht.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed

        //Verificar el contenido de las cajas 
        if (!(txt_num_control.getText().equals("")) || !(txt_fecha_bitacora.getText().equals("")) || !(txt_duracion.getText().equals("")) || !(txt_observaciones.getText().equals(""))) {

            int num_control = Integer.parseInt(txt_num_control.getText());

            byte duracion = Byte.parseByte(txt_duracion.getText());
            String observaciones = txt_observaciones.getText();
            byte contador = 0;
            String fecha_bitacora = txt_fecha_bitacora.getText();

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

                        if (BitacoraDAO.agregarBitacoraDAO(new Bitacora(fecha_bitacora, duracion, observaciones, num_control))) {

                            JOptionPane.showMessageDialog(this, "Bitacora agregada correctamente.");
                            vaciarComponentes();
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

    }//GEN-LAST:event_btn_crearActionPerformed

    private void txt_num_controlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_controlKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_num_control.getText().length() >= 8) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_num_controlKeyTyped

    private void txt_fecha_bitacoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_bitacoraKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-' || txt_fecha_bitacora.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_fecha_bitacoraKeyTyped

    private void txt_duracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_duracionKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) || txt_duracion.getText().length() == 1) {

            evt.consume();

        }

    }//GEN-LAST:event_txt_duracionKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarBitacoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_duracion;
    private javax.swing.JLabel lbl_duracion1;
    private javax.swing.JLabel lbl_fecha_bitacora;
    private javax.swing.JLabel lbl_observaciones;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_duracion;
    private javax.swing.JTextField txt_fecha_bitacora;
    private javax.swing.JTextField txt_num_control;
    private javax.swing.JTextArea txt_observaciones;
    // End of variables declaration//GEN-END:variables

    public void vaciarComponentes() {

        txt_num_control.setText("");
        txt_fecha_bitacora.setText("");
        txt_duracion.setText("");
        txt_observaciones.setText("");

    }

}
