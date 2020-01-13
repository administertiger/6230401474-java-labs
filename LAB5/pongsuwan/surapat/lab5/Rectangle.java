package pongsuwan.surapat.lab5;

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
        super(color,filled);
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

    public double getArea() {
        double area = width * length;
        BigDecimal _area = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP);
        return _area.doubleValue();
    }
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