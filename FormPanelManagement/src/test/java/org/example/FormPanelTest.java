package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.*;

class FormPanelTest {

    @Test
    public void testFormPanelCreation() {
        FormPanel formPanel = new FormPanel();
        assertNotNull(formPanel);
        assertEquals(BoxLayout.class, formPanel.getLayout().getClass());
        assertEquals(7, formPanel.getComponentCount());
    }

    @Test
    public void SubmitButton() {
        FormPanel formPanel = new FormPanel();
        JTextField nameField = (JTextField) formPanel.getComponent(1);
        JTextField emailField = (JTextField) formPanel.getComponent(3);
        JTextField phoneField = (JTextField) formPanel.getComponent(5);
        JButton submitButton = (JButton) formPanel.getComponent(6);

        nameField.setText("Abdulle");
        emailField.setText("Abddulle1@gmail.com");
        phoneField.setText("123-456-7890");

        submitButton.doClick();

    }
    @Test
    public void ShowDetailsWindow() {
        String name = "Abdulle";
        String email = "Abdulle1@gmail.com";
        String phone = "123-456-7890";


    }


}