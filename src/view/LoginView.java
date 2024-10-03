package src.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoContraseña;
    private JButton botonLogin;

    public LoginView() {
        // Configura la ventana
        setTitle("Login Doctor");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crea los componentes
        campoUsuario = new JTextField(15);
        campoContraseña = new JPasswordField(15);
        botonLogin = new JButton("Iniciar sesión");

        // Layout
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Usuario:"));
        add(campoUsuario);
        add(new JLabel("Contraseña:"));
        add(campoContraseña);
        add(new JLabel()); // Espacio vacío
        add(botonLogin);
    }

    // Métodos para obtener los datos ingresados
    public String getUsuario() {
        return campoUsuario.getText();
    }

    public String getContraseña() {
        return new String(campoContraseña.getPassword());
    }

    // Método para agregar un listener al botón de login
    public void addLoginListener(ActionListener listener) {
        botonLogin.addActionListener(listener);
    }

    // Método para mostrar un error
    public void showError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

