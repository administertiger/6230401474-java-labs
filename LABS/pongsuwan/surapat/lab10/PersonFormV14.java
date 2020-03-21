/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : March 21, 2020
*/
package pongsuwan.surapat.lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV14 extends PersonFormV13 {

    private static final long serialVersionUID = 1L;

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
                FileOutputStream file_output = new FileOutputStream(file);
                ObjectOutputStream object_output = new ObjectOutputStream(file_output);

                //Write each line of person list to file.
                String line = "";
                for (Person person : person_list) {
                    line += person + "\n";
                }
                object_output.writeObject(line);
                
                file_output.close();
                object_output.close();
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Open command cancelled by user.");
        }
    }

    protected void openFile() {
        int returnVal = file_chooser.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                //Read data from file.
                File file = file_chooser.getSelectedFile();
                FileInputStream file_input = new FileInputStream(file);
                ObjectInputStream object_input = new ObjectInputStream(file_input);
                
                //Showing dialog.
                JOptionPane.showMessageDialog(this, object_input.readObject());
                
            } catch (Exception e) {
                System.out.println("*********error*********");
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