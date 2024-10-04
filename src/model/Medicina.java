package src.model;

import java.time.LocalDate;

public class Medicina {
    private String nombre;
    private String formaFarmaceutica;
    private String dosis;
    private String principioActivo;
    private LocalDate fechaCaducacion;
    private String numeroLote;
    private double precio;
    private String indicaciones;
    private String contraindicaciones;

    public Medicina(String nombre, String formaFarmaceutica, String dosis, String principioActivo, LocalDate fechaCaducacion, String numeroLote, double precio, String indicaciones, String contraindicaciones){
        this.nombre = nombre;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosis = dosis;
        this.principioActivo = principioActivo;
        this.fechaCaducacion = fechaCaducacion;
        this.numeroLote = numeroLote;
        this.precio = precio;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
    }


    //geters
    public String getNombre() {
        return nombre;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public String getDosis() {
        return dosis;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public LocalDate getFechaCaducacion() {
        return fechaCaducacion;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public double getPrecio() {
        return precio;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }


    //seters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public void setFechaCaducacion(LocalDate fechaCaducacion) {
        this.fechaCaducacion = fechaCaducacion;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", formaFarmaceutica='" + formaFarmaceutica + '\'' +
                ", dosis='" + dosis + '\'' +
                ", principioActivo='" + principioActivo + '\'' +
                ", fechaCaducacion=" + fechaCaducacion +
                ", numeroLote='" + numeroLote + '\'' +
                ", precio=" + precio +
                ", indicaciones='" + indicaciones + '\'' +
                ", contraindicaciones='" + contraindicaciones + '\'' +
                '}';
    }
}