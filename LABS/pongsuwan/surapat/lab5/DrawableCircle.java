package pongsuwan.surapat.lab5;

/*
* This program is to create a class "DrawableCircle" which extends from "Rectangle" and implements intefaces "Drawable" and "Moveable".
*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : January 16, 2020
*/

public class DrawableCircle extends Circle implements Moveable, Drawable{
    private double x;
    private double y;

    DrawableCircle() {
        super();
        x = 0.0;
        y = 0.0;
    }
    DrawableCircle(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    DrawableCircle(double x, double y, double radius, String color, boolean filled) {
        super(radius, color, filled);  // "super" class is "Circle".
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }

    // implements intefaces.

    @Override
    public void moveUp(int val) {
        this.y += val;
    }    
    @Override
    public void moveDown(int val) {
        this.y -= val;
    }
    @Override
    public void moveRight(int val) {
        this.y += val;
    }
    @Override
    public void moveLeft(int val) {
        this.y -= val;
    }    

    @Override
    public String draw() {
        return "draw a circle with top left corner at (" 
        + x + "," + y + ") with radius=" + radius;
    }
}

