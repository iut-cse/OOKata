public class Circle implements Shape {
    double radius;


    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }
}
