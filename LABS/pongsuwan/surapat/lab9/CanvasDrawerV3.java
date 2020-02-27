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

    public CanvasDrawerV3() {
        super();
        running = new Thread(this);

        random_x = new Random();
        random_y = new Random();

        int xv = random_x.nextInt(4) + 1;
        int yv = random_y.nextInt(4) + 1;

        this.ball.set_x_velo(xv);
        this.ball.set_y_velo(yv);

        running.start();
    }

    @Override
    public void run() {
        while(true) {
            
            //Check if the ball hits the vertical wall.
            if (ball.getX() <= 0 ||  ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                //Check if the ball doesn't hit the goal.
               if (ball.getY() + Ball.BALL_DIAMETER/2 <= 150 || ball.getY() + Ball.BALL_DIAMETER/2 >= 350) {
                //set xVelocity
                int xVelocity = this.ball.get_x_velo();
                this.ball.set_x_velo(xVelocity * -1);
               }
            } 

            //Check if the ball hits the horizintal wall.
            else if (ball.getY()  <= 0 || ball.getY() + Ball.BALL_DIAMETER/2 >= CANVAS_HEIGHT) {
               //set yVelocity
               int yVelocity = this.ball.get_y_velo();
               this.ball.set_y_velo(yVelocity * -1);
            }

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }
}
