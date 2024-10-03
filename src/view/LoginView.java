package src.view;

import src.model.Doctor;
import src.services.DataDoctor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    private DataDoctor dataDoctor;

    public LoginView() {
        dataDoctor = new DataDoctor();  // Crear instancia de DataDoctor

        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel para el login
        JPanel panel = new JPanel();
        JLabel lblUsuario = new JLabel("Usuario:");
        JTextField txtUsuario = new JTextField(10);
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField(10);

        JButton btnLogin = new JButton("Iniciar Sesión");

        // Acción al presionar el botón de iniciar sesión
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String password = new String(txtPassword.getPassword());

                // Validar el login usando DataDoctor
                Doctor doctor = dataDoctor.login(usuario, password);

                if (doctor != null) {
                    // Si el login es exitoso, abrir DoctorView con la información del doctor
                    new DoctorView(doctor.getNombre(), doctor.getEspecialidad());
                    dispose();  // Cerrar la ventana de login
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });

        // Añadir los componentes al panel
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginView();
    }
}
