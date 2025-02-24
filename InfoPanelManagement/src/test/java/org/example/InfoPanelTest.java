package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class InfoPanelTest {

    @BeforeAll
    public static void setUp() {
        // Enable headless mode for tests
        System.setProperty("java.awt.headless", "true");
    }

    @Test
    public void InfoPanel() {
        InfoPanel infoPanel = new InfoPanel();
        assertNotNull(infoPanel);
        assertEquals(BorderLayout.class, infoPanel.getLayout().getClass());
    }

    @Test
    void frame() {
        InfoPanel infoPanel = new InfoPanel();
        JFrame frame = new JFrame();
        infoPanel = new InfoPanel();
        frame.add(infoPanel);
        frame.setSize(400, 300);
        frame.setVisible(true);

        assertEquals(infoPanel, frame.getContentPane().getComponent(0));
    }

    @Test
    public void testTitleLabel() {
        InfoPanel infoPanel = new InfoPanel();
        JLabel titleLabel = (JLabel) infoPanel.getComponent(0);
        assertNotNull(titleLabel);
        assertEquals("Understanding Java Swing Tabbed Panes", titleLabel.getText());
        assertEquals(Font.BOLD, titleLabel.getFont().getStyle());
        assertEquals(20, titleLabel.getFont().getSize());
    }

    @Test
    public void testInfoArea() {
        InfoPanel infoPanel = new InfoPanel();
        JScrollPane scrollPane = (JScrollPane) infoPanel.getComponent(1);
        JTextPane infoArea = (JTextPane) scrollPane.getViewport().getView();
        assertNotNull(infoArea);
        assertEquals("text/html", infoArea.getContentType());
        assertFalse(infoArea.isEditable());
    }
}




