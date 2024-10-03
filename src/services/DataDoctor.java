package src.services;

import src.model.Doctor;
import java.util.ArrayList;

public class DataDoctor {

    private ArrayList<Doctor> data;

    public DataDoctor() {
        data = new ArrayList<>();

        data.add(new Doctor("Dr. Damián Tejeda", "dtejeda@hospital.com", "Pediatría", "1589-9633", "dtejeda", "tejedad11"));
        data.add(new Doctor("Dra. Adriana Lucas", "alucas@hospital.com", "Nutrición", "7856-9855", "alucas", "adrilucas16"));
        data.add(new Doctor("Dr. Luis Rosales", "lrosales@hospital.com", "Dermatología", "1259-6532", "lrosales", "rosalesll58"));
        data.add(new Doctor("Dra. Angie Castro", "acastro@hospital.com", "Pediatrñia", "1254-9877", "acastro", "castroang99"));
        data.add(new Doctor("Dr. Gerardo Larios", "glarios@hospital.com", "Neurología", "3698-7412", "glarios", "lariosg8966"));
    }


    public Doctor login(String usuario, String contraseña) {
        for (Doctor doctor : data) {
            if (doctor.getUsuario().equals(usuario) && doctor.getContraseña().equals(contraseña)) {
                return doctor;
            }
        }
        return null;
    }

    public ArrayList<Doctor> getDoctores() {
        return data;
    }
}