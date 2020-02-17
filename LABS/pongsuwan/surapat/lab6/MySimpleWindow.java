package pongsuwan.surapat.lab6;

/*
* This program is to create a class "MySimpleWindow" which extends "JFrame".
*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : January 20, 2020
*/

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {

    //Quick fix warning: Java(536871008)
    private static final long serialVersionUID = 1L;
    // -------------Components.-----------------
   protected JPanel panel;  
   protected JButton okButton , cancelButton;
   protected GridBagConstraints gbc;
    //-----------------------------------------

   //A default constructor.
   protected MySimpleWindow(String name) {
    setTitle(name);
}
    //A mehtod for initialize components.
    protected void initComponents() {
        
       panel = new JPanel(new GridBagLayout());  //A GridBagLayout panel for buttons. 
       okButton = new JButton("OK♥");
       cancelButton = new JButton("Cancel");
       gbc = new GridBagConstraints();
    }

   protected void addComponents() {
    
       this.initComponents();  //initialized components.
       setLayout(new BorderLayout());  //set frame to BorderLayout.
       gbc.insets = new Insets(7, 7, 7, 7);
       //---------Add buttons to panel.--------
       gbc.gridx = 0;
       gbc.gridy = 1;
       panel.add(cancelButton, gbc);
       gbc.gridx = 1;
       gbc.gridy = 1;
       panel.add(okButton, gbc);
       //--------------------------------------
       add(panel, BorderLayout.SOUTH);
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
