package com.asterius.app_web;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import entidades.Bitacoras;

public class ActivityCambios extends AppCompatActivity implements CustomAdapter2.OnAlumnoClickListener {

    EditText id_bi, nombre_es, paterno, materno, fecha;
    Spinner carrera;
    private Fachada fachada;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    ArrayList<Bitacoras> datos = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambios);

        fachada = new Fachada(this);

        id_bi = findViewById(R.id.txt_id_bitacora_m);
        nombre_es = findViewById(R.id.txt_nombre_m);
        paterno = findViewById(R.id.txt_paterno_m);
        materno = findViewById(R.id.txt_materno_m);
        fecha = findViewById(R.id.txt_fecha_bit_m);
        carrera = findViewById(R.id.spn_carrera_m);

        String [] carreras = {"Seleccione una opcion...","ISC", "IM", "IIA", "CP", "LA"};
        ArrayAdapter<String> adapterCarreras = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, carreras);
        carrera.setAdapter(adapterCarreras);

        recyclerView = findViewById(R.id.lista_alumnos);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mostrarTabla();
    }

    public void modificarBitacora(View v){

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

                            new Thread(() -> {

                                    fachada.modificarBitacora(Integer.parseInt((id_bi.getText().toString())), nombre_es.getText().toString(), paterno.getText().toString(), materno.getText().toString(), carrera.getSelectedItem().toString(), fecha.getText().toString());
                                    runOnUiThread(() -> {
                                        Toast.makeText(this,"Modificacion exitosa", Toast.LENGTH_LONG).show();
                                        mostrarTabla();
                                    });

                            }).start();

                        }else{

                            Toast.makeText(this,"Verifique los dias ingresados", Toast.LENGTH_LONG).show();

                        }

                    }else {

                        Toast.makeText(this,"Verifique los meses ingresados", Toast.LENGTH_LONG).show();

                    }

                }else{

                    Toast.makeText(this,"Verifique los años ingresados", Toast.LENGTH_LONG).show();

                }


            }else{

                Toast.makeText(this,"Verifique la cantidad de - en la fecha", Toast.LENGTH_LONG).show();

            }

        }else {

            Toast.makeText(this,"Ingrese todos los datos", Toast.LENGTH_LONG).show();

        }

    }

    public void alumnoSeleccionado(String cadena){

        String[] datosCargados;
        datosCargados = cadena.split("\\|");

        Log.i ("MSJ", datosCargados[6]);

        id_bi.setText(datosCargados[1]);
        nombre_es.setText(datosCargados[2]);
        paterno.setText(datosCargados[3]);
        materno.setText(datosCargados[4]);
        fecha.setText(datosCargados[6]);

        switch (datosCargados[5]){

            case "ISC":

                carrera.setSelection(1);

                break;

            case "IM":

                carrera.setSelection(2);

                break;

            case "IIA":

                carrera.setSelection(3);

                break;

            case "CP":

                carrera.setSelection(4);

                break;

            case "LA":

                carrera.setSelection(5);

                break;

        }


    }

    @Override
    public void onAlumnoClick(String cadena) {

        alumnoSeleccionado(cadena);

    }

    public void mostrarTabla(){

        new Thread(new Runnable() {

            @Override
            public void run() {
                datos = (ArrayList<Bitacoras>) fachada.consultaCompleta();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter = new CustomAdapter2(datos, ActivityCambios.this);
                        recyclerView.setAdapter(adapter);
                    }
                });
            }

        }).start();
    }
}

class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.ViewHolder> {

    private ArrayList<Bitacoras> localDataSet;
    private OnAlumnoClickListener listener;

    // Clase interna ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView_recycler);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    // Interfaz para manejar clics en los elementos de la lista
    public interface OnAlumnoClickListener {
        void onAlumnoClick(String cadena);
    }

    public CustomAdapter2(ArrayList<Bitacoras> dataset, OnAlumnoClickListener listener) {
        localDataSet = dataset;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.textview_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.getTextView().setText(localDataSet.get(position).toString());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onAlumnoClick(localDataSet.get(position).toString());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
