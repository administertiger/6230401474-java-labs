/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 16, 2020
*/

package pongsuwan.surapat.lab7;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class GraphicsMoverV3 extends GraphicsMoverV2 {

    private static final long serialVersionUID = 1L;
    //Components.
    protected JMenuBar menuBar;  //Menu Bar
    protected JMenu file_menu;  //Menu.
    protected JMenuItem open_item, save_item, quit_item;  //Menu item.
    protected ImageIcon open_icon;  //image icon.

    protected GraphicsMoverV3(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        menuBar = new JMenuBar();
        file_menu = new JMenu("File");
        open_item = new JMenuItem("Open");
        save_item = new JMenuItem("Save");
        quit_item = new JMenuItem("Quit");
        open_icon = new ImageIcon("images/open.png");
    }    

    protected void addComponents() {
        super.addComponents();
        addMenus();
    }

    protected void setIcon() {
        Image open_image = open_icon.getImage().getScaledInstance(22, 22, Image.SCALE_SMOOTH);
        open_icon = new ImageIcon(open_image);
        open_item.setIcon(open_icon);
    }

    protected void addMenus() {
        //Set icon.
        setIcon();
        //Add menu o menu bar.
        menuBar.add(file_menu);
        //Add item to menu.
        file_menu.add(open_item);
        file_menu.add(save_item);
        file_menu.add(quit_item);
        //Set menu bar to frame.
        setJMenuBar(menuBar);

    }
    
    public static void createAndShowGUI() {
        GraphicsMoverV3 gpmvV3 = new GraphicsMoverV3("Graphics Mover Version 3");
        gpmvV3.initComponents();
        gpmvV3.addComponents();
        gpmvV3.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}