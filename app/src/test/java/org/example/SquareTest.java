package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void testGetArea() {
        Square square = new Square(4);
        assertEquals(16, square.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.getPerimeter(), 0.0001);
    }

    @Test
    public void numberOfSides() {
        Square square = new Square(4);
        assertEquals(4, square.numberOfSides(), 0.0001);
    }
}