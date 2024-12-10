package com.asterius.app_web;

import android.content.Context;
import android.util.Log;

import bd.TutoriasBD;
import entidades.Bitacoras;

public class Fachada {

    private Context context;
    private TutoriasBD bd;

    public Fachada(Context context) {

        this.context = context;
        this.bd = TutoriasBD.getAppDataBase(context);

    }

    public void agregarBitacora(int  id_bi, String nombre_es, String paterno , String materno, String carrera, String fecha){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Insertar alumno en la base de datos
                    bd.bitacorasDAO().agregarBitacora(new Bitacoras(id_bi, nombre_es, paterno, materno, carrera, fecha));

                    // Log para depuración
                    Log.i("MSJ->", "Insertado correctamente");
                } catch (Exception e) {
                    // Manejar errores si es necesario
                    Log.e("MSJ->", "Error al insertar alumno: " + e.getMessage());
                }
            }
        }).start();

    }


}
