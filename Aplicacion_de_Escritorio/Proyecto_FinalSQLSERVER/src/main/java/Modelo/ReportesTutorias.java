package Modelo;

public class ReportesTutorias {
    
    //Atributos
    private int id_reporte;
    private String fecha_r;
    private String observaciones_r;
    private String progreso;
    
    //Constructor(es)
    public ReportesTutorias(int id_reporte, String fecha_r, String observaciones_r, String progreso) {
        this.id_reporte = id_reporte;
        this.fecha_r = fecha_r;
        this.observaciones_r = observaciones_r;
        this.progreso = progreso;
    }

    public ReportesTutorias() {
    }
    
    
    
    //Getter & Setter
    public int getId_reporte() {
        return id_reporte;
    }

    public void setId_reporte(int id_reporte) {
        this.id_reporte = id_reporte;
    }

    public String getFecha_r() {
        return fecha_r;
    }

    public void setFecha_r(String fecha_r) {
        this.fecha_r = fecha_r;
    }

    public String getObservaciones_r() {
        return observaciones_r;
    }

    public void setObservaciones_r(String observaciones_r) {
        this.observaciones_r = observaciones_r;
    }

    public String getProgreso() {
        return progreso;
    }

    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }
    
    //Metodos sobreescritos
    @Override
    public String toString() {
        return "ReportesTutorias{" + "id_reporte=" + id_reporte + ", fecha_r=" + fecha_r + ", observaciones_r=" + observaciones_r + ", progreso=" + progreso + '}';
    }
    
    
}
