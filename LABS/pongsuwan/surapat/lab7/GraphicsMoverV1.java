/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 16, 2020
*/
package pongsuwan.surapat.lab7;

import javax.swing.*;
import java.awt.*;
import pongsuwan.surapat.lab6.*;


public class GraphicsMoverV1 extends MySimpleWindow {

    private static final long serialVersionUID = 1L;

    protected JPanel button_panel;
    protected CanvasDrawerV1 canvasDrawerV1;
    protected JButton moveUP_button, moveDown_button, moveLeft_button, moveRight_button, reset_button;
    

    protected GraphicsMoverV1(String title) {
        super(title);
    }

    protected void initComponents() {
        canvasDrawerV1 = new CanvasDrawerV1();
        button_panel = new JPanel();
        moveUP_button = new JButton("UP");
        moveDown_button = new JButton("DOWN");
        moveLeft_button = new JButton("LEFT");
        moveRight_button = new JButton("RIGHT");
        reset_button = new JButton("RESET");

    }

    @Override
    protected void addComponents() {
        setLayout(new BorderLayout());
        //Add button to panel.
        button_panel.add(moveUP_button);
        button_panel.add(moveDown_button);
        button_panel.add(moveLeft_button);
        button_panel.add(moveRight_button);
        button_panel.add(reset_button);

        //Add to frame.
        add(canvasDrawerV1, BorderLayout.CENTER);
        add(button_panel, BorderLayout.SOUTH);   
    }

    public static void createAndShowGUI() {
        GraphicsMoverV1 gpmvV1 = new GraphicsMoverV1("Graphics Mover Version 1");
        gpmvV1.initComponents();
        gpmvV1.addComponents();
        gpmvV1.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

