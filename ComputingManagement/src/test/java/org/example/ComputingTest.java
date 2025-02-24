package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
class ComputingTest {
    @Test
    public void Computing() {
        Computing computing = new Computing();
        assertNotNull(computing);
        assertEquals(BoxLayout.class, computing.getLayout().getClass());
        assertEquals(8, computing.getComponentCount());
    }

    @Test
    public void ComputeResults() {
        Computing computing = new Computing();
        JTextField num1Field = (JTextField) computing.getComponent(1);
        JComboBox<String> operationBox = (JComboBox<String>) computing.getComponent(2);
        JTextField num2Field = (JTextField) computing.getComponent(4);
        JButton computeButton = (JButton) computing.getComponent(5);
        JLabel resultLabel = (JLabel) computing.getComponent(6);

        num1Field.setText("10");
        operationBox.setSelectedItem("-");
        num2Field.setText("5");

        computeButton.doClick();

        assertEquals("Result: 5.0", resultLabel.getText());

        num1Field.setText("10");
        operationBox.setSelectedItem("+");
        num2Field.setText("5");

        computeButton.doClick();

        assertEquals("Result: 15.0", resultLabel.getText());

        JButton incrementButton=(JButton) computing.getComponent(7);
        incrementButton.doClick();
        assertEquals("Result: 16.0", resultLabel.getText());

        num1Field.setText("10");
        operationBox.setSelectedItem("*");
        num2Field.setText("5");

        computeButton.doClick();

        assertEquals("Result: 50.0", resultLabel.getText());

        num1Field.setText("10");
        operationBox.setSelectedItem("/");
        num2Field.setText("ABC");

        computeButton.doClick();

        assertEquals("Error: Invalid input", resultLabel.getText());

    }

}