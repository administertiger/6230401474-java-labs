/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 27, 2020
*/

package pongsuwan.surapat.lab9;
import java.awt.BorderLayout;

import javax.swing.SwingUtilities;

public class FootballGameV1 extends GraphicsMoverV4 {

    private static final long serialVersionUID = 1L;

    //CanvasDrawer.
    protected CanvasDrawerV3 canvasDrawerV3;

    protected FootballGameV1(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        canvasDrawerV3 = new CanvasDrawerV3();
    }
    
    @Override
    protected void addComponents() {
        super.addComponents();
        main_panel.remove(canvasDrawerV2);
        main_panel.add(canvasDrawerV3, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        FootballGameV1 footballV1 = new FootballGameV1("Football Game V1");
        footballV1.initComponents();
        footballV1.addComponents();
        footballV1.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}