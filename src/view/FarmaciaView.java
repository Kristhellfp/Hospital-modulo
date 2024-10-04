package src.view;

import src.model.Medicina;
import src.services.DataFarmacia;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class FarmaciaView {

    public static JPanel panelPaciente(ArrayList<Medicina> medicinas){

        // Crear panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20)); // Añadir márgenes al panel
        panelPrincipal.setBackground(Color.WHITE);

        // Título de la tabla
        JLabel titulo = new JLabel("Lista de Medicinas Disponibles", SwingConstants.CENTER);
        titulo.setFont(new Font("SansSerif", Font.BOLD, 28));
        titulo.setForeground(new Color(0, 102, 204)); // Color azul para el título
        titulo.setBorder(new EmptyBorder(10, 0, 20, 0)); // Espacio entre el título y la tabla

        // Crear modelo de tabla con columnas y sin datos por defecto
        String[] columnas = {"Nombre", "Medicina", "Dosis", "Precio"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Llenar la tabla con la lista de medicinas
        for (Medicina medicina : medicinas) {
            String[] fila = {medicina.getNombre(), medicina.getFormaFarmaceutica(), medicina.getDosis(), String.valueOf(medicina.getPrecio())};
            modelo.addRow(fila);
        }

        // Crear la tabla
        JTable tabla = new JTable(modelo);
        tabla.setFont(new Font("SansSerif", Font.PLAIN, 16));
        tabla.setRowHeight(30); // Altura de las filas
        tabla.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 18)); // Estilo de encabezado
        tabla.getTableHeader().setBackground(new Color(0, 102, 204)); // Color de fondo de encabezado
        tabla.getTableHeader().setForeground(Color.WHITE); // Texto blanco en el encabezado
        tabla.setGridColor(new Color(224, 224, 224)); // Color de las líneas de la tabla
        tabla.setFillsViewportHeight(true); // Llenar todo el espacio disponible

        // Alineación centrada para los datos de la tabla
        DefaultTableCellRenderer centeredRenderer = new DefaultTableCellRenderer();
        centeredRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centeredRenderer);
        }

        // Scroll para la tabla en caso de que sea grande
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(500, 600)); // Tamaño del área de la tabla

        // Agregar el título y la tabla al panel principal
        panelPrincipal.add(titulo, BorderLayout.NORTH);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);

        return panelPrincipal;
    }

    // Método main para ejecutar la vista
    public static void main(String[] args) {
        JFrame frame = new JFrame("Farmacia - Lista de Medicinas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700); // Tamaño de la ventana

        // Obtener la lista de medicinas y crear el panel
        ArrayList<Medicina> listaMedicinas = DataFarmacia.listaMedicinas();
        JPanel panel = panelPaciente(listaMedicinas);

        // Añadir el panel al frame y hacerlo visible
        frame.add(panel);
        frame.setVisible(true);
    }
}

