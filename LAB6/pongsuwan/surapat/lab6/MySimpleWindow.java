package pongsuwan.surapat.lab6;

/*
* This program is to create a class "MySimpleWindow" which extends from "JFrame".
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

    protected String fname;
    protected JButton okButton;
    protected JButton cancelButton;
    protected JPanel panel;
    protected JFrame frame;

    MySimpleWindow (String name) {
        this.fname = name;
    }

    protected void addComponents() {
        frame = new JFrame(fname);

        okButton = new JButton("OK♥");
        cancelButton = new JButton("Cancel");
        panel = new JPanel();

        panel.add(okButton);
        panel.add(cancelButton);

        frame.add(panel);


    }

    protected void setFrameFeatures() {
        
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
