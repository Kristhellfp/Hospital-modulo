package src.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class DoctorLayout extends JFrame {

    private int width = 1300;
    private int height = 800;

    public DoctorLayout(HashMap<String, String> dataDoctor) {
        setTitle("Perfil del Doctor");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear el panel de encabezado
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(width, 60));
        headerPanel.setBackground(new Color(28, 28, 28)); // Color oscuro
        headerPanel.setLayout(new BorderLayout());

        // Título del hospital
        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Información del doctor
        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new GridLayout(4, 1));
        doctorInfoPanel.setBackground(new Color(240, 240, 240)); // Color claro para el fondo

        String nombre = dataDoctor.get("Nombre");
        String especialidad = dataDoctor.get("Especialidad");
        String email = dataDoctor.get("Email");
        String telefono = dataDoctor.get("Telefono");

        // Etiquetas con información del doctor
        JLabel nombreDoctorLabel = new JLabel("Nombre: " + nombre);
        JLabel especialidadLabel = new JLabel("Especialidad: " + especialidad);
        JLabel emailLabel = new JLabel("Email: " + email);
        JLabel telefonoLabel = new JLabel("Teléfono: " + telefono);

        // Estilo de las etiquetas
        nombreDoctorLabel.setForeground(Color.BLACK);
        especialidadLabel.setForeground(Color.GRAY);
        emailLabel.setForeground(Color.GRAY);
        telefonoLabel.setForeground(Color.GRAY);

        // Agregar etiquetas al panel de información
        doctorInfoPanel.add(nombreDoctorLabel);
        doctorInfoPanel.add(especialidadLabel);
        doctorInfoPanel.add(emailLabel);
        doctorInfoPanel.add(telefonoLabel);

        // Agregar paneles al marco
        add(headerPanel, BorderLayout.NORTH);
        add(doctorInfoPanel, BorderLayout.CENTER);
        add(createSideMenu(), BorderLayout.WEST);

        // Panel vacío a la derecha
        JPanel emptyPanel = new JPanel();
        emptyPanel.setBackground(Color.WHITE); // Color de fondo blanco
        add(emptyPanel, BorderLayout.EAST);

        // Mostrar la ventana
        setVisible(true);
    }

    // Método para crear el menú lateral
    private JPanel createSideMenu() {
        JPanel sideMenuPanel = new JPanel();
        sideMenuPanel.setPreferredSize(new Dimension(250, height));
        sideMenuPanel.setBackground(new Color(50, 50, 50)); // Color del menú lateral
        sideMenuPanel.setLayout(new BoxLayout(sideMenuPanel, BoxLayout.Y_AXIS));

        // Agregar botones o elementos al menú lateral
        JButton btnPacientes = new JButton("Pacientes");
        JButton btnCitas = new JButton("Citas");
        JButton btnSalir = new JButton("Salir");

        // Estilo de los botones
        btnPacientes.setBackground(new Color(70, 70, 70));
        btnPacientes.setForeground(Color.WHITE);
        btnCitas.setBackground(new Color(70, 70, 70));
        btnCitas.setForeground(Color.WHITE);
        btnSalir.setBackground(new Color(70, 70, 70));
        btnSalir.setForeground(Color.WHITE);

        // Acción para el botón de Pacientes
        btnPacientes.addActionListener(e -> {
            // Aquí puedes agregar la acción para mostrar la lista de pacientes
            System.out.println("Mostrar lista de pacientes");
        });

        // Acción para el botón de Citas
        btnCitas.addActionListener(e -> {
            // Aquí puedes agregar la acción para mostrar las citas
            System.out.println("Mostrar citas");
        });

        // Acción para el botón de Salir
        btnSalir.addActionListener(e -> {
            // Aquí puedes agregar la acción para salir de la aplicación
            System.exit(0);
        });

        // Agregar botones al panel del menú
        sideMenuPanel.add(btnPacientes);
        sideMenuPanel.add(btnCitas);
        sideMenuPanel.add(btnSalir);

        return sideMenuPanel;
    }
}
