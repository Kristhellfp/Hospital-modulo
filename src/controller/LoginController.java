package src.controller;

import src.view.LoginView;
import src.view.DoctorLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginController {
    private LoginView loginView;

    public LoginController(LoginView view) {
        this.loginView = view;

        // Añadir el listener para el botón de inicio de sesión
        loginView.addLoginListener(new LoginListener());
    }

    private class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = loginView.getUsername();
            String password = loginView.getPassword();

            // Aquí puedes agregar la lógica para verificar el usuario y la contraseña
            if (isValidUser(username, password)) {
                // Datos del doctor simulados
                HashMap<String, String> dataDoctor = new HashMap<>();
                dataDoctor.put("Nombre", "Fernanda Paz");
                dataDoctor.put("Especialidad", "Doctora General");
                dataDoctor.put("Email", "fernanda.paz@hospital.com");
                dataDoctor.put("Telefono", "1234-5678");

                // Si la autenticación es exitosa, abrir la vista del doctor
                new DoctorLayout(dataDoctor);
                loginView.dispose(); // Cerrar la ventana de inicio de sesión
            } else {
                JOptionPane.showMessageDialog(loginView, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        private boolean isValidUser(String username, String password) {
            // Aquí puedes agregar la lógica para validar el usuario
            return "admin".equals(username) && "password".equals(password); // Ejemplo simple
        }
    }
}
