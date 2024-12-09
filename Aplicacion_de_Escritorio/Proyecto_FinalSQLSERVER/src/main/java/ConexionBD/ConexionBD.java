package ConexionBD;

import Modelo.Alumnos;
import Modelo.Bitacora;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

    //Atributo
    private static Connection conexion = null;
    private static PreparedStatement pstm;
    String usuario = "Oscar";
    String contraseña = "oscar";
    String db = "BD_Tutorias_Proyecto_Final_2024";
    String puerto = "1433";

    private ConexionBD() {

        String cadena = "jdbc:sqlserver://localhost:" + puerto + ";encrypt=false;" + "databaseName=" + db;

        try {

            conexion = DriverManager.getConnection(cadena, usuario, contraseña);

        } catch (SQLException e) {

            System.err.println("Error de conexion del driver " + e.getMessage());

        }

    }

    //Metodos---------------------------------------------------------------------------------------------------------------------------------------------------
    //Obtener conexion
    public static Connection getConexion() {

        if (conexion == null) {

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

// ABCC de Alumno -----------------------------------------------------------------------------------------------------------------------------------------
    public static boolean agregarAlumno(Alumnos a) {

        try {

            Connection conexion = getConexion();

            pstm = conexion.prepareStatement("INSERT INTO Alumnos(num_control, nombre_alumno, paterno, materno, fecha_nac, num_telefono, semestre, carrera) VALUES(?,?,?,?,?,?,?,?)");
            pstm.setInt(1, a.getNum_control());
            pstm.setString(2, a.getNombre());
            pstm.setString(3, a.getPaterno());
            pstm.setString(4, a.getMaterno());
            pstm.setString(5, a.getFecha_nac());
            pstm.setLong(6, a.getTelefono());
            pstm.setByte(7, a.getSemestre());
            pstm.setString(8, a.getCarrera());

            pstm.execute();

            return true;

        } catch (Exception e) {

            System.out.println("Error en instrucción DML" + e);

        }

        return false;

    }

    public static ResultSet buscar() {

        try {

            Connection conexion = getConexion();
            String sentencia = "SELECT * FROM Alumnos";

            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sentencia);

            return rs;

        } catch (Exception e) {

        }

        return null;
    }

    // Consultas singulares -----------------------------------------------------------------------------------------------------------------------------------------    
    public static ResultSet buscarPorNumControl(Alumnos a) {

        try {

            Connection conexion = getConexion();
            String sentencia = "SELECT * FROM Alumnos WHERE num_control = " + a.getNum_control() + "";

            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sentencia);

            return rs;

        } catch (Exception e) {

        }

        return null;
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    // Consultas singulares -----------------------------------------------------------------------------------------------------------------------------------------    
    public static ResultSet BuscarNumControlIgual(String consulta) {

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

    public static boolean eliminarAlumnoBD(String filtro) {

        try {

            Connection conexion = getConexion();

            pstm = conexion.prepareStatement("DELETE FROM Alumnos WHERE num_control = ?");
            pstm.setString(1, filtro);

            pstm.execute();

            return true;

        } catch (Exception e) {

            System.out.println("Error en instrucción DML");

        }

        return false;

    }

    public static boolean cambiosAlumnoBD(Alumnos a) {

        try {

            Connection conexion = getConexion();

            pstm = conexion.prepareStatement("UPDATE Alumnos SET nombre_alumno = ?, paterno = ?, materno = ?, fecha_nac = ?, edad = ?, num_telefono = ?, semestre = ?,carrera = ? WHERE num_control = " + a.getNum_control() + "");

            pstm.setString(1, a.getNombre());
            pstm.setString(2, a.getPaterno());
            pstm.setString(3, a.getMaterno());
            pstm.setString(4, a.getFecha_nac());
            pstm.setByte(5, a.getEdad());
            pstm.setLong(6, a.getTelefono());
            pstm.setByte(7, a.getSemestre());
            pstm.setString(8, a.getCarrera());

            pstm.execute();

            return true;

        } catch (Exception e) {

            System.out.println("Error en instrucción DML" + e);

        }

        return false;

    }

// ABCC de Reportes -------------------------------------------------------------------------------------------------------------------------------------------
    // ALTAS --------------------------------------------------------------------------------------------------------------------------------------------------
    public static boolean agregarBitacoraBD(Bitacora b) {

        try {

            Connection conexion = getConexion();

            pstm = conexion.prepareStatement("INSERT INTO Bitacoras(fecha_tutorias, duracion_tutorias, observaciones, num_control) VALUES(?,?,?,?)");

            pstm.setString(1, b.getFecha_tutorias());
            pstm.setInt(2, b.getDuracion_tutorias());
            pstm.setString(3, b.getObservaciones());
            pstm.setInt(4, b.getNum_control());

            pstm.execute();

            return true;

        } catch (Exception e) {

            System.out.println("Error en instrucción de agregar bitacora" + e);

        }

        return false;

    }

    // CONSULTAS ----------------------------------------------------------------------------------------------------------------------------------------------
    public static ResultSet consultarCompletaBitacoraBD() {

        try {

            Connection conexion = getConexion();
            String sentencia = "SELECT * FROM Bitacoras";

            Statement st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sentencia);

            return rs;

        } catch (Exception e) {

            System.out.println("Error en instrucción de busqueda de bitacoras" + e);

        }

        return null;

    }
    //------------------------------------- Consultas Especificas ------------------------------------------
    public static ResultSet consultaPorFiltroBitacora(String consulta){
    
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
