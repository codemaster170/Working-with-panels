package org.example;

import javax.swing.*;
import java.awt.*;

 public class FormPanel extends JPanel {
    public FormPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JTextField nameField = new JTextField(15);
        JTextField phoneField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();

            // Open a new window with details and save button
            showDetailsWindow(name, phone, email);
        });

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Phone:"));
        add(phoneField);
        add(submitButton);
    }

    private void showDetailsWindow(String name, String phone, String email) {
        JFrame detailsFrame = new JFrame("Details");
        detailsFrame.setSize(300, 200);
        detailsFrame.setLayout(new FlowLayout());

        JTextArea detailsArea = new JTextArea(5, 20);
        detailsArea.setText("Name: " + name + "\nEmail: " + email + "\nPhone: " + phone);
        detailsArea.setEditable(false);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {
            System.out.println("Saved Details:");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
        });

        detailsFrame.add(detailsArea);
        detailsFrame.add(saveButton);
        detailsFrame.setVisible(true);
    }
}
