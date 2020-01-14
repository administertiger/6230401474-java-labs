package pongsuwan.surapat.lab5;

/*
* This program is to create a subclass name "Rectangle" which extends from class "Shape".
* 
* Author : Surapat Pongsuwan
* ID : 623040147-4  
* Section : 2
* Date : January 13, 2020
*/

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        this.width = 1.0;
        this.length = 2.0;
    }
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled ) {
        super(color,filled); // Take "color" and "filled" back to Shape's constructor to set the variable.
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    
    // Abstract method.
    public double getArea() {
        double area = width * length;
        BigDecimal _area = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP);
        return _area.doubleValue();
    }
    // Abstract method.
    public double getPerimeter() {
        double perimeter = (width*2) + (length*2);
        BigDecimal _perimeter = new BigDecimal(perimeter).setScale(2, RoundingMode.HALF_UP);
        return _perimeter.doubleValue();
    }

    @Override
    public String toString() {
        return "Color:" + color + ", Filled:" + filled + ", width:" + width + ",length:" + length;
    }
}