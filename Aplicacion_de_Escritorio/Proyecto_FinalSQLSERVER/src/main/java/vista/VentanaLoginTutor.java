package vista;

public class VentanaLoginTutor extends javax.swing.JFrame {

    public VentanaLoginTutor() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Login Tutor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario_t = new javax.swing.JTextField();
        lbl_usuario_t = new javax.swing.JLabel();
        txt_contraseña_t = new javax.swing.JTextField();
        lbl_contraseña_t = new javax.swing.JLabel();
        btn_ingresar_t = new javax.swing.JButton();
        btn_registrar_t = new javax.swing.JButton();
        btn_cancelar_t = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Bienvenido al sistema de accesso de tutores");

        txt_usuario_t.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_usuario_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuario_tActionPerformed(evt);
            }
        });

        lbl_usuario_t.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_usuario_t.setText("Usuario:");

        txt_contraseña_t.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_contraseña_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseña_tActionPerformed(evt);
            }
        });

        lbl_contraseña_t.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_contraseña_t.setText("Contraseña:");

        btn_ingresar_t.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ingresar_t.setText("INGRESAR");
        btn_ingresar_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar_tActionPerformed(evt);
            }
        });

        btn_registrar_t.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar_t.setText("REGISTRAR");
        btn_registrar_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_tActionPerformed(evt);
            }
        });

        btn_cancelar_t.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelar_t.setText("CANCELAR");
        btn_cancelar_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_tActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_contraseña_t)
                    .addComponent(lbl_usuario_t)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ingresar_t, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btn_cancelar_t)
                        .addGap(24, 24, 24)
                        .addComponent(btn_registrar_t))
                    .addComponent(txt_contraseña_t)
                    .addComponent(txt_usuario_t))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_usuario_t)
                .addGap(2, 2, 2)
                .addComponent(txt_usuario_t, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lbl_contraseña_t)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txt_contraseña_t, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ingresar_t, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_registrar_t, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar_t, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
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

    private void txt_usuario_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuario_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuario_tActionPerformed

    private void txt_contraseña_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseña_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseña_tActionPerformed

    private void btn_ingresar_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar_tActionPerformed

    private void btn_registrar_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar_tActionPerformed

    private void btn_cancelar_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_tActionPerformed

        Login login = new Login();
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_cancelar_tActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLoginTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar_t;
    private javax.swing.JButton btn_ingresar_t;
    private javax.swing.JButton btn_registrar_t;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_contraseña_t;
    private javax.swing.JLabel lbl_usuario_t;
    private javax.swing.JTextField txt_contraseña_t;
    private javax.swing.JTextField txt_usuario_t;
    // End of variables declaration//GEN-END:variables
}
