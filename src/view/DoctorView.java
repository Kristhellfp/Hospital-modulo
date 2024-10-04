package src.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    public DoctorView(HashMap<String, String> doctorData) {
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Perfil del Doctor Asignado");
        setLayout(new BorderLayout());

        // Panel de cabecera
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(new Color(40, 44, 52));
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(new Color(200, 200, 200));
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setBackground(new Color(40, 44, 52));
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(50, 50));
        logoPanel.setBackground(Color.YELLOW);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        userPanel.add(logoPanel, gbc);

        JLabel nombreDoctor = new JLabel(doctorData.get("Nombre"));
        nombreDoctor.setForeground(new Color(255, 255, 255));
        nombreDoctor.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        userPanel.add(nombreDoctor, gbc);

        JLabel especialidadDoctor = new JLabel(doctorData.get("Especialidad"));
        especialidadDoctor.setForeground(new Color(192, 192, 192));
        especialidadDoctor.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        gbc.gridy = 1;
        userPanel.add(especialidadDoctor, gbc);

        headerPanel.add(userPanel, BorderLayout.EAST);

        add(headerPanel, BorderLayout.NORTH);
        add(componenteMenuLateral(), BorderLayout.WEST);

        // Panel de pacientes
        add(createPatientPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JScrollPane createPatientPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Disposición vertical en caja

        // Datos de ejemplo para los pacientes
        String[][] patientData = {
                {"Mateo Ramírez", "1990-03-21", "07:00", "Consulta general"},
                {"Lucía Fernández", "1987-05-17", "07:30", "Chequeo de rutina"},
                {"David Ortega", "1996-06-12", "08:00", "Control de presión arterial"},
                {"Claudia Morales", "1993-08-07", "08:30", "Control de alergias"},
                {"Andrea Lucas", "1984-12-02", "09:00", "Chequeo"},
                {"Alejandra Vargas", "1991-11-15", "09:30", "Consulta de alergias"},
                {"Diego Gutiérrez", "1988-07-20", "10:00", "Control de colesterol"},
                {"Sara Jiménez", "1992-09-09", "10:30", "Chequeo de rutina"},
                {"Manuel Santos", "1994-10-22", "11:00", "Cita de seguimiento"},
                {"Elena Castro", "1986-03-11", "11:30", "Cita de seguimiento"},
                {"Rafael Díaz", "1995-01-29", "12:00", "Control de azúcar en sangre"},
                {"Isabel Navarro", "1990-12-05", "12:30", "Chequeo de rutina"},
                {"Pablo Andrade", "1989-06-23", "13:00", "Consulta de alergias"},
                {"Patricia Suárez", "1991-04-17", "13:30", "Control de hipertensión"},
                {"Esteban Ruiz", "1996-02-08", "14:00", "Cita de seguimiento"},
                {"Ana Gómez", "1987-10-18", "14:30", "Consulta general"},
                {"Oscar Martínez", "1993-03-19", "15:00", "Chequeo"},
                {"Jessica Molina", "1992-11-30", "15:30", "Consulta de alergias"},
                {"Roberto Vega", "1994-09-07", "16:00", "Control de diabetes"},
                {"Andrea Torres", "1988-02-14", "16:30", "Chequeo de rutina"}
        };

        // Agregar paneles para cada paciente
        for (String[] patient : patientData) {
            JPanel rowPanel = new JPanel();
            rowPanel.setLayout(new GridLayout(1, 4)); // Disposición en una fila con 4 columnas

            for (String field : patient) {
                JLabel label = new JLabel(field);
                label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                rowPanel.add(label);
            }

            panel.add(rowPanel);
        }

        // Añadir espacio en blanco para mejorar la presentación
        panel.add(Box.createVerticalStrut(10));

        JScrollPane scrollPane = new JScrollPane(panel);
        return scrollPane;
    }

    private JPanel componenteMenuLateral() {
        JPanel panelMenu = new JPanel();
        panelMenu.setPreferredSize(new Dimension(250, pantalla[1]));
        panelMenu.setBackground(new Color(35, 38, 40));

        // Cambiar a GridBagLayout para mejor control de espaciado y centrado
        panelMenu.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0); // Espaciado uniforme entre los botones
        gbc.anchor = GridBagConstraints.CENTER; // Alinea los botones en el centro

        // Crear botones y añadir espacio entre ellos
        String[] buttonLabels = {"Consultas diarias", "Salas", "Farmacia", "Pacientes registrados", "Citar en otra área"};
        for (String label : buttonLabels) {
            JButton button = crearUnBoton(label);
            panelMenu.add(button, gbc); // Añadir botón con constraints para centrado y espaciado
        }

        return panelMenu;
    }

    private JButton crearUnBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setPreferredSize(new Dimension(200, 50)); // Hacer botones más grandes
        boton.setBackground(new Color(70, 130, 180)); // Color base
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 16)); // Texto más grande
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.WHITE, 2),
                BorderFactory.createEmptyBorder(5, 15, 5, 15) // Aumentar padding interno
        ));

        // Añadir efecto de hover
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(100, 150, 220)); // Color más claro al pasar el mouse
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(70, 130, 180)); // Regresa al color original
            }
        });

        boton.addActionListener(e -> {
            System.out.println(texto);
        });

        return boton;
    }

    public static void main(String[] args) {
        HashMap<String, String> dummyData = new HashMap<>();
        dummyData.put("Nombre", "Fernanda Paz");
        dummyData.put("Especialidad", "Pediatría");
        new DoctorView(dummyData);
    }
}
