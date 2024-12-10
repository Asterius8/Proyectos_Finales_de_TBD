package entidades;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Usuarios {

    @PrimaryKey
    @NonNull
    private String nombre_usuario;

    @NonNull
    private String contraseña;

    public Usuarios() {
    }

    public Usuarios(@NonNull String nombre_usuario, @NonNull String contraseña) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    @NonNull
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(@NonNull String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    @NonNull
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(@NonNull String contraseña) {
        this.contraseña = contraseña;
    }
}
