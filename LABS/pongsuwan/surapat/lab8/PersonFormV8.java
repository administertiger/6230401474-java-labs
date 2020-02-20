/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 20, 2020
*/

package pongsuwan.surapat.lab8;

import java.awt.event.ActionEvent;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV8 extends PersonFormV7 {
    //Warnig alert.--------------------------------
    private static final long serialVersionUID = 1L;
    
    //-----------------Image icon.-----------------
    protected ImageIcon running_icon, swimming_icon, tennis_icon;

    protected PersonFormV8(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        //---------------Getting icons.-----------------
        running_icon = new ImageIcon("images/runner4.png");
        swimming_icon = new ImageIcon("images/swimmer.png");
        tennis_icon = new ImageIcon("images/tennisracket.png");
        Image running_image = running_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image swimming_image = swimming_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image tennis_image = tennis_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        running_icon = new ImageIcon(running_image);
        swimming_icon = new ImageIcon(swimming_image);
        tennis_icon = new ImageIcon(tennis_image);

        //-----------------Condition.-------------------
        if (srcObject == sport_box) {
            if (sport_box.getSelectedItem() == "Running") {
                JOptionPane.showMessageDialog(this, "Your sport is now change to " + sport_box.getSelectedItem(),"Person Information" , JOptionPane.INFORMATION_MESSAGE, running_icon);
            } else if (sport_box.getSelectedItem() == "Swimming") {
                JOptionPane.showMessageDialog(this, "Your sport is now change to " + sport_box.getSelectedItem(),"Person Information" , JOptionPane.INFORMATION_MESSAGE, swimming_icon);
            } else if (sport_box.getSelectedItem() == "Tennis") {
                JOptionPane.showMessageDialog(this, "Your sport is now change to " + sport_box.getSelectedItem(),"Person Information" , JOptionPane.INFORMATION_MESSAGE, tennis_icon);
            }
        }
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        sport_box.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PersonFormV8 personForm8 = new PersonFormV8("Person Form V8");
        personForm8.addComponents();
        personForm8.addListeners();
        personForm8.addMenus();
        personForm8.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}