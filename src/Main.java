package src;

import src.controller.LoginController;
import src.services.DataDoctor;
import src.view.DoctorLayout; // Asegúrate de que DoctorLayout sea la clase que quieres usar
import src.view.LoginView;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la vista y los servicios
        LoginView loginView = new LoginView();
        DataDoctor dataDoctor = new DataDoctor();

        // Crear el controlador y pasarle la vista y el servicio de datos
        LoginController loginController = new LoginController(loginView);
    }
}
