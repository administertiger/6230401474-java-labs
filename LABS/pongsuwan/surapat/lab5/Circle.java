package pongsuwan.surapat.lab5;

/*
* This program is to create a subclass name "Circle" which extends from class "Shape".
* 
* Author : Surapat Pongsuwan
* ID : 623040147-4  
* Section : 2
* Date : January 13, 2020
*/

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
    protected double radius;

    Circle() {
        this.radius = 1;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        super(color, filled); // Take "color" and "filled" to Shape's constructor to set the variable.
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override  // An abstract method that have to declare. 
    public double getArea() { 
        double area = (Math.PI) * (radius * radius);
        BigDecimal _area = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP);;
        return _area.doubleValue();
    }
    @Override  // An abstract method that have to declare.
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius; 
        BigDecimal _perimeter = new BigDecimal(perimeter).setScale(2, RoundingMode.HALF_UP);;
        return _perimeter.doubleValue();
    }
    @Override
    public String toString() {
        return "Color:" + color + ", Filled:" + filled + ", radius:" + radius;
    }
}