package ConexionBD;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
    //Atributo
    private static Connection conexion = null;
    private static PreparedStatement pstm;
    String usuario = "Oscar";
    String contraseña = "oscar";
    String db = "Tutorias";
    String puerto = "1433";

    private ConexionBD() {
        
        String cadena = "jdbc:sqlserver://localhost:"+puerto+";encrypt=false;"+"databaseName="+db;
        
        try {
            
            conexion = DriverManager.getConnection(cadena,usuario,contraseña);
            
        } catch (SQLException e) {
            
            System.err.println("Error de conexion del driver " + e.getMessage());
            
        }
        
    }
    
    //Metodos---------------------------------------------------------------------------------------------------------------------------------------------------
    //Obtener conexion
    public static Connection getConexion() {
        
        if(conexion == null){
            
            new ConexionBD();
            
        }
        
        return conexion;
    }
    
    //Cerrar conexion
    static void cerrarConexion() {
        try {
            pstm.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión");
            e.printStackTrace();
        }
    }
    
    //Agregar un Usuario la base de datos
    public static boolean agregarUsuario(Usuario u) {
    
        try {
            
            Connection conexion = getConexion();
            
            pstm = conexion.prepareStatement("INSERT INTO usuarios VALUES(?,?)");
            pstm.setString(1, u.getNombre_de_usuario());
            pstm.setString(2, u.getContrase_usuario());
            
            pstm.execute();
            
            return true;
            
        } catch (Exception e) {
            
            System.out.println("Error en instrucción DML");
            
        }
        
        return false;
        
    }
    
    //Ejecutar la consulta a tabla usuarios
    public static ResultSet BuscarUsuario(String consulta) {
        
        try {
            
            Connection conexion = getConexion();
            
            if (conexion != null) {
                
                PreparedStatement pstm = conexion.prepareStatement(consulta);
                     
                return pstm.executeQuery();
                
            } else {
                
                System.out.println("Error: No se pudo obtener la conexión a la base de datos.");
                
            }
        } catch (SQLException e) {
            
            System.out.println("Error en instrucción SQL a nivel conexion BD");
            
            
        }
        return null;

    }
    
    //Ejecutar la consulta a tabla usuarios buscando el usuario
    public static ResultSet BuscarUsuarioIgual(String consulta) {
        
        try {
            
            Connection conexion = getConexion();
            
            if (conexion != null) {
                
                PreparedStatement pstm = conexion.prepareStatement(consulta);
                     
                return pstm.executeQuery();
                
            } else {
                
                System.out.println("Error: No se pudo obtener la conexión a la base de datos.");
                
            }
        } catch (SQLException e) {
            
            System.out.println("Error en instrucción SQL a nivel conexion BD");
            
            
        }
        return null;

    }
    
}//clase conexion