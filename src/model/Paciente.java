package src.model;

public class Paciente {
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String fechaNacimiento;
    private String horarioCita;
    private String motivoVisita;
    private int numeroConsultas;
    private String doctor;

    public Paciente(String nombre, String correo, String telefono, String direccion, String fechaNacimiento, String horarioCita, String motivoVisita, int numeroConsultas, String doctor){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.horarioCita = horarioCita;
        this.motivoVisita = motivoVisita;
        this.numeroConsultas = numeroConsultas;
        this.doctor = doctor;
    }

    //geters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getHorarioCita() {
        return horarioCita;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public int getNumeroConsultas() {
        return numeroConsultas;
    }

    public String getDoctor() {
        return doctor;
    }

    //seter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setHorarioCita(String horarioCita) {
        this.horarioCita = horarioCita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        this.numeroConsultas = numeroConsultas;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }


    //toString
    @Override
    public String toString() {
        return "Pacientes{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", horarioCita=" + horarioCita +
                ", motivoVisita='" + motivoVisita + '\'' +
                ", numeroConsultas=" + numeroConsultas +
                ", doctor='" + doctor + '\'' +
                '}';
    }
}