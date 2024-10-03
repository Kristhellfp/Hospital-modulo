package src.services;

import src.model.Doctor;
import java.util.ArrayList;

public class DataDoctor {
    private ArrayList<Doctor> data;

    public DataDoctor() {
        data = new ArrayList<>();
        // Agregando doctores
        data.add(new Doctor("Dr. Damián Tejeda", "dtejeda@hospital.com", "1589-9633", "dtejeda", "tejedad11", "Pediatría"));
        data.add(new Doctor("Dra. Adriana Lucas", "alucas@hospital.com", "7856-9855", "alucas", "adrilucas16", "Nutrición"));
        data.add(new Doctor("Dr. Luis Rosales", "lrosales@hospital.com", "1259-6532", "lrosales", "rosalesll58", "Dermatología"));
        data.add(new Doctor("Dra. Angie Castro", "acastro@hospital.com", "1254-9877", "acastro", "castroang99", "Pediatría"));
        data.add(new Doctor("Dr. Gerardo Larios", "glarios@hospital.com", "3698-7412", "glarios", "lariosg8966", "Neurología"));
    }

    public Doctor login(String usuario, String contraseña) {
        for (Doctor doctor : data) {
            // Mensaje de depuración para verificar los datos
            System.out.println("Verificando: " + doctor.getUsuario() + " - " + doctor.getContraseña());
            if (doctor.getUsuario().equals(usuario) && doctor.getContraseña().equals(contraseña)) {
                return doctor;
            }
        }
        return null; // Retorna null si no se encuentra el doctor
    }

    public ArrayList<Doctor> getDoctores() {
        return data;
    }
}
