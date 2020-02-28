package pongsuwan.surapat.lab9;

import java.awt.geom.Rectangle2D;

public class Keeper extends Rectangle2D.Double {

    private static final long serialVersionUID = 1L;

    //Constant variables.
    public final static int KEEPER_WIDTH = 20, 
    KEEPER_HEIGHT = 50, KEEPER_SPEED = 10;

    //---------------Constructor.-------------------
    Keeper(int x, int y) {
        super(x , y, KEEPER_WIDTH, KEEPER_HEIGHT);
    }

    //---------------Moving method.-----------------
    public void moveUp() {
        if (y - KEEPER_SPEED >= 150)  {
            y = y - KEEPER_SPEED;
        }
    }
    public void moveDown() {
        if (y + KEEPER_HEIGHT + KEEPER_SPEED <= 350)  {
            y = y + KEEPER_SPEED;
        }
    }

}