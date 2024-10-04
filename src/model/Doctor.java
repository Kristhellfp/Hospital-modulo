package src.model;

import java.util.HashMap;

public class Doctor {
    private String nombre;
    private String email;
    private String especialidad;
    private String telefono;
    private String usuario;
    private String contraseña;

    public Doctor(String nombre, String email, String especialidad, String telefono, String usuario, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getEspecialidad() {
        return especialidad;
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

    public HashMap<String, String> toHashMap() {
        HashMap<String, String> doctorData = new HashMap<>();
        doctorData.put("Nombre", this.nombre);
        doctorData.put("Correo", this.email);
        doctorData.put("Especialidad", this.especialidad);
        doctorData.put("Teléfono", this.telefono);
        return doctorData;
    }
}
