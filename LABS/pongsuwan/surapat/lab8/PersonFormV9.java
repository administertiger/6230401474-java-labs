/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 20, 2020
*/

package pongsuwan.surapat.lab8;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PersonFormV9 extends PersonFormV8 implements ListSelectionListener {

    // Warnig alert.--------------------------------
    private static final long serialVersionUID = 1L;

    //-----------------Image icon.------------------
    protected ImageIcon reading_icon, travelling_icon, cooking_icon, photography_icon;

    protected PersonFormV9(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void addListeners() {
        super.addListeners();

        hobby_list.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub

        //---------------Setting icon.----------------
        reading_icon = new ImageIcon("images/book.png");
        travelling_icon = new ImageIcon("images/suitcases.png");
        cooking_icon = new ImageIcon("images/dish.png");
        photography_icon = new ImageIcon("images/camera.png");
        Image reading_image = reading_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image travelling_image = travelling_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image cooking_image = cooking_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image photogaphy_image = photography_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        reading_icon = new ImageIcon(reading_image);
        travelling_icon = new ImageIcon(travelling_image);
        cooking_icon = new ImageIcon(cooking_image);
        photography_icon = new ImageIcon(photogaphy_image);

        int hobby_selected[] = hobby_list.getSelectedIndices();
        for (int i : hobby_selected) {
            if (hobbies[i] == "Reading") {
                JOptionPane.showMessageDialog(this, "Selected Hobbies : " + hobbies[i], "Person Information", JOptionPane.INFORMATION_MESSAGE, reading_icon);
            } else if (hobbies[i] == "Tavelling") {
                JOptionPane.showMessageDialog(this, "Selected Hobbies : " + hobbies[i], "Person Information", JOptionPane.INFORMATION_MESSAGE, travelling_icon);
            } else if (hobbies[i] == "Cooking") {
                JOptionPane.showMessageDialog(this, "Selected Hobbies : " + hobbies[i], "Person Information", JOptionPane.INFORMATION_MESSAGE, cooking_icon);
            } else if (hobbies[i] == "Photogaphy") {
                JOptionPane.showMessageDialog(this, "Selected Hobbies : " + hobbies[i], "Person Information", JOptionPane.INFORMATION_MESSAGE, photography_icon);
            }
        }
    }

    public static void createAndShowGUI() {
        PersonFormV9 personForm9 = new PersonFormV9("Person Form V9");
        personForm9.addComponents();
        personForm9.addListeners();
        personForm9.addMenus();
        personForm9.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}