package pongsuwan.surapat.lab6;

import java.awt.*;
import javax.swing.*;

public class PersonFormV4 extends PersonFormV3 {

    //Quick fix warning: Java(536871008)
    private static final long serialVersionUID = 1L;
    //--------Color sub menus.--------------------
    protected JMenu color_menu;
    protected JMenuItem red_item, green_item, blue_item;
    //--------Size sub menus.--------------------
    protected JMenu size_menu;
    protected JMenuItem item_16, item_20, item_24;
    //----------ImageIcon constructor.-----------
    protected ImageIcon icon;

    PersonFormV4(String name) {
        super(name);
    } 

    protected void initComponents() {
        super.initComponents();
        //--------------Menus.---------------
        color_menu = new JMenu("Color");
        size_menu = new JMenu("Size");
        //------------Menus items.-----------
        red_item = new JMenuItem("Red");
        green_item = new JMenuItem("Green");
        blue_item = new JMenuItem("Blue");
        item_16 = new JMenuItem("16");
        item_20 = new JMenuItem("20");
        item_24 = new JMenuItem("24");
    }
     
    protected void addSubMenus() {
        this.initComponents();
        super.addMenus();
        //-------Remove Config_menu's items.---------
        config_menu.remove(color_item);
        config_menu.remove(size_item);
        //-------Add item to sub menus.---------------
        color_menu.add(red_item);
        color_menu.add(green_item);
        color_menu.add(blue_item);
        size_menu.add(item_16);
        size_menu.add(item_20);
        size_menu.add(item_24);
        //-------Add new sub menus.-------------------
        config_menu.add(color_menu);
        config_menu.add(size_menu);
    }
    
    protected void updateMenuIcon() {
        icon = new ImageIcon("images/new.jpg");
        new_item.setIcon(icon);
    }

    protected void addMenus() {
        super.addMenus();
        updateMenuIcon();
        addSubMenus();
    }

    public static void createAndShowGUI() {
        PersonFormV4 personForm4 = new PersonFormV4("Person Form V4");
        personForm4.addComponents();
        personForm4.addMenus();
        personForm4.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}