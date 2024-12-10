package entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Bitacoras {

    @PrimaryKey
    @NonNull
    public int id_bitacora;

    @NonNull
    public String nombre_estudiante;

    @NonNull
    public String paterno;

    @NonNull
    public  String materno;

    @NonNull
    public String carrera;

    @NonNull
    public String fecha;

    public Bitacoras() {

    }

    public Bitacoras(@NonNull int id_bitacora, @NonNull String nombre_estudiante, @NonNull String paterno, @NonNull String materno, @NonNull String carrera, @NonNull String fecha) {
        this.id_bitacora = id_bitacora;
        this.nombre_estudiante = nombre_estudiante;
        this.paterno = paterno;
        this.materno = materno;
        this.carrera = carrera;
        this.fecha = fecha;
    }

    public int getId_bitacora() {
        return id_bitacora;
    }

    public void setId_bitacora(int id_bitacora) {
        this.id_bitacora = id_bitacora;
    }

    @NonNull
    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(@NonNull String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    @NonNull
    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(@NonNull String paterno) {
        this.paterno = paterno;
    }

    @NonNull
    public String getMaterno() {
        return materno;
    }

    public void setMaterno(@NonNull String materno) {
        this.materno = materno;
    }

    @NonNull
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(@NonNull String carrera) {
        this.carrera = carrera;
    }

    @NonNull
    public String getFecha() {
        return fecha;
    }

    public void setFecha(@NonNull String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return
                "|" + id_bitacora +
                "|" + nombre_estudiante +
                "|" + paterno +
                "|" + materno +
                "|" + carrera +
                "|" + fecha;
    }
}
