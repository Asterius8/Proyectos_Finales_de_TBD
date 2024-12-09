package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Bitacora;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BitacoraDAO {

    //METODOS ---------------------------------------------------------------------------------------------------------------------
    //------------------------------------- Altas ------------------------------------------
    public static boolean agregarBitacoraDAO(Bitacora b) {

        boolean res = false;

        res = ConexionBD.agregarBitacoraBD(b);

        return res;

    }

    //------------------------------------- Consultas ------------------------------------------
    public static ResultSet consultaCompleta() {

        return ConexionBD.consultarCompletaBitacoraBD();

    }

    //------------------------------------- Consultas Especificas ------------------------------------------
    public static ResultSet buscarPorIdDAO(String filtro) {

        String sql = "SELECT * FROM Bitacoras WHERE id_bitacora ='" + filtro + "'";

        ResultSet rs = ConexionBD.consultaPorFiltroBitacora(sql);

        return rs;

    }

    public static ResultSet buscarPorNumDAO(String filtro) {

        String sql = "SELECT * FROM Bitacoras WHERE num_control ='" + filtro + "'";

        ResultSet rs = ConexionBD.consultaPorFiltroBitacora(sql);

        return rs;

    }

    public static ResultSet buscarPorFechaDAO(String filtro) {

        String sql = "SELECT * FROM Bitacoras WHERE fecha_tutorias ='" + filtro + "'";

        ResultSet rs = ConexionBD.consultaPorFiltroBitacora(sql);

        return rs;

    }

    public static ResultSet buscarPorDuracionDAO(String filtro) {

        String sql = "SELECT * FROM Bitacoras WHERE duracion_tutorias ='" + filtro + "'";

        ResultSet rs = ConexionBD.consultaPorFiltroBitacora(sql);

        return rs;

    }

    public static ResultSet buscarPorObservacionesDAO(String filtro) {

        String sql = "SELECT * FROM Bitacoras WHERE observaciones ='" + filtro + "'";

        ResultSet rs = ConexionBD.consultaPorFiltroBitacora(sql);

        return rs;

    }
    //------------------------------------- Cambios ------------------------------------------
    public static boolean ModificiarDAO(Bitacora b) {

        boolean res = false;

        res = ConexionBD.cambiosBitacoraBD(b);

        return res;

    }
    
}
