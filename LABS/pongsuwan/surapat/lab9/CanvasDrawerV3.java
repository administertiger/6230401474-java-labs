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

    protected Thread running;
    protected Random random_x, random_y;
    protected int maxVal = 2, minVal = -2;

    public CanvasDrawerV3() {
        super();
        running = new Thread(this);
        random_x = new Random();
        random_y = new Random();

        int xv = random_x.nextInt(maxVal - minVal + 1) + minVal;
        int yv = random_y.nextInt(maxVal - minVal + 1) + minVal;

        //Make sure that's velocity isn't = 0.
        if (xv == 0 ) xv += 1 ;
        else if (yv == 0) yv += 1 ;

        this.ball.set_x_velo(-2);
        this.ball.set_y_velo(0);

        running.start();
    }

    @Override
    public void run() {
        while(true) {
            //Check if the ball hits the vertical wall.
            if (isHitVerticalWall()) {
                //Check if the ball doesn't hit the goal.
               if (isNotHitGoal()) {
                changeXVelocity();
               }
            } 
            //Check if the ball hits the horizintal wall.
            else if (isHitHorizontalWall()) {
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
    protected boolean isHitVerticalWall() {
        return ball.getX() <= 0 ||  ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH;
    }
    protected boolean isHitHorizontalWall() {
        return ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT;
    }
    protected boolean isNotHitGoal() {
        return ball.getY() + Ball.BALL_DIAMETER <= 150 || ball.getY() + Ball.BALL_DIAMETER >= 350;
    }

    //----------------------------------Actions.-----------------------------------

    //Change x velocity.
    protected void changeXVelocity() {
        int xVelocity = this.ball.get_x_velo();
        this.ball.set_x_velo(xVelocity * -1);
    }
    //Change y velocity.
    protected void changeYVelocity() {
        int yVelocity = this.ball.get_y_velo();
        this.ball.set_y_velo(yVelocity * -1);
    }
    
    //---------------------------------------------------------------------------------
}
