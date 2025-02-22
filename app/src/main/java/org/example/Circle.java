package org.example;

public class Circle extends Shape{
    double radius;
 public Circle(double inRadius){
     radius = inRadius;
 }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * radius);
    }
}
