package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsocelesRightTriangleTest {

    @Test
    public void testGetArea() {
        IsocelesRightTriangle isocelesRightTriangle = new IsocelesRightTriangle(8);
        assertEquals(32, isocelesRightTriangle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        IsocelesRightTriangle isocelesRightTriangle = new IsocelesRightTriangle(8);
        assertEquals(27.313, isocelesRightTriangle.getPerimeter(), 0.001);
    }

    @Test
    public void numberOfSides() {
        IsocelesRightTriangle isocelesRightTriangle = new IsocelesRightTriangle(8);
        assertEquals(3, isocelesRightTriangle.numberOfSides(), 0.0001);
    }
}