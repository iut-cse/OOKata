public class Circle implements Shape {

    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter()
    {
        double perimeter = 2 * 3.1416 *radius;
        return perimeter;
    }

    @Override
    public double getArea()
    {
        double area= 3.1416 * radius * radius;
        return area;
    }
}
