/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : March 6, 2020
*/

package pongsuwan.surapat.lab10;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV12 extends PersonFormV11{
    // Warnig alert.--------------------------------
    private static final long serialVersionUID = 1L;
    // ---------------------------------------------

    protected JMenu data_menu;
    protected JMenuItem display_item, sort_item, search_item, remove_item;
    protected ArrayList<Person> person_list;
    private Person person;

    protected PersonFormV12(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        data_menu = new JMenu("Data");
        display_item = new JMenuItem("Display");
        sort_item = new JMenuItem("Sort");
        search_item = new JMenuItem("Search");
        remove_item = new JMenuItem("Remove");
        person_list = new ArrayList<Person>();
    }

    protected void addMenus() {
        super.addMenus();
        data_menu.add(display_item);
        data_menu.add(sort_item);
        data_menu.add(search_item);
        data_menu.add(remove_item);
        menuBar.add(data_menu);
    }

    protected void addComponents() {
        super.addComponents();
        addMenus();
    }

    // ----------------------------Actionlistener.-----------------------------------
    protected void addListeners() {
        super.addListeners();
        display_item.addActionListener(this);
        sort_item.addActionListener(this);
        search_item.addActionListener(this);
        remove_item.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object sObject = e.getSource();

        if (sObject == display_item) {
            showPersonList();
        } else if (sObject == sort_item) {
            sortPersonList();
            showPersonList();
        } else if (sObject == search_item) {
            searchPersonList();
        } else if (sObject == remove_item) {
            removePersonList();
        }
    }

    //-------------------------------------Actions.---------------------------------------

    protected void handleOkButton() {
        createPerson();

        person_list.add(person);  // Add person to list.

        String info = getOkButtonInfo();
        info += "\n" + "\n" + "Adding this person into the list : " + person;
        JOptionPane.showMessageDialog(this, info, "Person Information", JOptionPane.INFORMATION_MESSAGE, dialog_icon);
    }

    protected void showPersonList() {
        String list = "";
        for (Person person : person_list) {
            list += person + "\n";
        }
        JOptionPane.showMessageDialog(this, list, "Person List", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void sortPersonList() {
        Collections.sort(person_list);
    }

    protected void searchPersonList() {
        String name = JOptionPane.showInputDialog("Please enter a person name to search : ");
        Person person = searchName(name);

        if (person != null) {
            JOptionPane.showMessageDialog(this, person + " is found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    protected void removePersonList() {
        String name = JOptionPane.showInputDialog("Please enter a person name to remove : ");
        Person person = searchName(name);

        if (person != null) {
            person_list.remove(person);
            JOptionPane.showMessageDialog(this, person + " is remove.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
    }

    protected Person searchName(String name) {
        for (Person person : person_list) {
            if (person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
    
    //-------------------------------------------------------------------------------------------

    protected void createPerson() {
        // Get infos.
        String name = name_textField.getText();
        double height = Double.parseDouble(height_textField.getText());
        double weight = Double.parseDouble(weight_textField.getText());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(birth_textField.getText(), formatter);

        // Declare Person's constructor.
        person = new Person(name, weight, height, dob);
    }

    public static void createAndShowGUI() {
        PersonFormV12 personForm12 = new PersonFormV12("Person Form V12");
        personForm12.addComponents();
        personForm12.addListeners();
        personForm12.addKeys();
        personForm12.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }   
}