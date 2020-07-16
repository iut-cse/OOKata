public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI*radius*radius);
    }

    @Override
    public double perimeter() {
        return (2*Math.PI*radius);
    }
}
