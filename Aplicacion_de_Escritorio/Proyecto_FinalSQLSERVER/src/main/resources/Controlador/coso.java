/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Oscar
 */
public class coso {
    
     public static void main(String[] args) {
        try {
            // Ruta del archivo .jrxml
            String jrxmlPath = "Test1.jrxml";

            // Compilar el reporte
            JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlPath);
            System.out.println("Reporte compilado correctamente.");
        } catch (JRException e) {
            e.printStackTrace();
        }
     }
}
