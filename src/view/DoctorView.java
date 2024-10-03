package src.view;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {

    public DoctorView(String nombre, String especialidad) {
        setTitle("Perfil del Doctor");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configuración de los paneles
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(new Color(105, 105, 105));  // Color del encabezado

        JLabel hospitalLabel = new JLabel("Hospital", SwingConstants.LEFT);
        hospitalLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
        hospitalLabel.setForeground(Color.WHITE);

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new BorderLayout());

        JLabel nameLabel = new JLabel(nombre);
        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        nameLabel.setForeground(Color.BLACK);

        JLabel specialtyLabel = new JLabel(especialidad);
        specialtyLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        specialtyLabel.setForeground(Color.GRAY);

        // Añadir etiquetas al panel de nombre
        namePanel.add(nameLabel, BorderLayout.NORTH);
        namePanel.add(specialtyLabel, BorderLayout.SOUTH);

        // Panel derecho (puedes añadir más detalles si es necesario)
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBackground(Color.YELLOW);  // Color de fondo (ajústalo según lo necesites)

        // Añadir los elementos al panel derecho
        rightPanel.add(namePanel, BorderLayout.CENTER);

        // Añadir el encabezado al panel principal
        headerPanel.add(hospitalLabel, BorderLayout.WEST);
        headerPanel.add(rightPanel, BorderLayout.EAST);

        // Añadir headerPanel al marco
        add(headerPanel, BorderLayout.NORTH);

        // Panel vacío en el centro (espacio en blanco)
        JPanel emptyPanel = new JPanel();
        emptyPanel.setBackground(Color.WHITE);
        add(emptyPanel, BorderLayout.CENTER);

        // Mostrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de DoctorView con un ejemplo de nombre y especialidad
        new DoctorView("Fernanda Paz", "Doctora General");
    }
}
