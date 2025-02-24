package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
public class ButtonPanelTest {
    @Test
    public void ButtonPanel() {
        ButtonPanel buttonPanel = new ButtonPanel();
        assertNotNull(buttonPanel);

        assertEquals(BoxLayout.class, buttonPanel.getLayout().getClass());

        JButton exitButton = (JButton) buttonPanel.getComponent(1);
        assertNotNull(exitButton.getActionListeners());
        assertEquals(1, exitButton.getActionListeners().length);

        JButton viewButton = (JButton) buttonPanel.getComponent(0);
        assertNotNull(viewButton.getActionListeners());
        assertEquals(1, viewButton.getActionListeners().length);

    }
    @Test
    public void ShowMessage() {
        ButtonPanel buttonPanel = new ButtonPanel();
        JLabel messageLabel = (JLabel) buttonPanel.getComponent(2);
        assertEquals("", messageLabel.getText());

        JButton viewButton = (JButton) buttonPanel.getComponent(0);
        viewButton.doClick();

        assertEquals("<html><center><b><font size='6'>" +
                "Welcome to the world of programming!<br>" +
                "Here, we learn, evolve, and improve every day." +
                "</font></b></center></html>", messageLabel.getText());
    }

}