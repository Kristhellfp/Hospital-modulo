package src.view;

import javax.swing.*;
import java.awt.*;

public class DoctorView {
    private JFrame frame; // Ventana principal
    private JLabel nameLabel; // Etiqueta para el nombre
    private JLabel emailLabel; // Etiqueta para el email
    private JLabel phoneLabel; // Etiqueta para el teléfono
    private JLabel specialtyLabel; // Etiqueta para la especialidad

    public DoctorView() {
        // Configuración de la ventana
        frame = new JFrame("Perfil del Doctor");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Panel para el diseño
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2)); // Diseño en cuadrícula

        // Inicializar etiquetas
        nameLabel = new JLabel();
        emailLabel = new JLabel();
        phoneLabel = new JLabel();
        specialtyLabel = new JLabel();

        // Agregar etiquetas de texto al panel
        panel.add(new JLabel("Nombre:")); // Etiqueta estática
        panel.add(nameLabel); // Etiqueta dinámica
        panel.add(new JLabel("Email:"));
        panel.add(emailLabel);
        panel.add(new JLabel("Teléfono:"));
        panel.add(phoneLabel);
        panel.add(new JLabel("Especialidad:"));
        panel.add(specialtyLabel);

        // Agregar el panel a la ventana
        frame.add(panel);
    }

    // Método para actualizar la información del doctor
    public void setDoctorInfo(String nombre, String email, String telefono, String especialidad) {
        nameLabel.setText(nombre);
        emailLabel.setText(email);
        phoneLabel.setText(telefono);
        specialtyLabel.setText(especialidad);
    }

    // Método para mostrar la ventana
    public void show() {
        frame.setVisible(true);
    }

    // Método para cerrar la ventana
    public void dispose() {
        frame.dispose();
    }
}

