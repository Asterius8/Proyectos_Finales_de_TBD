package bd;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import controladores.BitacorasDAO;
import entidades.Bitacoras;

@Database(entities = {Bitacoras.class}, version = 1)
public abstract class TutoriasBD extends RoomDatabase {

    private static TutoriasBD INSTANCE;

    public abstract BitacorasDAO bitacorasDAO();

    public static TutoriasBD getAppDataBase(Context context){

        if(INSTANCE == null)

            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),TutoriasBD.class, "tutoriasBD").build();

        return INSTANCE;
    }

    public static void destroyInstance(){INSTANCE=null;}

}
