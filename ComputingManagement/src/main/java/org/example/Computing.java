package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Computing extends JPanel {
    private double result = 0; // Stores the computed result
    private final JLabel resultLabel;
    final JTextField num1Field;
    private final JTextField num2Field;
    private final JComboBox<String> operationBox;

    public Computing() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Input fields and operator selection
        num1Field = new JTextField(5);
        num2Field = new JTextField(5);
        operationBox = new JComboBox<>(new String[]{"+", "-", "*", "/"});

        // Buttons
        JButton computeButton = new JButton("Compute");
        JButton incrementButton = new JButton("Increment");

        // Result label
         resultLabel = new JLabel("Result: 0");

        // Compute button action
        computeButton.addActionListener(e -> computeResult());

        // Increment button action
        incrementButton.addActionListener(e -> {
            result++; // Increase the computed result
            resultLabel.setText("Result: " + result);
        });

        // Layout
        add(new JLabel("Number 1:"));
        add(num1Field);
        add(operationBox);
        add(new JLabel("Number 2:"));
        add(num2Field);
        add(computeButton);
        add(resultLabel);
        add(incrementButton);
    }

    public void computeResult() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            String operation = (String) operationBox.getSelectedItem();

            switch (operation) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        resultLabel.setText("Error: Division by zero");
                        return;
                    }
                    result = num1 / num2;
                }
            }
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Error: Invalid input");
        }
    }
}
