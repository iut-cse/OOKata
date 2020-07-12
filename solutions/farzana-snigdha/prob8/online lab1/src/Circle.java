public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public double area() {
        return Math.PI*getRadius()*getRadius();
    }
}
