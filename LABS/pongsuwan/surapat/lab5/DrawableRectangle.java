package pongsuwan.surapat.lab5;

/*
* This program is to create a class "DrawableRectangle" which extends from "Rectangle" and implements interfaces "Drawable" and "Moveable".
*
* Author : Surapat Pongsuwan
* ID : 623040147-4
* section : 2
* Date : January 16, 2020
*/

public class DrawableRectangle extends Rectangle implements Drawable, Moveable 
{
    private double x;
    private double y;

    DrawableRectangle() {
        super();
        x = 0.0;
        y = 0.0;
    }
    DrawableRectangle(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    DrawableRectangle(double x, double y, double width, double length, String color, boolean filled) {
        super(width, length, color, filled);  // "super" class is "Rectangle".
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
        return "draw a rectangle with top left cornor at (" 
        + x + "," + y + ") with width=" + width + " length=" + length;
    }
}