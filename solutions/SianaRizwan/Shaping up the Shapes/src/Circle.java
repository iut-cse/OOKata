public class Circle implements Shape {

    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter()
    {
        return  2 * 3.1416 *radius;

    }

    @Override
    public double getArea()
    {
        return 3.1416 * radius * radius;

    }
}