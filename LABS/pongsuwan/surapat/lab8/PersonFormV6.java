/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 17, 2020
*/

package pongsuwan.surapat.lab8;

import pongsuwan.surapat.lab6.*;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV6 extends PersonFormV5 implements ActionListener {
    //Warnig alert.--------------------------------
    private static final long serialVersionUID = 1L;
    //----------------------------------------------
  
    //Constructors.
    protected Object srcObject;  //Source object.
    protected ImageIcon dialog_icon;  //Image icon.

    protected PersonFormV6(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        srcObject = e.getSource();

        //-----------------Selected hobbies.--------------------
        String hobby = "";  
        int hobby_selected[] = hobby_list.getSelectedIndices();
        for (int i : hobby_selected) {
            hobby += PersonFormV6.hobbies[i] + " ";
        }

        //-------------------Selected type.-----------------------
        String type = "";  
        if (student_radio.isSelected()) {
            type = "Student";
        } else if (teacher_radio.isSelected()) {
            type = "Teacher";
        }

        //---------------------Getting icon.-------------------------
        dialog_icon = new ImageIcon("images/message_dialog.png");
        Image dialog_image = dialog_icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        dialog_icon = new ImageIcon(dialog_image);
        
        //----------------------Conditions.---------------------------
        if (srcObject.equals(okButton)) {
            JOptionPane.showMessageDialog(this, "Name : " + name_textField.getText() +
            "\n" + "Height (cm.): " + height_textField.getText() +
            "\n" + "Weigth (km.) : " + weight_textField.getText() +
            "\n" + "Date of birth : " + birth_textField.getText() + 
            "\n" + "Type : " + type + 
            "\n" + "Sport : " + sport_box.getSelectedItem() + 
            "\n" + "Hobbies : " + hobby + 
            "\n" + "Note : " + note_area.getText(), "Person Information",JOptionPane.INFORMATION_MESSAGE , dialog_icon);
        } else if (srcObject == cancelButton) {
            this.setText();
        }
    }
    
    protected void setText() {
        name_textField.setText("");
        height_textField.setText("");
        weight_textField.setText("");
        birth_textField.setText("");
        note_area.setText("");
    }

    protected void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    
    
    public static void createAndShowGUI() {
        PersonFormV6 personForm6 = new PersonFormV6("Person Form V6");
        personForm6.addComponents();
        personForm6.addListeners();
        personForm6.addMenus();
        personForm6.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
    
}