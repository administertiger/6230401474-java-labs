package pongsuwan.surapat.lab6;

import java.awt.*;
import javax.swing.*;

public class PersonFormV2 extends PersonFormV1 {

    //Quick fix warning: Java(536871008)
    private static final long serialVersionUID = 1L;
    //---------------Components.-----------------
    private String note_text;
    protected JTextArea text_note;  //Texts in note Label 
    protected JComboBox<String> sport_box;  //A Box for sports list.
    //------------Label components.---------------
    protected JLabel sport_label;
    protected JLabel note_label;
    //------------A sports list.------------------
    protected String sports[] = {"Running","Swimming", "Tennis"};
    
    //A defualt constructor.
    PersonFormV2(String name) {
        super(name);
    }

    protected void initComponents() {
        super.initComponents();
        note_text = "21st Century skills include Critical thinking, Creativity, Collaboration, Communication, etc.";
        text_note = new JTextArea(2,1);
        sport_box = new JComboBox<String>(sports);
        //----------Label components.-----------
        sport_label = new JLabel("Sport:");
        note_label = new JLabel("Note:");
    }

    protected void addComponents() {
        this.initComponents();
        super.addComponents();  //Set the Layout with super.addComponents().


        
        //---------------------------------
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel2.add(sport_label, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel2.add(sport_box, gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel2.add(note_label, gbc);
        //-----------note section------------
        text_note.setText(note_text);
        text_note.setLineWrap(true);
        text_note.setWrapStyleWord(true);
        //------------------------------------
        add(text_note, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        PersonFormV2 personForm2 = new PersonFormV2("Person Form V2");
        personForm2.addComponents();
        personForm2.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}