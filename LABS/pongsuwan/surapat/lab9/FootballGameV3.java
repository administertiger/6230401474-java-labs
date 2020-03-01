/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 29, 2020
*/

package pongsuwan.surapat.lab9;
import java.awt.event.*;

import javax.swing.SwingUtilities;

public class FootballGameV3 extends FootballGameV2 {

    private static final long serialVersionUID = 1L;

    protected FootballGameV3(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        this.canvasDrawerFBG = new CanvasDrawerV5();
    }

    //--------------Actionlistener section.--------------
    protected void addListeners() {
        super.addListeners();
        reset_button.addActionListener(this);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        
        Object object = e.getSource();

        if (object == reset_button) {
            resetScore();
            ((CanvasDrawerV5) canvasDrawerFBG).resetBall(); // This medthod is in CanvasDrawerV5.
        }
    }
    //-----------------------------------------------------
    
    protected void resetScore() {
        khonkaen_field.setText("0");
        udon_field.setText("0");
    }
    
    public static void createAndShowGUI() {
        FootballGameV3 footballV3 = new FootballGameV3("Football Game V3");
        footballV3.initComponents();
        footballV3.addListeners();
        footballV3.addComponents();
        footballV3.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}