package com.asterius.app_web;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import controladores.Caretaker;
import controladores.Memento;
import controladores.Originator;
import entidades.Bitacoras;

public class ActivityBajas extends AppCompatActivity {

    EditText id_bi;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    ArrayList<Bitacoras> datos = null;
    private Fachada fachada;
    private Caretaker caretaker = new Caretaker();
    private Originator originator = new Originator();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajas);

        id_bi = findViewById(R.id.txt_id_bi_b);

        recyclerView = findViewById(R.id.lista_alumnos);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        fachada = new Fachada(this);

        mostrarTabla();

    }//onCreate

    public void eliminarBitacora(View v){

        if(!(id_bi.getText().toString().isEmpty())){

            new Thread(() -> {

                ArrayList<Bitacoras> bitacora = fachada.verificarUnicaExistencia(id_bi.getText().toString());

                if (!bitacora.isEmpty()) {

                    originator.setBitacora(bitacora.get(0));

                    caretaker.addMemento(originator.createMemento());

                    fachada.borrarBitacora(id_bi.getText().toString());

                    mostrarTabla();

                    runOnUiThread(() -> {
                        Toast.makeText(this, "Eliminación exitosa", Toast.LENGTH_LONG).show();
                    });

            }else{

                runOnUiThread(() -> {
                    Toast.makeText(this,"No existe ese registro", Toast.LENGTH_LONG).show();
                });

            }

            }).start();

        }else{

            Toast.makeText(this,"Por favor agrege un id para borrar una bitacora", Toast.LENGTH_LONG).show();

        }

    }

    public void mostrarTabla(){

        new Thread(new Runnable() {

            @Override
            public void run() {
                datos = (ArrayList<Bitacoras>) fachada.consultaCompleta();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        adapter = new CustomAdapter(datos);
                        recyclerView.setAdapter(adapter);
                    }
                });
            }

        }).start();

    }

    public void deshacerEliminacion(View v) {
        Memento memento = caretaker.getMemento();
        if (memento != null) {
            Bitacoras bitacoraRestaurada = memento.getBitacora();
            fachada.agregarBitacora(bitacoraRestaurada.getId_bitacora(), bitacoraRestaurada.getNombre_estudiante(),
                    bitacoraRestaurada.getPaterno(), bitacoraRestaurada.getMaterno(),
                    bitacoraRestaurada.getCarrera(), bitacoraRestaurada.getFecha());
            mostrarTabla();
            runOnUiThread(() -> {
                Toast.makeText(this, "Restauración exitosa", Toast.LENGTH_LONG).show();
            });
            mostrarTabla();
        } else {
            runOnUiThread(() -> {
                Toast.makeText(this, "No hay ninguna eliminación para deshacer", Toast.LENGTH_LONG).show();
            });
        }
    }
}//clase

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private ArrayList<Bitacoras> localDataSet;


    //Clase INTERNA
    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView_recycler);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    public CustomAdapter(ArrayList<Bitacoras> dataset) {
        localDataSet = dataset;
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

}//CustomAdapter
