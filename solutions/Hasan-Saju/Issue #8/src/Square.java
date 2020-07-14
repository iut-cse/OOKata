public class Square implements Shape{

    @Override
    public double getPerimeter(double length) {
        double perimeter=4*length;
        return perimeter;
    }

    @Override
    public double getArea(double length) {
        double area= length * length;
        return area;
    }

}
