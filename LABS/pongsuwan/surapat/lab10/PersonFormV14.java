/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : March 21, 2020
*/
package pongsuwan.surapat.lab10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV14 extends PersonFormV13 {

    private static final long serialVersionUID = 1L;

    private ArrayList<String> file_name;  //Make a list of file name to check whether that file has been created.

    protected PersonFormV14(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        file_name = new ArrayList<>();
    }

    protected void saveFile() {
        int returnVal = file_chooser.showSaveDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = file_chooser.getSelectedFile();
                FileWriter fileWriter = new FileWriter(file);
                file_name.add(file.getName());  //Add file name to the list.
                fileWriter.write("");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Open command cancelled by user.");
        }
    }

    protected void openFile() {
        int returnVal = file_chooser.showOpenDialog(this);
        File file = file_chooser.getSelectedFile();

        if (returnVal == JFileChooser.APPROVE_OPTION);
            if (file_name.contains(file.getName())) {
                try {
                    Scanner fileReader = new Scanner(file);
                    String list = "";

                    while (fileReader.hasNextLine()) {
                        list += fileReader.nextLine() + "\n";
                    }
                    fileReader.close();

                    JOptionPane.showMessageDialog(this, list);
                } catch (Exception e) {

                }
        }

        else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Open command cancelled by user.");
        }
    }
    
    public static void createAndShowGUI() {
        PersonFormV14 personForm14 = new PersonFormV14("Person Form V14");
        personForm14.addComponents();
        personForm14.addListeners();
        personForm14.addKeys();
        personForm14.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}