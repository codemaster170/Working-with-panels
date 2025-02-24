package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class AppFrameTest {


    @Test
    public void AppFrame() {
      AppFrame  appFrame = new AppFrame();
        assertNotNull(appFrame);
        assertEquals("TABBED APPLICATION", appFrame.getTitle());
        assertEquals(600, appFrame.getWidth());
        assertEquals(500, appFrame.getHeight());
      assertTrue(appFrame.isVisible());

    }
    @Test
  public void Integration(){
      AppFrame appFrame = new AppFrame();
      JTabbedPane tabbedPane = (JTabbedPane) appFrame.getContentPane().getComponent(0);
      assertNotNull(tabbedPane);
      assertEquals(5, tabbedPane.getTabCount());

      assertEquals("Form", tabbedPane.getTitleAt(0));
      assertEquals("List/Table", tabbedPane.getTitleAt(1));
      assertEquals("Buttons", tabbedPane.getTitleAt(2));
      assertEquals("Information", tabbedPane.getTitleAt(3));
      assertEquals("Computing", tabbedPane.getTitleAt(4));

      assertTrue(tabbedPane.getComponentAt(0) instanceof FormPanel);
      assertTrue(tabbedPane.getComponentAt(1) instanceof ListPanel);
      assertTrue(tabbedPane.getComponentAt(2) instanceof ButtonPanel);
      assertTrue(tabbedPane.getComponentAt(3) instanceof InfoPanel);
      assertTrue(tabbedPane.getComponentAt(4) instanceof Computing);

    }

}