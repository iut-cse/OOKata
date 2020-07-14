public class Circle implements Shape {

    @Override
    public double getPerimeter(double radius)
    {
        double perimeter = 2 * 3.1416 *radius;
        return perimeter;
    }

    @Override
    public double getArea(double radius)
    {
        double area= 3.1416 * radius * radius;
        return area;
    }
}
