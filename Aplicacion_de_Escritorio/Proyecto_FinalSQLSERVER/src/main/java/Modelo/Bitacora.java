package Modelo;

public class Bitacora {

    //Atributos
    private String fecha_tutorias;
    private byte duracion_tutorias;
    private String observaciones;
    private int num_control;

    //Constructor(es)f
    public Bitacora() {
    }

    public Bitacora(String fecha_tutorias, byte duracion_tutorias, String observaciones, int num_control) {

        this.fecha_tutorias = fecha_tutorias;
        this.duracion_tutorias = duracion_tutorias;
        this.observaciones = observaciones;
        this.num_control = num_control;

    }
    
    //getter & setter
    public String getFecha_tutorias() {
        return fecha_tutorias;
    }

    public void setFecha_tutorias(String fecha_tutorias) {
        this.fecha_tutorias = fecha_tutorias;
    }

    public byte getDuracion_tutorias() {
        return duracion_tutorias;
    }

    public void setDuracion_tutorias(byte duracion_tutorias) {
        this.duracion_tutorias = duracion_tutorias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getNum_control() {
        return num_control;
    }

    public void setNum_control(int num_control) {
        this.num_control = num_control;
    }
    
    

}
