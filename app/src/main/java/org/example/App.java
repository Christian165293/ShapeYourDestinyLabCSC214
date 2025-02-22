package org.example;

public class App {
    public static void main(String[] args) {
        // Test Square class
        Square square = new Square(5);
        System.out.println("\nSquare side length: " + square.getLength());
        System.out.println("Square area: " + square.getArea());//should be 25
        System.out.println("Square perimeter: " + square.getPerimeter());//should be 20

        // Test IsocelesRightTriangle class
        IsocelesRightTriangle isocelesRightTriangle = new IsocelesRightTriangle(3);
        System.out.println("\nIsocelesRightTriangle leg length: " + isocelesRightTriangle.getLength());
        System.out.println("IsocelesRightTriangle area: " + isocelesRightTriangle.getArea());//should be 4.5
        System.out.println("IsocelesRightTriangle perimeter: " + isocelesRightTriangle.getPerimeter());//should be 10.24

        // Test Rectangle class
        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("\nRectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle area: " + rectangle.getArea());//should be 28
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());//should be 22

        // Test RightTriangle class
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        System.out.println("\nRightTriangle width: " + rightTriangle.getWidth());
        System.out.println("RightTriangle length: " + rightTriangle.getLength());
        System.out.println("RightTriangle area: " + rightTriangle.getArea());//should be 6
        System.out.println("RightTriangle perimeter: " + rightTriangle.getPerimeter());//should be 12

        // Test Circle class
        Circle circle = new Circle(5);
        System.out.println("\nCircle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());//should be 78.54
        System.out.println("Circle circumference: " + circle.getPerimeter());//should be 31.42
    }
}
