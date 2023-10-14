/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba1 {

    private JFrame frame;
    private JTextField textField;
    private JButton buscarButton;
    private JButton eliminarButton;
    private JButton editarButton;
    private JButton agregarButton;
    private DefaultListModel<String> listModel;
    private JList<String> jList;

    public Prueba1() {
        // Crear el JFrame
        frame = new JFrame("Mi Programa Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear el JPanel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear el JTextField
        textField = new JTextField(20);
        panel.add(textField, BorderLayout.NORTH);

        // Crear el JButton de búsqueda
        buscarButton = new JButton("Buscar");
        buscarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica de búsqueda
                String searchTerm = textField.getText();
                // Implementa la lógica de búsqueda aquí y actualiza la JList
            }
        });

        // Crear el JButton de eliminación
        eliminarButton = new JButton("Eliminar");
        eliminarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica de eliminación
                int selectedIndex = jList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                }
            }
        });

        // Crear el JButton de edición
        editarButton = new JButton("Editar");
        editarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica de edición
                int selectedIndex = jList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String newValue = textField.getText();
                    listModel.setElementAt(newValue, selectedIndex);
                }
            }
        });

        // Crear el JButton de agregación
        agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica de agregación
                String newValue = textField.getText();
                listModel.addElement(newValue);
            }
        });

        // Crear la JList
        listModel = new DefaultListModel<>();
        jList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(jList);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Crear el JPanel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buscarButton);
        buttonPanel.add(eliminarButton);
        buttonPanel.add(editarButton);
        buttonPanel.add(agregarButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Agregar el panel principal al JFrame
        frame.add(panel);

        // Mostrar el JFrame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Prueba1();
            }
        });
    }
}
