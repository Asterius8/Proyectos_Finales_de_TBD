package com.asterius.app_web;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bd.TutoriasBD;
import entidades.Bitacoras;

public class Fachada {

    private Context context;
    private TutoriasBD bd;

    public Fachada(Context context) {

        this.context = context;
        this.bd = TutoriasBD.getAppDataBase(context);

    }

//------------- ALTAS --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void agregarBitacora(int  id_bi, String nombre_es, String paterno , String materno, String carrera, String fecha){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    bd.bitacorasDAO().agregarBitacora(new Bitacoras(id_bi, nombre_es, paterno, materno, carrera, fecha));


                } catch (Exception e) {

                    Log.e("MSJ->", "Error al insertar alumno: " + e.getMessage());

                }

            }
        }).start();

    }
//------------- BAJAS --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void borrarBitacora(String filtro){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    bd.bitacorasDAO().eliminarBitacorasPorId(filtro);


                } catch (Exception e) {

                    Log.e("MSJ->", "Error al insertar alumno: " + e.getMessage());

                }

            }
        }).start();


    }

//------------- CAMBIOS ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public void modificarBitacora(int id_bi, String nombre_es, String paterno , String materno, String carrera, String fecha){

    new Thread(new Runnable() {
        @Override
        public void run() {
            try {

                bd.bitacorasDAO().actualizarBitacora(id_bi, nombre_es, paterno, materno, carrera, fecha);


            } catch (Exception e) {

                Log.e("MSJ->", "Error al actualizar alumno: " + e.getMessage());

            }

        }
    }).start();

}

//------------- CONSULTAS --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public ArrayList<Bitacoras> consultaCompleta(){

        ArrayList<Bitacoras> datos;

        datos = (ArrayList<Bitacoras>) bd.bitacorasDAO().mostarTodos();

        return datos;

    }
    public ArrayList<Bitacoras> verificarUnicaExistencia(String filtro) {

        ArrayList<Bitacoras> datos;

        datos = (ArrayList<Bitacoras>) bd.bitacorasDAO().mostarPorId(filtro);

        Log.i("MSJ", String.valueOf(datos.size()));

        return datos;

    }

}
