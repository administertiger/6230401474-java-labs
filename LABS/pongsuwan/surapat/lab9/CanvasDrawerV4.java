/*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : Febuary 28, 2020
*/

package pongsuwan.surapat.lab9;

public class CanvasDrawerV4 extends CanvasDrawerV3 {

    private static final long serialVersionUID = 1L;
    
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

            //Check if the ball hits the right goal keeper.
            else if (keeperRight()) {
                changeXVelocity();
            } 
            
            //Check if the ball hits the left goal keeper.
            else if (keeperLeft()) {
                changeXVelocity();
            }

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

    //------------------------Conditions.-------------------------------
    protected boolean keeperRight() {
        return ball.getX()  + Ball.BALL_DIAMETER == keeperRight.getX() 
            && ball.getY() + Ball.BALL_DIAMETER >= keeperRight.getY()
            && ball.getY() + Ball.BALL_DIAMETER <= keeperRight.getY() + Keeper.KEEPER_HEIGHT; 
    }
    protected boolean keeperLeft() {
        return ball.getX() <= keeperLeft.getX() + Keeper.KEEPER_WIDTH
            && ball.getY() + Ball.BALL_DIAMETER >= keeperLeft.getY()
            && ball.getY() + Ball.BALL_DIAMETER <= keeperLeft.getY() + Keeper.KEEPER_HEIGHT;
    }
}