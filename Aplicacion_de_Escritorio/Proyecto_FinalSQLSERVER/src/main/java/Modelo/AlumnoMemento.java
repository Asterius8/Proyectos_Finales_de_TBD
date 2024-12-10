package Modelo;

public class AlumnoMemento {

    private final String numeroControl;
    private final String nombres;
    private final String apPaterno;
    private final String apMaterno;
    private final String fechaNacimiento;
    private final int edad;
    private final String telefono;
    private final String semestre;
    private final String carrera;

    public AlumnoMemento(String numeroControl, String nombres, String apPaterno, String apMaterno,
            String fechaNacimiento, int edad, String telefono, String semestre, String carrera) {
        this.numeroControl = numeroControl;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.telefono = telefono;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }

}
