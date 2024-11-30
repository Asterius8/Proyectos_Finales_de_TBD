package vista;

import java.sql.Connection;
import ConexionBD.ConexionBD;
import static ConexionBD.ConexionBD.getConexion;
import java.sql.PreparedStatement;
import Modelo.ReportesTutorias;
import Controlador.ReporteTutoriaDAO;


public class Fachada {

    //Atributos
    private static Fachada instancia = null;
    private static PreparedStatement pstm;
    private Connection conexion;
    private ReporteTutoriaDAO rtDAO;
    private ReportesTutorias rt;

    //Contructor
    public Fachada() {

        this.conexion = ConexionBD.getConexion();
        this.rtDAO = new ReporteTutoriaDAO();
        this.rt = new ReportesTutorias();

    }

    public static Fachada obtenerInstancia() {
        
        if (instancia == null) {
            
            instancia = new Fachada();
            
        }
        
        return instancia;
        
    }
    
}
