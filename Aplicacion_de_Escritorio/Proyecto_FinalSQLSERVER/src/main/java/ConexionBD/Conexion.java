package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Atributo
    Connection conexion = null;
    String usuario = "Oscar";
    String contraseña = "oscar";
    String db = "Tutorias";
    String puerto = "1433";
    
    //Metodos
    public Connection obtenerConexion(){
    
        String cadena = "jdbc:sqlserver://localhost:"+puerto+";encrypt=false;"+"databaseName="+db;
        
        
        try {
            
            conexion = DriverManager.getConnection(cadena,usuario,contraseña);
            
        } catch (SQLException e) {
            
            System.err.println("Error de conexion del driver " + e.getMessage());
            
        }
        
         return conexion;
         
    }//Metodo conectar
    
}//clase conexion
