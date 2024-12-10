package controladores;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import entidades.Bitacoras;

@Dao
public interface BitacorasDAO {

    @Insert
    public void agregarBitacora(Bitacoras b);

    @Query("DELETE FROM Bitacoras WHERE id_bitacora = :ib")
    public void eliminarBitacorasPorId(String ib);

    @Query("UPDATE Bitacoras SET nombre_estudiante = :ne, paterno = :p, materno = :m, carrera = :c, fecha = :f WHERE id_bitacora = :ib")
    public void actualizarBitacora(String ib, String ne, String p, String m, String  c, String f);

    @Query("SELECT * FROM Bitacoras")
    public List<Bitacoras> mostarTodos();

    @Query("SELECT * FROM Bitacoras WHERE id_bitacora = :ib")
    public List<Bitacoras> mostarPorId(String ib);

    @Query("SELECT * FROM Bitacoras WHERE nombre_estudiante = :ne")
    public List<Bitacoras> mostarPorNombre(String ne);

    @Query("SELECT * FROM Bitacoras WHERE paterno = :p")
    public List<Bitacoras> mostarPorPaterno(String p);

    @Query("SELECT * FROM Bitacoras WHERE materno = :m")
    public List<Bitacoras> mostarPorMaterno(String m);

    @Query("SELECT * FROM Bitacoras WHERE carrera = :c")
    public List<Bitacoras> mostarPorCarrera(String  c);

    @Query("SELECT * FROM Bitacoras WHERE fecha = :f")
    public List<Bitacoras> mostarPorFecha(String f);




}
