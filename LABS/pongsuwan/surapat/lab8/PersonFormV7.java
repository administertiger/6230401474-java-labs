/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 20, 2020
*/

package pongsuwan.surapat.lab8;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV7 extends PersonFormV6 {

    private static final long serialVersionUID = 1L;
    
    protected PersonFormV7(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        
        if (srcObject == student_radio) {
            JOptionPane.showMessageDialog(this, "Type : student has been selected", "Person Information", 1);
        } else if (srcObject == teacher_radio) {
            JOptionPane.showMessageDialog(this, "Type : teacher has been selected", "Person Information", 1);
        }
    }    

    protected void addListeners() {
        super.addListeners();
        student_radio.addActionListener(this);
        teacher_radio.addActionListener(this);
    }
    
    public static void createAndShowGUI() {
        PersonFormV7 personForm7 = new PersonFormV7("Person Form V7");
        personForm7.addComponents();
        personForm7.addListeners();
        personForm7.addMenus();
        personForm7.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}