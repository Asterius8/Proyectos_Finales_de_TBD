package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Alumnos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AlumnosDAO {
    
    //METODOS ---------------------------------------------------------------------------------------------------------------------
    //------------------------------------- Altas ------------------------------------------
    public static boolean agregarAlumno(Alumnos a) {
        
        boolean res = false;

        res = ConexionBD.agregarAlumno(a);

        return res;

    }
    
    //------------------------------------- Bajas ------------------------------------------

    
        public static boolean BuscarNumControlIgualDAO(String filtro1) {
        
        try {
            
            //ArrayList<Usuario> listaUsuarios = new ArrayList<>();
            
            String sql = "SELECT * FROM Alumnos WHERE num_control ='" + filtro1 + "'";
            
            ResultSet rs = ConexionBD.BuscarNumControlIgual(sql);
            
            int rowCount = 0;
            
            while (rs.next()) {
                
                rowCount++;
                
            }
            
            return rowCount == 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
}
