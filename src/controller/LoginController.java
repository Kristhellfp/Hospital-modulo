package src.controller;

import backEnd.BackEnd;
import src.view.LoginView;
import java.util.HashMap;

public class LoginController {

    private LoginView loginView;
    private BackEnd backEnd;

    public LoginController(LoginView loginView, BackEnd backEnd) {
        this.loginView = loginView;
        this.backEnd = backEnd;

        // Aquí se agrega el ActionListener al botón de login
        this.loginView.addLoginListener(e -> handleLogin());
    }

    private void handleLogin() {
        String usuario = loginView.getUsuario();
        String contraseña = loginView.getPassword();

        HashMap<String, String> result = backEnd.validarDatos(usuario, contraseña);

        if (result.containsKey("Error")) {
            System.out.println("Error: " + result.get("Error"));
        } else {
            System.out.println("Login exitoso:");
            System.out.println("Nombre: " + result.get("Nombre"));
            System.out.println("Correo: " + result.get("Correo"));
            System.out.println("Especialidad: " + result.get("Especialidad"));
        }
    }
}
