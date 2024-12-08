package vista;

import java.sql.Connection;
import ConexionBD.ConexionBD;
import static ConexionBD.ConexionBD.getConexion;
import java.sql.PreparedStatement;
import Modelo.ReportesTutorias;
import Controlador.BitacoraDAO;


public class Fachada {

    //Atributos
    private static Fachada instancia = null;
    private static PreparedStatement pstm;
    private Connection conexion;
    private BitacoraDAO rtDAO;
    private ReportesTutorias rt;

    //Contructor
    public Fachada() {

        this.conexion = ConexionBD.getConexion();
        this.rtDAO = new BitacoraDAO();
        this.rt = new ReportesTutorias();

    }

    public static Fachada obtenerInstancia() {
        
        if (instancia == null) {
            
            instancia = new Fachada();
            
        }
        
        return instancia;
        
    }
    
}
