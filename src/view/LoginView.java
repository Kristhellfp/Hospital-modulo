package src.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    // Objetos globales
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {

        // Configuración de la ventana de login
        setTitle("Acceso al Sistema");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);


        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(240, 248, 255));  // Color azul claro


        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 130, 180));  // Azul acero
        JLabel headerLabel = new JLabel("Iniciar Sesión", JLabel.CENTER);
        headerLabel.setFont(new Font("Verdana", Font.BOLD, 24));
        headerLabel.setForeground(Color.WHITE);
        headerPanel.add(headerLabel);

        // Panel central para el formulario de login
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta y campo de texto para "Usuario"
        JLabel userLabel = new JLabel("Nombre de usuario:");
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        userLabel.setForeground(new Color(70, 130, 180));  // Mismo azul del encabezado
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(userLabel, gbc);

        userField = new JTextField(15);
        userField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        userField.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));  // Borde del mismo color
        gbc.gridx = 1;
        gbc.gridy = 0;
        formPanel.add(userField, gbc);


        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        passwordLabel.setForeground(new Color(70, 130, 180));
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(passwordLabel, gbc);

        passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
        gbc.gridx = 1;
        gbc.gridy = 1;
        formPanel.add(passwordField, gbc);

        // Botón de login
        loginButton = new JButton("Acceder");
        loginButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        loginButton.setBackground(new Color(70, 130, 180));
        loginButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(loginButton, gbc);


        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);


        add(mainPanel);
        setVisible(true);
    }

    public String getUsername() {
        return userField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }
}