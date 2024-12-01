package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Alumnos;


public class AlumnosDAO {
    
    //METODOS ---------------------------------------------------------------------------------------------------------------------
    //------------------------------------- Altas ------------------------------------------
    public static boolean agregarAlumno(Alumnos a) {
        
        boolean res = false;

        res = ConexionBD.agregarAlumno(a);

        return res;

    }
    
    //------------------------------------- Bajas ------------------------------------------

}
