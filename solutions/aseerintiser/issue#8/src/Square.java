public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    double calculateArea() {
        return length*length;
    }

    @Override
    double calculatePerimeter() {
        return 4*length;
    }
}
