package pongsuwan.surapat.lab6;

/*
* This program is to create a class "PersonFormV1" which extends "MySimpleWindow".
*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 3, 2020
*/

import java.awt.*;
import javax.swing.*;

public class PersonFormV1 extends MySimpleWindow {

    //radioButton variable.
    JRadioButton student = new JRadioButton("Student");
    JRadioButton teacher = new JRadioButton("Teacher");

    //Panel to group up the radioButtons.
    JPanel radioPanel = new JPanel();

    //radioButton group to make it check just 1 button.
    ButtonGroup group = new ButtonGroup();
    
    //A default constructor.
    PersonFormV1(String name) {
        super(name);
    }

    protected void addComponents() {
        //Add radioButton to panel.
        radioPanel.add(student);
        radioPanel.add(teacher);

        //Group up the radioButtons.
        group.add(student);
        group.add(teacher);
        
        setLayout(new BorderLayout());  //set frame's Layout to "BorderLayout".
        panel = new JPanel(new GridLayout(5,2));  //set panel's Layout to "GridLayout".
        //add things to this panel.
        panel.add(new JLabel("Name:"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("Height (cm.):"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("Weigth (km.):"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("Date of birth (eg., 31-01-1990):"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("Type:"));
        panel.add(radioPanel);

        //add that panel to frame in NORTH.
        super.add(panel, BorderLayout.NORTH);

        super.addComponents();
    }

    public static void createAndShowGUI() {
        PersonFormV1 personFormV1 = new PersonFormV1("Person Fom V1");
        personFormV1.addComponents();
        personFormV1.setFrameFeatures();
    }


    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}