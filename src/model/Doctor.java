package src.model;

public class Doctor {
    private String nombre;
    private String email;
    private String telefono;
    private String usuario;
    private String contraseña;
    private String especialidad;

    // Constructor
    public Doctor(String nombre, String email, String telefono, String usuario, String contraseña, String especialidad) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.especialidad = especialidad;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
