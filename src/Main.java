package src;

import src.controller.LoginController;
import src.services.DataDoctor;
import src.view.LoginView;

public class Main {
    public static void main(String[] args) {
        // Crea la vista y el servicio de datos
         LoginView loginView = new LoginView();
        DataDoctor dataDoctor = new DataDoctor();

        // Crea el controlador
        LoginController loginController = new LoginController(loginView, dataDoctor);

        // Muestra la ventana de login
        loginView.setVisible(true);
    }
}
