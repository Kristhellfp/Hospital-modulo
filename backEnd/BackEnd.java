package backEnd;

import src.model.Doctor;
import src.services.DataDoctor;
import java.util.HashMap;

public class BackEnd {

    private DataDoctor dataDoctor;

    public BackEnd() {
        dataDoctor = new DataDoctor(); // Inicializa DataDoctor aquí
    }

    public HashMap<String, String> validarDatos(String usuario, String contraseña) {
        HashMap<String, String> response = new HashMap<>();

        Doctor doctor = dataDoctor.login(usuario, contraseña);

        if (doctor != null) {
            response.put("Nombre", doctor.getNombre());
            response.put("Correo", doctor.getEmail());
            response.put("Especialidad", doctor.getEspecialidad());
        } else {
            response.put("Error", "Credenciales incorrectas");
        }

        return response;
    }
}
