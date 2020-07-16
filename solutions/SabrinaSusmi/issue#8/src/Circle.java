public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getLength() {
        return this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
