package com.asterius.app_web;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityAltas extends AppCompatActivity {

    EditText id_bi, nombre_es, paterno, materno, fecha;
    Spinner carrera;
    private Fachada fachada;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas);

        fachada = new Fachada(this);

        id_bi = findViewById(R.id.txt_id_bitacora_a);
        nombre_es = findViewById(R.id.txt_nombre_a);
        paterno = findViewById(R.id.txt_paterno_a);
        materno = findViewById(R.id.txt_materno_a);
        fecha = findViewById(R.id.txt_fecha_bit_a);
        carrera = findViewById(R.id.spn_carrera_a);

        String [] carreras = {"Seleccione una opcion...","ISC", "IM", "IIA", "CP", "LA"};
        ArrayAdapter<String> adapterCarreras = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, carreras);
        carrera.setAdapter(adapterCarreras);



    }

    public void agregarBitacora(View v) {

        if(!(id_bi.getText().toString().isEmpty() && nombre_es.getText().toString().isEmpty() && paterno.getText().toString().isEmpty() && materno.getText().toString().isEmpty() && fecha.getText().toString().isEmpty() && carrera.getSelectedItemPosition() == 0)){

            String fechaCadena = String.valueOf(fecha.getText());
            byte contadorD = 0;

            for (int i = 0; i< fecha.length(); i++){

                if (fechaCadena.charAt(i) == '-') {

                    contadorD++;

                }

            }


            if(contadorD == 2){

                String[] fechaArray = new String[3];
                fechaArray = fechaCadena.split("-");

                if (fechaArray[0].length() == 4) {

                    if (fechaArray[1].length() == 2 && Integer.parseInt(fechaArray[1]) >= 1 && Integer.parseInt(fechaArray[1]) <= 12) {

                        if (fechaArray[2].length() == 2 && Integer.parseInt(fechaArray[2]) >= 1 && Integer.parseInt(fechaArray[2]) <= 31) {

                            fachada.agregarBitacora(Integer.parseInt((id_bi.getText().toString())), nombre_es.getText().toString(), paterno.getText().toString(), materno.getText().toString(), carrera.getSelectedItem().toString(), fecha.getText().toString());

                            Toast.makeText(this,"Agregacion exitosa", Toast.LENGTH_LONG).show();

                        }else{

                            Toast.makeText(this,"Verifique la fecha", Toast.LENGTH_LONG).show();

                        }

                    }else {

                        Toast.makeText(this,"Verifique la fecha", Toast.LENGTH_LONG).show();

                    }

                }else{

                    Toast.makeText(this,"Verifique la fecha", Toast.LENGTH_LONG).show();

                }


            }else{

                Toast.makeText(this,"Verifique la cantidad de - en la fecha", Toast.LENGTH_LONG).show();

            }

        }else {

            Toast.makeText(this,"Ingrese todos los datos", Toast.LENGTH_LONG).show();

        }





    }

}
