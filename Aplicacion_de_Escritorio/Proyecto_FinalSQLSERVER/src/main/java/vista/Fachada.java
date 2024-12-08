package vista;

import java.sql.Connection;
import ConexionBD.ConexionBD;
import static ConexionBD.ConexionBD.getConexion;
import java.sql.PreparedStatement;
import Modelo.Bitacora;
import Controlador.BitacoraDAO;


public class Fachada {

    //Atributos
    private static Fachada instancia = null;
    private static PreparedStatement pstm;
    private Connection conexion;
    private BitacoraDAO bDAO;
    private Bitacora b;

    //Contructor
    public Fachada() {

        this.conexion = ConexionBD.getConexion();
        this.bDAO = new BitacoraDAO();
        this.b = new Bitacora();

    }

    public static Fachada obtenerInstancia() {
        
        if (instancia == null) {
            
            instancia = new Fachada();
            
        }
        
        return instancia;
        
    }
    
}
