package org.example;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    public InfoPanel() {
        setLayout(new BorderLayout());

        // Title label
        JLabel titleLabel = new JLabel("Understanding Java Swing Tabbed Panes", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        titleLabel.setForeground(new Color(0, 102, 204)); // Blue color

        // Info area with rich text formatting
        JTextPane infoArea = new JTextPane();
        infoArea.setContentType("text/html");
        infoArea.setText("<html><body style='font-family: Arial; font-size: 14px; padding: 10px;'>"
                + "<p><b>What is a Tabbed Pane?</b></p>"
                + "<p>In Java Swing, <b>JTabbedPane</b> is a component that allows users to switch between different views or sections within a single window.</p>"
                + "<p>Tabbed panes improve user experience by organizing content into separate sections, just like tabs in a web browser.</p>"
                + "<p><b>Key Features:</b></p>"
                + "<ul>"
                + "<li>Allows switching between multiple panels</li>"
                + "<li>Supports icons, tooltips, and scrollable tabs</li>"
                + "<li>Can be positioned at the top, bottom, left, or right</li>"
                + "</ul>"
                + "<p><b>Example Usage:</b></p>"
                + "<pre style='background-color: #f4f4f4; padding: 5px;'>"
                + "JTabbedPane tabbedPane = new JTabbedPane();<br>"
                + "tabbedPane.addTab(\"Home\", new HomePanel());<br>"
                + "tabbedPane.addTab(\"Settings\", new SettingsPanel());"
                + "</pre>"
                + "<p>By using tabbed panes, we can create a cleaner and more organized UI.</p>"
                + "</body></html>");
        infoArea.setEditable(false);

        // Scroll pane to allow scrolling if needed
        JScrollPane scrollPane = new JScrollPane(infoArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Adding components to the panel
        add(titleLabel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
}
