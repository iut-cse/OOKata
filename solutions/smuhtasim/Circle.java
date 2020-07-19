package com.company;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateTotalPerimeter() {
        return 2* Math.PI* radius;
    }

    @Override
    public double calculateTotalArea() {
        return Math.PI*radius*radius;
    }
}
