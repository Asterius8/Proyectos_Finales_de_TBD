package vista;

import ConexionBD.ConexionBD;
import Controlador.AlumnosDAO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaCarreras extends javax.swing.JFrame {

    public GraficaCarreras() {
        initComponents();
        setTitle("Gráfica de Repetición de Carreras");
        setSize(800, 600);

        JFreeChart chart = crearGrafica();
        
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);

    }

    private JFreeChart crearGrafica() {
        // Crear el dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            // Conexión a la base de datos
            ConexionBD.getConexion();

            ResultSet re = AlumnosDAO.ContarCarreraDAO();

            // Agregar los datos al dataset
            while (re.next()) {
                String carrera = re.getString("carrera");
                int cantidad = re.getInt("cantidad");
                dataset.addValue(cantidad, "Cantidad", carrera);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + e.getMessage());
        }

        // Crear la gráfica de barras
        return ChartFactory.createBarChart(
                "Repetición de Carreras", // Título de la gráfica
                "Carreras", // Etiqueta del eje X
                "Cantidad de Alumnos", // Etiqueta del eje Y
                dataset // Dataset de datos
        );
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GraficaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaCarreras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
