package src.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Arrays;

public class SalaView extends JFrame {

    public SalaView() {
        setTitle("Gestión de Salas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSalas = new JPanel(new GridLayout(3, 4, 10, 10)); // 3 filas, 4 columnas, 10px de margen
        cargarSalas(panelSalas);

        add(panelSalas);
    }

    private void cargarSalas(JPanel panel) {
        List<String> nombresSalas = Arrays.asList(
                "Sala de Traumatología", "Unidad de Cuidados Críticos", "Sala de Neonatología Avanzada",
                "Sala de Atención Materno-Infantil", "Quirófano de Especialidades", "Sala de Recuperación Anestésica",
                "Sala de Diagnóstico Radiológico", "Sala de Infusión y Quimioterapia", "Sala de Pediatría Integral",
                "Sala de Cardiología y Electrofisiología", "Sala de Espera de Emergencias", "Sala de Monitoreo Postoperatorio"
        );

        List<String> estadosSalas = Arrays.asList(
                "En uso", "Disponible", "Fuera de servicio temporalmente",
                "Ocupada", "Accesible", "No disponible",
                "Ocupada", "Libre para asignación", "En uso",
                "Temporalmente no disponible", "Listo para pacientes", "Ocupada actualmente"
        );

        for (int i = 0; i < nombresSalas.size(); i++) {
            JPanel salaPanel = crearSalaPanel(nombresSalas.get(i), estadosSalas.get(i));
            panel.add(salaPanel);
        }
    }

    public JPanel crearSalaPanel(String nombre, String estado) {
        JPanel panel = new JPanel();
        JLabel nombreLabel = new JLabel(nombre);

        // Colores pastel
        switch (estado) {
            case "En uso":
            case "Ocupada":
                panel.setBackground(new Color(255, 182, 193)); // Rosa pastel
                break;
            case "Fuera de servicio temporalmente":
            case "No disponible":
                panel.setBackground(new Color(211, 211, 211)); // Gris claro
                break;
            case "Disponible":
            case "Accesible":
            case "Libre para asignación":
            case "Listo para pacientes":
                panel.setBackground(new Color(173, 255, 47)); // Verde pastel
                break;
            default:
                panel.setBackground(Color.WHITE);
                break;
        }

        panel.add(nombreLabel);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Añade un borde para separar visualmente las salas
        panel.setPreferredSize(new Dimension(150, 50));  // Ajusta el tamaño del panel
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SalaView salasView = new SalaView();
            salasView.setVisible(true);
        });
    }
}
