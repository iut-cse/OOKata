package Shape_solution;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*radius*3.1416;
    }

    @Override
    public double area() {
        return radius*radius*3.1416;
    }
}
