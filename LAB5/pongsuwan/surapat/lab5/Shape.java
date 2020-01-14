package pongsuwan.surapat.lab5;

/*
* This program is to create an abstract class name "Shape" to inherit other class.
* 
* Author : Surapat Pongsuwan
* ID : 623040147-4  
* Section : 2
* Date : January 13, 2020
*/

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
        this.color = "White";
        this.filled = false;
    }
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea(); // Abstract method.
 
    public abstract double getPerimeter(); // Abstract method.

    @Override
    public String toString() {
        return "Color:"+ color + ", Filled:" + filled;
    }
}