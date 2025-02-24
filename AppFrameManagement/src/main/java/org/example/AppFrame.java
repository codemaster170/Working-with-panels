package org.example;

import javax.swing.*;

public class AppFrame extends JFrame {

    public AppFrame() {


        //------Creating and Setting up the Application main Frame----------------
        setTitle("TABBED APPLICATION");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setVisible(true);

        //------Creating The Application "Tabbed pane" container for tabs-------------
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Form", new FormPanel());
        tabbedPane.addTab("List/Table", new ListPanel());
        tabbedPane.addTab("Buttons", new ButtonPanel());
        tabbedPane.addTab("Information", new InfoPanel());
        tabbedPane.addTab("Computing", new Computing());

        //----------Adding "Tabbed pane" to the Frame------------
        add(tabbedPane);

    }

    public static void main(String[] Args) {

        SwingUtilities.invokeLater(() -> new AppFrame().setVisible(true));
    }
}


