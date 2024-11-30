package Modelo;

public class Usuario {
    //Atributos
    private String nombre_de_usuario;
    private String contrase_usuario;
    
    //Constructor(es)
    public Usuario() {
    }

    public Usuario(String nombre_de_usuario, String contrase_usuario) {
        
        this.nombre_de_usuario = nombre_de_usuario;
        this.contrase_usuario = contrase_usuario;
        
    }
    
    //Getter & Setter
    public String getNombre_de_usuario() {
        return nombre_de_usuario;
    }

    public void setNombre_de_usuario(String nombre_de_usuario) {
        this.nombre_de_usuario = nombre_de_usuario;
    }

    public String getContrase_usuario() {
        return contrase_usuario;
    }

    public void setContrase_usuario(String contrase_usuario) {
        this.contrase_usuario = contrase_usuario;
    }
   
    //metodos sobreescritos

    @Override
    public String toString() {
        return "Usuario{" + "nombre_de_usuario=" + nombre_de_usuario + ", contrase_usuario=" + contrase_usuario + '}';
    }

    
}
