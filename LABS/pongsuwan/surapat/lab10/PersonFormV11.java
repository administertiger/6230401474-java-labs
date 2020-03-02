/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 2, 2020
*/

package pongsuwan.surapat.lab10;
import java.awt.event.*;
import java.io.File;
import java.awt.Color;


import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


import pongsuwan.surapat.lab8.*;

public class PersonFormV11 extends PersonFormV10 {

    private static final long serialVersionUID = 1L;

    //Variable.
    protected JMenuItem custom_item;
    protected JFileChooser file_chooser;

    protected PersonFormV11(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        custom_item = new JMenuItem("Custom");
        file_chooser = new JFileChooser();
    }

    protected void addMenus() {
        super.addMenus();
        color_menu.add(custom_item);
    }

    //Rearrage by add "addMenus" to addComponents.
    protected void addComponents() {
        super.addComponents();
        addMenus();
    }
    
    //-----------------ActionListener.-----------------
    protected void addListeners() {
        super.addListeners();
        custom_item.addActionListener(this);
        open_item.addActionListener(this);
        save_item.addActionListener(this);
        exit_item.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object sObject = e.getSource();

        //Color chooser.
        if (sObject == custom_item) {
            Color color = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
            
            name_textField.setForeground(color);
            height_textField.setForeground(color);
            weight_textField.setForeground(color);
            birth_textField.setForeground(color);
            note_area.setForeground(color);
        } 

        //File chooser.
        if (sObject == open_item) {
            int returnVal = file_chooser.showOpenDialog(PersonFormV11.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = file_chooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Opening file " + file.getName(), "Message", JOptionPane.INFORMATION_MESSAGE);
            } else if (returnVal == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Open command cancelled by user.", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        //Svae item.
        if (sObject == save_item) {
            int returnVal = file_chooser.showSaveDialog(PersonFormV11.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = file_chooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Saving file " + file.getName(), "Message", JOptionPane.INFORMATION_MESSAGE);
            } else if (returnVal == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Open command cancelled by user.", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        //Exit program.
        if (sObject == exit_item) {
            System.exit(0);
        }
    }

    //------------------------------------------------
    public static void createAndShowGUI() {
        PersonFormV11 personForm11 = new PersonFormV11("Person Form V11");
        personForm11.addComponents();
        personForm11.addListeners();
        personForm11.addKeys();
        personForm11.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}