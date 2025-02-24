package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
public class ListPanelTest {
    @Test
    public void ListPanel() {
        ListPanel listPanel = new ListPanel();
        assertNotNull(listPanel);
        assertEquals(BorderLayout.class, listPanel.getLayout().getClass());

    }

    @Test
    public void testAddRow() {
    ListPanel listPanel = new ListPanel();

        Component[] components = listPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                if (textField.getName().equals("nameField")) {
                    JTextField nameField = textField;
                } else if (textField.getName().equals("ageField")) {
                    JTextField ageField = textField;
                }
            } else if (component instanceof JButton) {
                JButton button = (JButton) component;
                if (button.getText().equals("Add Row")) {
                    JButton addButton = button;
                }
            }
        }
    }
    
}