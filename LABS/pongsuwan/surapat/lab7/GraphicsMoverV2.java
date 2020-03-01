/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 16, 2020
*/

package pongsuwan.surapat.lab7;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GraphicsMoverV2 extends GraphicsMoverV1 {

    private static final long serialVersionUID = 1L;
    
    // Components
    private Font serif20_font;
    protected JPanel score_panel, scoreMain_panel;
    protected JLabel khonkaen_label, udon_label;
    protected JTextField khonkaen_field, udon_field;

    protected void initComponents() {
        super.initComponents();
        serif20_font = new Font("Serif", Font.BOLD, 20);
        score_panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        khonkaen_label = new JLabel("Khonkaen");
        udon_label = new JLabel("Udon Thani");
        //Text field.
        khonkaen_field = new JTextField();
        udon_field = new JTextField();

        this.setValues();
    }

    protected void setValues() {
        //Set text.
        khonkaen_field.setText("3");
        udon_field.setText("1");

        //Set fonts.
        khonkaen_label.setFont(serif20_font);
        udon_label.setFont(serif20_font);
        khonkaen_field.setFont(serif20_font);
        udon_field.setFont(serif20_font);

        //Set color.
        khonkaen_label.setForeground(Color.BLUE);
        udon_label.setForeground(Color.RED);
        
    }

    protected GraphicsMoverV2(String title) {
        super(title);
    }

    protected void addComponents() {
        super.addComponents();
        
        //-------------Add things to panel------------------
        score_panel.add(khonkaen_label);
        score_panel.add(khonkaen_field);
        score_panel.add(udon_label);
        score_panel.add(udon_field);

        add(score_panel, BorderLayout.NORTH);
    }

    public static void createAndShowGUI() {
        GraphicsMoverV2 gpmvV2 = new GraphicsMoverV2("Graphics Mover Version 2");
        gpmvV2.initComponents();
        gpmvV2.addComponents();
        gpmvV2.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}