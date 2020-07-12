public class Square extends Shape{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }


    @Override
    public double perimeter() {
        return 4*getLength();
    }

    @Override
    public double area() {
        return getLength()*getLength();
    }
}
