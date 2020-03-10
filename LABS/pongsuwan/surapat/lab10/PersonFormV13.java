package pongsuwan.surapat.lab10;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV13 extends PersonFormV12 {

    private static final long serialVersionUID = 1L;

    //Constant variables.
    private String message = "";
    private double MIN_HEIGHT = 100, MAX_HEIGHT = 250, MIN_WEIGHT = 40, MAX_WEIGHT = 150, 
    MIN_DAY = 1, MAX_DAY = 31, MIN_MONTH = 1, MAX_MONTH = 12, MIN_YEAR = 1900, MAX_YEAR = 2010;
    
    protected PersonFormV13(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sObject = e.getSource();

        if (sObject == okButton) {
            //If the return of error is true, do this method.
            if (textBoxAlert()) {
                message = "";
                return;
            }
        }
        super.actionPerformed(e);
    }

    protected boolean textBoxAlert() {

        //Check if name box is empty.
        if (name_textField.getText().equals("")) {
            message += "Please enter name. \n";
        }

        //check if height box is numeric and in range max and min.
        checkDecimalException(height_textField.getText(), "height", MIN_HEIGHT, MAX_HEIGHT);

        //check if weight box is numeric and in range max and min.
        checkDecimalException(weight_textField.getText(), "weight", MIN_WEIGHT, MAX_WEIGHT);

        //get each dob from dob box.
        String dob[] = birth_textField.getText().split("-");
        if (dob.length != 3) {
            message += "Please enter date. \n";
        } 
        else {
            //check the dob.
            checkDecimalException(dob[0], "day", MIN_DAY, MAX_DAY);
            checkDecimalException(dob[1], "month", MIN_MONTH, MAX_MONTH);
            checkDecimalException(dob[2], "year", MIN_YEAR, MAX_YEAR);
        }

        if (message == "") {
            return false;      //if there aren't no error, return false.
        }

        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);

        return true;
    }

    protected void checkDecimalException(String box_text, String name, double min_value, double max_value) {
        try {
            Double figure = Double.parseDouble(box_text);

            if (figure < min_value || figure > max_value) {
                message += String.format("Valid values for " + name + " are [%.2f, %.2f] \n", min_value, max_value);
            }

        } catch (NumberFormatException e) {
            message += "Please enter only numeric input for " + name + ". \n";
        }
    }

    protected void checkDate(String box_text, String name, double min_value, double max_value) {

    }

    //-------------------------------------------------------------------
    public static void createAndShowGUI() {
        PersonFormV13 personForm13 = new PersonFormV13("Person Form V13");
        personForm13.addComponents();
        personForm13.addListeners();
        personForm13.addKeys();
        personForm13.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }   
}