/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 16, 2020
*/
package pongsuwan.surapat.lab7;

import javax.swing.JPanel;
import java.awt.*;

public class CanvasDrawerV1 extends JPanel {

    private static final long serialVersionUID = 1L;

    //Components.
    private Color CANVAS_BACKGROUND = Color.green;

    //Constant variables.
    private int CANVAS_WIDTH = 800, CANVAS_HEIGHT = 500;
    private float LINE_WIDTH = 4.0f;
    private int CIRCLE_RADIUS = 50, DOT_CIRCLE_RADIUS = 5;

    public CanvasDrawerV1() {
       
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        setBackground(CANVAS_BACKGROUND);
    }
    
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        int width = this.getWidth();
        int height = this.getHeight();
        //----------------------Setting g2D.------------------------------
        g2D.setStroke(new BasicStroke(LINE_WIDTH));
        g2D.setColor(Color.BLACK);

        //-------------------Line in the center.--------------------------
        g2D.drawLine(width/2, 0, width/2, height);

        //--------------------Outter regtangle.----------------------------
        g2D.drawRect(0, 80, 150, height - 160);  //Left side.
        g2D.drawRect(width -150 , 80, 150, height - 160);  //Right side.

        //---------------------Inner regtangle.----------------------------
        g2D.drawRect(0, 150, 60, height - 300);  //Left side.
        g2D.drawRect(width - 60, 150, 60, height - 300);  //Right side.

        //-----------------------Dot circle.-------------------------------
        g2D.fillOval(105 - DOT_CIRCLE_RADIUS, height/2 + DOT_CIRCLE_RADIUS, 
        DOT_CIRCLE_RADIUS*2, DOT_CIRCLE_RADIUS*2);  //Left side.

        g2D.fillOval(width - (113 - DOT_CIRCLE_RADIUS), height/2 + DOT_CIRCLE_RADIUS, 
        DOT_CIRCLE_RADIUS*2, DOT_CIRCLE_RADIUS*2);  //Right side.

        //--------------------Circle in the center.------------------------
        g2D.setColor(Color.WHITE);
        g2D.drawOval((width/2) - CIRCLE_RADIUS, (height/2) - CIRCLE_RADIUS, CIRCLE_RADIUS * 2,
        CIRCLE_RADIUS * 2);

    }
}