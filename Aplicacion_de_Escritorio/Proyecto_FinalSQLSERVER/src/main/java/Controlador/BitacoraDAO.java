package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Bitacora;
import java.sql.ResultSet;

public class BitacoraDAO {
    //METODOS ---------------------------------------------------------------------------------------------------------------------
    //------------------------------------- Altas ------------------------------------------
    public static boolean agregarBitacoraDAO(Bitacora b) {

        boolean res = false;

        res = ConexionBD.agregarBitacoraBD(b);

        return res;

    }
    
    //------------------------------------- Consultas ------------------------------------------
    public static ResultSet consultaCompleta(){
    
        
        
    }

}
