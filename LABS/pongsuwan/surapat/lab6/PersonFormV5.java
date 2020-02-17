package pongsuwan.surapat.lab6;

/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 6, 2020
*/

import java.awt.*;
import javax.swing.*;

public class PersonFormV5 extends PersonFormV4 {
    
    //Quick fix warning: Java(536871008)
    private static final long serialVersionUID = 1L;
    // -----------------Font setting---------------------
    Font label_font = new Font("Serif", Font.PLAIN, 14);
    Font input_font = new Font("Serif", Font.BOLD, 14);

    protected PersonFormV5(String name) {
        super(name);
    }

    protected void setFonts() {
        //----------Label section.-------------
        name_label.setFont(label_font);
        height_label.setFont(label_font);
        weight_label.setFont(label_font);
        birth_label.setFont(label_font);
        type_label.setFont(label_font);
        sport_label.setFont(label_font);
        hobby_label.setFont(label_font);
        note_label.setFont(label_font);
        //----------Radio button section--------
        student_radio.setFont(label_font);
        teacher_raio.setFont(label_font);
        //----------ComboBox section-------------
        sport_box.setFont(label_font);
        //------------List section---------------
        hobby_list.setFont(label_font);
        //-----------TextField section-----------
        name_textField.setFont(input_font);
        height_textField.setFont(input_font);
        weight_textField.setFont(input_font);
        birth_textField.setFont(input_font);
    }

    protected void setColors() {
        okButton.setForeground(Color.BLUE);
        okButton.setBackground(Color.WHITE);
        cancelButton.setForeground(Color.RED);
        cancelButton.setBackground(Color.WHITE);
    }

    protected void setValues() {
        //----------set text to TextField-------------
        name_textField.setText("Manee");
        height_textField.setText("160");
        weight_textField.setText("55");
        birth_textField.setText("02-02-2000");
        //------radio button set selection-------------
        student_radio.setSelected(true);
        //--------ComboBox set selection--------------
        sport_box.setSelectedIndex(1);
        //---------Hobby list st selection------------
        hobby_list.setSelectedIndices(new int[] {0,3});
        
    }

    protected void initComponents() {
        super.initComponents();
        setFonts();
        setColors();
        setValues();
    }
    /*
    protected void addMenus() {
        super.addMenus();
        this.initComponents();
    }
    */

    public static void createAndShowGUI() {
        PersonFormV5 personForm5 = new PersonFormV5("Person Form V5");
        personForm5.addComponents();
        personForm5.addMenus();
        personForm5.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}