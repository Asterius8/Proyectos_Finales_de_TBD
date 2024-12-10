package controladores;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface BitacorasDAO {

    @Insert
    public void agregarBitacora(Alumno a);

}
