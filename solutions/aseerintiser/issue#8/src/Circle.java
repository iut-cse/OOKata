public class Circle extends Shape {
    private double radius;
    private double pi = 3.1416;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return pi * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * pi * radius;
    }
}
