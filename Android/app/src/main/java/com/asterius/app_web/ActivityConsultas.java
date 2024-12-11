package com.asterius.app_web;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import entidades.Bitacoras;

public class ActivityConsultas extends AppCompatActivity {

    EditText id_bi, nombre, paterno, materno, fecha;
    Spinner carrera;
    RadioButton id_bir, nombrer, paternor, maternor, fechar, carrerar, mostrartodor;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private Fachada fachada;
    ArrayList<Bitacoras> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas);

        // Inicializar vistas
        id_bi = findViewById(R.id.txt_id_bi_u);
        nombre = findViewById(R.id.txt_nombre_u);
        paterno = findViewById(R.id.txt_paterno_u);
        materno = findViewById(R.id.txt_materno_u);
        fecha = findViewById(R.id.txt_fecha_nac_u);
        carrera = findViewById(R.id.spn_carrera_u);

        id_bir = findViewById(R.id.rbn_id_bi);
        nombrer = findViewById(R.id.rbn_nombre);
        paternor = findViewById(R.id.rbn_paterno);
        maternor = findViewById(R.id.rbn_materno);
        fechar = findViewById(R.id.rbn_fecha);
        carrerar = findViewById(R.id.rbn_carrera);
        mostrartodor = findViewById(R.id.rbn_mostrar_todo);

        carrera.setEnabled(false);

        mostrartodor.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                id_bi.setEnabled(false);
                nombre.setEnabled(false);
                paterno.setEnabled(false);
                materno.setEnabled(false);
                fecha.setEnabled(false);
                carrera.setEnabled(false);
            }
        });

        id_bir.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                id_bi.setEnabled(true);
                nombre.setEnabled(false);
                paterno.setEnabled(false);
                materno.setEnabled(false);
                fecha.setEnabled(false);
                carrera.setEnabled(false);
            }
        });

        nombrer.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                id_bi.setEnabled(false);
                nombre.setEnabled(true);
                paterno.setEnabled(false);
                materno.setEnabled(false);
                fecha.setEnabled(false);
                carrera.setEnabled(false);
            }
        });

        paternor.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                id_bi.setEnabled(false);
                nombre.setEnabled(false);
                paterno.setEnabled(true);
                materno.setEnabled(false);
                fecha.setEnabled(false);
                carrera.setEnabled(false);
            }
        });

        maternor.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                id_bi.setEnabled(false);
                nombre.setEnabled(false);
                paterno.setEnabled(false);
                materno.setEnabled(true);
                fecha.setEnabled(false);
                carrera.setEnabled(false);
            }
        });

        fechar.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                id_bi.setEnabled(false);
                nombre.setEnabled(false);
                paterno.setEnabled(false);
                materno.setEnabled(false);
                fecha.setEnabled(true);
                carrera.setEnabled(false);
            }
        });

        carrerar.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                id_bi.setEnabled(false);
                nombre.setEnabled(false);
                paterno.setEnabled(false);
                materno.setEnabled(false);
                fecha.setEnabled(false);
                carrera.setEnabled(true);
            }
        });

        // Configurar Spinner
        String[] carreras = {"Seleccione una opción...", "ISC", "IM", "IIA", "CP", "LA"};
        ArrayAdapter<String> adapterCarreras = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, carreras);
        adapterCarreras.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        carrera.setAdapter(adapterCarreras);

        // Inicializar RecyclerView
        recyclerView = findViewById(R.id.lista_alumnos);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Inicializar Fachada
        fachada = new Fachada(this);

        // Mostrar tabla
        new Thread(() -> {

            datos = fachada.consultaCompleta();

            mostrarTabla(datos);

        }).start();
    }

    public void mostrarTabla(ArrayList<Bitacoras> datos) {
        new Thread(() -> {
            // Actualizar RecyclerView en el hilo principal
            runOnUiThread(() -> {
                adapter = new CustomAdapter3(datos);
                recyclerView.setAdapter(adapter);
            });
        }).start();
    }

    public void mostrarPorFiltro(View v){

        if(id_bir.isChecked()){

            new Thread(() -> {

                datos = fachada.consultaId(id_bi.getText().toString());

                mostrarTabla(datos);

                runOnUiThread(() -> {

                    Toast.makeText(this,"Estos son los resultados", Toast.LENGTH_LONG).show();

                });

            }).start();

        }else if(nombrer.isChecked()){

            new Thread(() -> {

            datos = fachada.consultaNombre(nombre.getText().toString());

            mostrarTabla(datos);

            runOnUiThread(() -> {

                Toast.makeText(this,"Estos son los resultados", Toast.LENGTH_LONG).show();

            });

            }).start();

        }else if(paternor.isChecked()){

            new Thread(() -> {

            datos = fachada.consultaPaterno(paterno.getText().toString());

            mostrarTabla(datos);

            runOnUiThread(() -> {

                Toast.makeText(this,"Estos son los resultados", Toast.LENGTH_LONG).show();

            });

            }).start();

        }else if(maternor.isChecked()){

            new Thread(() -> {

            datos = fachada.consultaMaterno(materno.getText().toString());

            mostrarTabla(datos);

            runOnUiThread(() -> {

                Toast.makeText(this,"Estos son los resultados", Toast.LENGTH_LONG).show();

            });

            }).start();

        }else if(carrerar.isChecked()){

            new Thread(() -> {

                if(carrera.getSelectedItem().toString().equals("Seleccione una opción...")){

                    runOnUiThread(() -> {

                        Toast.makeText(this,"Seleccione una carrera", Toast.LENGTH_LONG).show();

                    });

                }else{

                    datos = fachada.consultaCarrera(carrera.getSelectedItem().toString());

                    mostrarTabla(datos);

                    runOnUiThread(() -> {

                        Toast.makeText(this,"Estos son los resultados", Toast.LENGTH_LONG).show();

                    });


                }


            }).start();

        }else if(fechar.isChecked()){

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

                                datos = fachada.consultaFecha(fecha.getText().toString());

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

        }else if(mostrartodor.isChecked()){

            new Thread(() -> {

                datos = fachada.consultaCompleta();

                mostrarTabla(datos);

            }).start();

        }

    }
}

class CustomAdapter3 extends RecyclerView.Adapter<CustomAdapter3.ViewHolder> {

    private final ArrayList<Bitacoras> localDataSet;

    // Clase interna ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView_recycler);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    // Constructor
    public CustomAdapter3(ArrayList<Bitacoras> dataset) {
        this.localDataSet = dataset;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.textview_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTextView().setText(localDataSet.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}


