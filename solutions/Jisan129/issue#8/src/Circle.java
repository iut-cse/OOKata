public class Circle extends Shape {
    private double radius;
    private double pi=3.1416;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }
}
