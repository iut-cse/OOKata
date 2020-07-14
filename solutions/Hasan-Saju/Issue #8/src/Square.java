public class Square implements Shape{

    public double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        double perimeter=4*length;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area= length * length;
        return area;
    }

}
