package org.example;

public class RightTriangle extends Shape implements Polygon{
    double length;
    double width;
    public RightTriangle(double inLength,double inWidth){
        length = inLength;
        width = inWidth;
    }
    @Override
    public double getArea() {
        return 0.5 * (length * width);
    }

    @Override
    public double getPerimeter() {
        return length + width + Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
