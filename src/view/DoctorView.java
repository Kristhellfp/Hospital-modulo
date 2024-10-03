package src.view;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {

    private JLabel nameLabel;
    private JLabel specialtyLabel;
    private JLabel phoneLabel;
    private JLabel emailLabel;

    public DoctorView(String name, String specialty, String phone, String email) {
        setTitle("Perfil del Doctor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel de encabezado
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(61, 61, 61)); // Color de fondo del encabezado
        JLabel headerLabel = new JLabel("Hospital");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);

        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        nameLabel = new JLabel("Nombre: " + name);
        specialtyLabel = new JLabel("Especialidad: " + specialty);
        phoneLabel = new JLabel("Teléfono: " + phone);
        emailLabel = new JLabel("Email: " + email);

        // Añadir etiquetas al panel principal
        mainPanel.add(nameLabel);
        mainPanel.add(new JLabel()); // Espacio vacío
        mainPanel.add(specialtyLabel);
        mainPanel.add(new JLabel()); // Espacio vacío
        mainPanel.add(phoneLabel);
        mainPanel.add(new JLabel()); // Espacio vacío
        mainPanel.add(emailLabel);
        mainPanel.add(new JLabel()); // Espacio vacío

        // Añadir paneles a la ventana
        add(headerPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
