package src.model;

public class Sala {
    private String nombre;
    private String estado;

    public Sala (String nombre, String estado){
        this.nombre = nombre;
        this.estado = estado;
    }

    //get
    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}