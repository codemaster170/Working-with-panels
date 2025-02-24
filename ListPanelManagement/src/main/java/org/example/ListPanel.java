package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

  public class ListPanel extends JPanel {
    private int idCounter = 1; // Auto-incrementing ID
    private final JTextField nameField;
    private final JTextField ageField;
    private final JLabel messageLabel;
    private final DefaultTableModel model;

    public ListPanel() {
        setLayout(new BorderLayout());

        // Table setup
        String[] columnNames = {"ID", "Name", "Age"};
        model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Panel for buttons & input fields
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 2, 5, 5));

        nameField = new JTextField();
        ageField = new JTextField();
        JButton addButton = new JButton("Add Row");
        JButton clearButton = new JButton("Clear Table");

        // Message label (Initially empty)
        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        addButton.addActionListener(e -> addRow());
        clearButton.addActionListener(e -> {
            model.setRowCount(0);
            idCounter = 1; // Reset ID counter
            messageLabel.setText(""); // Clear any message
        });

        // Adding input fields and buttons to control panel
        controlPanel.add(new JLabel("Name:"));
        controlPanel.add(nameField);
        controlPanel.add(new JLabel("Age:"));
        controlPanel.add(ageField);
        controlPanel.add(addButton);
        controlPanel.add(clearButton);

        // Adding components to the main panel
        add(scrollPane, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(messageLabel, BorderLayout.NORTH); // Message appears at the top
    }

    public void addRow() {
        String name = nameField.getText();
        String ageText = ageField.getText();

        // Validate input
        if (name.isEmpty() || ageText.isEmpty()) {
            messageLabel.setText("Please enter both Name and Age.");
            messageLabel.setForeground(Color.RED);
            return;
        }

        try {
            int age = Integer.parseInt(ageText);
            model.addRow(new Object[]{idCounter++, name, age});
            messageLabel.setText("Row added successfully!");
            messageLabel.setForeground(new Color(0, 128, 0)); // Green color for success

            // Clear input fields after adding a row
            nameField.setText("");
            ageField.setText("");
        } catch (NumberFormatException e) {
            messageLabel.setText("Age must be a valid number.");
            messageLabel.setForeground(Color.RED);
        }
    }
}
