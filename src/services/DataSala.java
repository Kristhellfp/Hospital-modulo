package src.services;

import src.model.Sala;

import java.util.ArrayList;
import java.util.List;

public class DataSala {

    private List<Sala> salas;

    public DataSala() {
        salas = new ArrayList<>();
        listaSala();
    }

    private void listaSala() {
        salas.add(new Sala("Sala de Traumatología", "Disponible"));
        salas.add(new Sala("Unidad de Cuidados Críticos", "En operación"));
        salas.add(new Sala("Sala de Neonatología Avanzada", "Fuera de servicio temporalmente"));
        salas.add(new Sala("Sala de Atención Materno-Infantil", "Ocupada"));
        salas.add(new Sala("Quirófano de Especialidades", "Accesible"));
        salas.add(new Sala("Sala de Recuperación Anestésica", "No disponible"));
        salas.add(new Sala("Sala de Diagnóstico Radiológico", "Ocupada"));
        salas.add(new Sala("Sala de Infusión y Quimioterapia", "Libre para asignación"));
        salas.add(new Sala("Sala de Pediatría Integral", "En uso"));
        salas.add(new Sala("Sala de Cardiología y Electrofisiología", "Temporalmente no disponible"));
        salas.add(new Sala("Sala de Espera de Emergencias", "Listo para pacientes"));
        salas.add(new Sala("Sala de Monitoreo Postoperatorio", "Ocupada actualmente"));
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void mostrarSalas() {
        for (Sala sala : salas) {
            System.out.println(sala.toString());
        }
    }
}
