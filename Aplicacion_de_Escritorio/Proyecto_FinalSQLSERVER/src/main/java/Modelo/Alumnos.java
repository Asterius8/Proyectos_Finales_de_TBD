package Modelo;

public class Alumnos {

    //atributos
    private int num_control;
    private String nombre;
    private String paterno;
    private String materno;
    private String fecha_nac;
    private long telefono;
    private byte semestre;
    private String carrera;

    //Constructor(es)

    public Alumnos() {
    }

    public Alumnos(int num_control, String nombre, String paterno, String materno, String fecha_nac, long telefono, byte semestre, String carrera) {
        this.num_control = num_control;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public int getNum_control() {
        return num_control;
    }

    public void setNum_control(int num_control) {
        this.num_control = num_control;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    
    
    
    
}
