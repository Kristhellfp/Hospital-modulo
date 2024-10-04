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
        headerPanel.setBackground(new Color(33, 47, 61)); // Fondo azul oscuro
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(new Color(255, 255, 255)); // Texto blanco
        hospitalLabel.setFont(new Font("Sans-Serif", Font.BOLD, 18)); // Tipo de letra cambiado
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setBackground(new Color(33, 47, 61)); // Mismo fondo oscuro que el header
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(50, 50));
        logoPanel.setBackground(Color.ORANGE); // Puedes ajustar este color según tu diseño
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        userPanel.add(logoPanel, gbc);

        JLabel nombreDoctor = new JLabel(doctorData.get("Nombre"));
        nombreDoctor.setForeground(new Color(255, 255, 255)); // Texto blanco
        nombreDoctor.setFont(new Font("Sans-Serif", Font.BOLD, 16));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        userPanel.add(nombreDoctor, gbc);

        JLabel especialidadDoctor = new JLabel(doctorData.get("Especialidad"));
        especialidadDoctor.setForeground(new Color(192, 192, 192)); // Texto gris claro
        especialidadDoctor.setFont(new Font("Sans-Serif", Font.PLAIN, 14));
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
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Disposición vertical

        // No se incluye ningún dato predefinido
        // Puedes cargar los datos de los pacientes dinámicamente según tus necesidades.

        JScrollPane scrollPane = new JScrollPane(panel);
        return scrollPane;
    }

    private JPanel componenteMenuLateral() {
        JPanel panelMenu = new JPanel();
        panelMenu.setPreferredSize(new Dimension(250, pantalla[1]));
        panelMenu.setBackground(new Color(44, 62, 80)); // Fondo azul grisáceo oscuro

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
        boton.setBackground(new Color(52, 152, 219)); // Color azul claro
        boton.setForeground(Color.WHITE); // Texto blanco
        boton.setFont(new Font("Sans-Serif", Font.BOLD, 16)); // Texto en Sans-Serif
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.WHITE, 2),
                BorderFactory.createEmptyBorder(5, 15, 5, 15) // Aumentar padding interno
        ));

        // Añadir efecto de hover
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(41, 128, 185)); // Azul más oscuro al pasar el mouse
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(52, 152, 219)); // Regresa al color original
            }
        });

        boton.addActionListener(e -> {
            System.out.println(texto);
        });

        return boton;
    }

    public static void main(String[] args) {
        HashMap<String, String> dummyData = new HashMap<>();
        dummyData.put("Nombre", ""); // Sin datos precargados
        dummyData.put("Especialidad", ""); // Sin datos precargados
        new DoctorView(dummyData);
    }
}

