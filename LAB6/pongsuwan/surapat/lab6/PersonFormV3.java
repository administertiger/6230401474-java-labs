package pongsuwan.surapat.lab6;

/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 4, 2020
*/

//import java.awt.*;
import javax.swing.*;

public class PersonFormV3 extends PersonFormV2 {

    //Quick fix warning: Java(536871008)
    private static final long serialVersionUID = 1L;
    //------------Menus constructors.-------------
    protected JMenu file_menu, config_menu;
    protected JMenuItem new_item, open_item, save_item, exit_item;  //File's items.
    protected JMenuItem color_item, size_item;  //Config's items.
    //------------Hobby constructors.-------------
    protected JLabel hobby_label;  //hobby label.
    protected JList<String> hobby_list;
    private String hobbies[] = {"Reading", "Tavelling", "Cooking", "Photogaphy"};
    //--------------------------------------------

    PersonFormV3(String name) {
        super(name);
    }

    protected void initComponents() {
        super.initComponents();
        //-------------Menus.--------------
        file_menu = new JMenu("File");
        config_menu = new JMenu("Config");
        //----------Menu items-------------
        new_item = new JMenuItem("New");
        open_item = new JMenuItem("Open");
        save_item = new JMenuItem("Save");
        exit_item = new JMenuItem("Exit");
        color_item = new JMenuItem("Color");
        size_item = new JMenuItem("Size");
        //-----------hobby list------------
        hobby_list = new JList<String>(hobbies);

        hobby_label = new JLabel("Hobbies");
    }

    protected void addComponents() {
        this.initComponents();
        super.addComponents();  //Set the Layout with super.addComponents().

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel2.add(hobby_label, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel2.add(hobby_list, gbc);
    }

    protected void addMenus() {
        JMenuBar menuBar = new JMenuBar();  //A menubar.
        
        //Add items to File.
        file_menu.add(new_item);
        file_menu.add(open_item);
        file_menu.add(save_item);
        file_menu.add(exit_item);
        
        //Add items to config.
        config_menu.add(color_item);
        config_menu.add(size_item);
        //------------------------------
        menuBar.add(file_menu);
        menuBar.add(config_menu);
        //------------------------------
        setJMenuBar(menuBar);;
    }

    public static void createAndShowGUI() {
        PersonFormV3 personForm3 = new PersonFormV3("Person Form V3");
        personForm3.addComponents();
        personForm3.addMenus();
        personForm3.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}