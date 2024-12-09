package edu.tecjerez.proyecto_finalsqlserver;
import net.sf.jasperreports.engine.*;


class Proyecto_FinalSQLSERVER {

    public static void main(String[] args) {
        try {
            // Ruta del archivo .jrxml
            String jrxmlPath = "../../../Controlador/Test1.jrxml";

            // Compilar el reporte
            JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlPath);
            System.out.println("Reporte compilado correctamente.");
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

}
