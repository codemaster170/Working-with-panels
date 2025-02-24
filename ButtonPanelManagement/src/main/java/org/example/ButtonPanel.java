package org.example;

import javax.swing.*;

 public class ButtonPanel extends JPanel {
    private final JLabel messageLabel; // Label to display the message

    public ButtonPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton viewButton = new JButton("View");
        JButton exitButton = new JButton("Exit");

        // Message label (Initially empty)
        messageLabel = new JLabel("");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        viewButton.addActionListener(e -> showMessage());
        exitButton.addActionListener(e -> System.exit(0));

        add(viewButton);
        add(exitButton);
        add(messageLabel); // Add message label to the panel
    }

    private void showMessage() {
        messageLabel.setText("<html><center><b><font size='6'>"
                + "Welcome to the world of programming!<br>"
                + "Here, we learn, evolve, and improve every day."
                + "</font></b></center></html>");
    }
}
