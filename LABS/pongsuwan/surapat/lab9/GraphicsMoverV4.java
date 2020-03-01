/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 24, 2020
*/

package pongsuwan.surapat.lab9;
import java.awt.BorderLayout;

import javax.swing.SwingUtilities;
import pongsuwan.surapat.lab7.*;

public class GraphicsMoverV4 extends GraphicsMoverV3 {

    private static final long serialVersionUID = 1L;

    protected CanvasDrawerV2 canvasDrawerV2;  

    protected GraphicsMoverV4(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }
    
    protected void initComponents() {
        super.initComponents();
        canvasDrawerV2 = new CanvasDrawerV2();
        moveUP_button.setText("Move Left Up");
        moveDown_button.setText("Move Left Down");
        moveLeft_button.setText("Move Right Up");
        moveRight_button.setText("Move RIght Down");
    }

    protected void addComponents() {
        super.addComponents();
        main_panel.remove(canvasDrawerV1);
        main_panel.add(canvasDrawerV2, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        GraphicsMoverV4 gpmvV4 = new GraphicsMoverV4("Graphics Mover Version 4");
        gpmvV4.initComponents();
        gpmvV4.addComponents();
        gpmvV4.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}



