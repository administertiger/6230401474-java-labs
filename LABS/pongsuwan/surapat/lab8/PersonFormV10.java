/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 20, 2020
*/

package pongsuwan.surapat.lab8;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Color;

import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;



public class PersonFormV10 extends PersonFormV9 {

    // --------------Warnig alert.-----------------
    private static final long serialVersionUID = 1L;

    protected PersonFormV10(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void setColor(Color color) {
        name_textField.setForeground(color);
        height_textField.setForeground(color);
        weight_textField.setForeground(color);
        birth_textField.setForeground(color);
        note_area.setForeground(color);
    }

    protected void setFontSize(int size) {
        Font font = new Font("Serif", Font.BOLD, size);
        name_textField.setFont(font);
        height_textField.setFont(font);
        weight_textField.setFont(font);
        birth_textField.setFont(font);
        note_area.setFont(font);
    }

    protected void addKeys() {
        //---------------Setting accelerator.---------------
        red_item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        green_item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        blue_item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        item_16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
        item_20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));
        item_24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.CTRL_MASK));

        //-----------------Setting mnemonic.-----------------
        red_item.setMnemonic(KeyEvent.VK_R);
        green_item.setMnemonic(KeyEvent.VK_G);
        blue_item.setMnemonic(KeyEvent.VK_B);
        item_16.setMnemonic(KeyEvent.VK_1);
        item_20.setMnemonic(KeyEvent.VK_0);
        item_24.setMnemonic(KeyEvent.VK_4);
        config_menu.setMnemonic(KeyEvent.VK_C);
        color_menu.setMnemonic(KeyEvent.VK_L);
        size_menu.setMnemonic(KeyEvent.VK_Z);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        //---------------Conditions.------------------
        //Text color.
        if (srcObject == red_item) {
            this.setColor(Color.RED);
        } else if (srcObject == green_item) {
            this.setColor(Color.GREEN);
        } else if (srcObject == blue_item) {
            this.setColor(Color.BLUE);
        } 

        //Font size.
        if (srcObject == item_16) {
            this.setFontSize(16);
        } else if (srcObject == item_20) {
            this.setFontSize(20);
        } else if (srcObject == item_24) {
            this.setFontSize(24);
        }
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        red_item.addActionListener(this);
        green_item.addActionListener(this);
        blue_item.addActionListener(this);
        item_16.addActionListener(this);
        item_20.addActionListener(this);
        item_24.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PersonFormV10 personForm10 = new PersonFormV10("Person Form V10");
        personForm10.addComponents();
        personForm10.addListeners();
        personForm10.addMenus();
        personForm10.addKeys();
        personForm10.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}