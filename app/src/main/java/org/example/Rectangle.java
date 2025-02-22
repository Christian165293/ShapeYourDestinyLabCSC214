package org.example;

public class Rectangle extends Shape implements Polygon{
    double length;
    double width;
public Rectangle(double inLength,double inWidth){
    length = inLength;
    width = inWidth;
}
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
