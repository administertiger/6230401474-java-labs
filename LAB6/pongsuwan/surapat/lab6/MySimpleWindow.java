package pongsuwan.surapat.lab6;

/*
* This program is to create a class "MySimpleWindow" which extends "JFrame".
*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : January 20, 2020
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class MySimpleWindow extends JFrame {

   protected JPanel panel;  
   protected JButton okButton;
   protected JButton cancelButton;

   //A default constructor.
   MySimpleWindow(String name) {
    setTitle(name);
}

   protected void addComponents() {
       panel = new JPanel();
       okButton = new JButton("OK♥");
       cancelButton = new JButton("Cancel");
       panel.add(cancelButton);
       panel.add(okButton);
       add(panel);
   }

   protected void setFrameFeatures() {
       setLocationRelativeTo(null);
       pack();
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }


    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}
