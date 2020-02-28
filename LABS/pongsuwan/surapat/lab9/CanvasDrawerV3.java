/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 27, 2020
*/

package pongsuwan.surapat.lab9;

import java.util.Random;

public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {
    private static final long serialVersionUID = 1L;

    protected static final int minRand = 1, maxRand = 4;

    protected Thread running;
    private Random random_x, random_y;
    private int maxVal = 4, minVal = 1;

    public CanvasDrawerV3() {
        super();
        running = new Thread(this);

        random_x = new Random();
        random_y = new Random();

        int xv = random_x.nextInt(maxVal - minVal + 1) + 1;
        int yv = random_y.nextInt(maxVal - minVal + 1) + 1;

        this.ball.set_x_velo(xv);
        this.ball.set_y_velo(yv);

        running.start();
    }

    @Override
    public void run() {
        while(true) {
            //Check if the ball hits the vertical wall.
            if (verticalWall()) {
                //Check if the ball doesn't hit the goal.
               if (goal()) {
                changeXVelocity();
               }
            } 
            //Check if the ball hits the horizintal wall.
            else if (horizontalWall()) {
               changeYVelocity();
            }

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

    //--------------------------------Conditions.---------------------------------
    protected boolean verticalWall() {
        return ball.getX() <= 0 ||  ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH;
    }
    protected boolean horizontalWall() {
        return ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT;
    }
    protected boolean goal() {
        return ball.getY() + Ball.BALL_DIAMETER <= 150 || ball.getY() + Ball.BALL_DIAMETER >= 350;
    }

    //To change x, y velocity.
    protected void changeXVelocity() {
        int xVelocity = this.ball.get_x_velo();
        this.ball.set_x_velo(xVelocity * -1);
    }
    protected void changeYVelocity() {
        int yVelocity = this.ball.get_y_velo();
        this.ball.set_y_velo(yVelocity * -1);
    }
}
