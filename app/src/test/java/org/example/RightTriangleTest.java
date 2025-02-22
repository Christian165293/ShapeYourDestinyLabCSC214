package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    @Test
    public void testGetArea() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(6, triangle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(12, triangle.getPerimeter(), 0.0001);
    }

    @Test
    public void numberOfSides() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(3, triangle.numberOfSides(), 0.0001);
    }
}