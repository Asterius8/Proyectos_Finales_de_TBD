package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    //------------------------------------------- Altas ------------------------------------------------
    public static boolean agregarUsuario(Usuario u){
        boolean res = false;

        res = ConexionBD.agregarUsuario(u);

        return res;
    
    }
    
    //-------------------------------------------- Consultas -------------------------------------------
    public static boolean buscarUsuarios(String filtro1, String filtro2) {
        
        try {
            
            //ArrayList<Usuario> listaUsuarios = new ArrayList<>();
            
            String sql = "SELECT * FROM usuarios WHERE nombre_de_usuario ='" + filtro1 + "' AND contrase_usuario = '"+ filtro2 +"'";
            
            ResultSet rs = ConexionBD.BuscarUsuario(sql);
            
            int rowCount = 0;
            while (rs.next()) {
                rowCount++;
            }
            
            return rowCount == 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    public static boolean buscarUsuarioIgual(String filtro1) {
        
        try {
            
            //ArrayList<Usuario> listaUsuarios = new ArrayList<>();
            
            String sql = "SELECT * FROM usuarios WHERE nombre_de_usuario ='" + filtro1 + "'";
            
            ResultSet rs = ConexionBD.BuscarUsuarioIgual(sql);
            
            int rowCount = 0;
            
            while (rs.next()) {
                
                rowCount++;
                
            }
            
            return rowCount == 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
}
