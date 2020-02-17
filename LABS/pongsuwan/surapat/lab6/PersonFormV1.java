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

    //Quick fix warning: Java(536871008)
    private static final long serialVersionUID = 1L;
    // -------------Components.-----------------
    protected JPanel panel2, radioPanel;
    protected JRadioButton student_radio, teacher_raio;
    protected ButtonGroup radioButton_group;
    protected JLabel name_label, height_label, weight_label, birth_label, type_label;
    protected JTextField name_textField, height_textField, weight_textField, birth_textField;
    //-----------------------------------------

    //A default constructor.
    PersonFormV1(String name) {
        super(name);
    }

    protected void initComponents() {
        super.initComponents();
        panel2 = new JPanel(new GridBagLayout());  //set panel2's Layout to "GridBagLayout".
        student_radio = new JRadioButton("Student");
        teacher_raio = new JRadioButton("Teacher");
        radioPanel = new JPanel();
        radioButton_group = new ButtonGroup();
        //--------Label components.-------------
        name_label = new JLabel("Name:");
        height_label = new JLabel("Height (cm.):");
        weight_label = new JLabel("Weigth (km.):");
        birth_label = new JLabel("Date of birth (eg., 31-01-1990):");
        type_label = new JLabel("Type:");
        //-----------Text Field components.------------
        name_textField = new JTextField(15);
        height_textField = new JTextField(15);
        weight_textField = new JTextField(15);
        birth_textField = new JTextField(15);
    }

    protected void addComponents() {
        this.initComponents();       
        super.addComponents();  //Set the Layout with super.addComponents().

        //-------Group up the radioButtons.---------
        radioButton_group.add(student_radio);
        radioButton_group.add(teacher_raio);
        //--------Add radioButton to panel.---------
        radioPanel.add(student_radio);
        radioPanel.add(teacher_raio);
        //--------------GridBag setting--------------
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(3, 3, 3, 3);
        //-----------Add Label to panel.-------------
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel2.add(name_label, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel2.add(height_label, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel2.add(weight_label, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel2.add(birth_label, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel2.add(type_label, gbc);
        ////-----------Add TextField to panel.-------------
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel2.add(name_textField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel2.add(height_textField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel2.add(weight_textField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel2.add(birth_textField, gbc);
        //------------------radio button--------------------
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel2.add(radioPanel, gbc);
        //--------------------------------------------------
        add(panel2, BorderLayout.NORTH);
    }

    public static void createAndShowGUI() {
        PersonFormV1 personFormV1 = new PersonFormV1("Person Form V1");
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