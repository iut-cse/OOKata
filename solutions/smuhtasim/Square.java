package com.company;

public class Square implements Shape {
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateTotalArea() {
        return sideLength*sideLength;
    }

    @Override
    public double calculateTotalPerimeter() {
        return 4*sideLength;
    }
}
