package src.controller;

import src.services.DataDoctor;
import src.view.LoginView;
import src.model.Doctor;
import src.services.DataDoctor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private LoginView loginView; // Vista de inicio de sesión
    private DataDoctor dataDoctor; // Servicio para acceder a los datos de los doctores

    public LoginController(LoginView loginView, DataDoctor dataDoctor) {
        this.loginView = loginView;
        this.dataDoctor = dataDoctor;

        // Agrega un listener al botón de inicio de sesión
        this.loginView.addLoginListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlDeLogin(); // Llama al método para controlar el inicio de sesión
            }
        });
    }

    private void controlDeLogin() {
        // Obtiene los datos ingresados por el usuario
        String usuario = loginView.getUsuario();
        String contraseña = loginView.getContraseña();

        // Verifica el inicio de sesión
        Doctor doctor = dataDoctor.login(usuario, contraseña);
        if (doctor != null) {
            // Si el inicio de sesión es exitoso, muestra la información del doctor en una nueva ventana
            mostrarVentanaDoctor(doctor); // Muestra la ventana con la información
        } else {
            // Si no se encontró al doctor, muestra un mensaje de error
            loginView.showError("Usuario o contraseña incorrectos.");
        }
    }

    private void mostrarVentanaDoctor(Doctor doctor) {
        // Crear un nuevo JFrame para la información del doctor
        JFrame ventanaDoctor = new JFrame("Información del Doctor");
        ventanaDoctor.setSize(400, 300);
        ventanaDoctor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaDoctor.setLocationRelativeTo(null);

        // Crear un panel para mostrar la información
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Layout vertical

        // Crear etiquetas con la información del doctor
        JLabel etiquetaNombre = new JLabel("Nombre: " + doctor.getNombre());
        JLabel etiquetaEmail = new JLabel("Email: " + doctor.getEmail());
        JLabel etiquetaTelefono = new JLabel("Teléfono: " + doctor.getTelefono());
        JLabel etiquetaEspecialidad = new JLabel("Especialidad: " + doctor.getEspecialidad());

        // Personalizar el estilo de las etiquetas
        etiquetaNombre.setFont(new Font("Arial", Font.BOLD, 16));
        etiquetaEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        etiquetaTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
        etiquetaEspecialidad.setFont(new Font("Arial", Font.PLAIN, 14));

        // Añadir las etiquetas al panel
        panel.add(etiquetaNombre);
        panel.add(Box.createVerticalStrut(10)); // Espacio entre los elementos
        panel.add(etiquetaEmail);
        panel.add(Box.createVerticalStrut(10));
        panel.add(etiquetaTelefono);
        panel.add(Box.createVerticalStrut(10));
        panel.add(etiquetaEspecialidad);

        // Añadir el panel al JFrame
        ventanaDoctor.add(panel);

        // Hacer visible la ventana
        ventanaDoctor.setVisible(true);
    }
}
