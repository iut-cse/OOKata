public class Square extends Shape {
    private double lengthOfSide;

    public Square(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double getArea() {
        return lengthOfSide * lengthOfSide;
    }

    @Override
    public double getPerimeter() {
        return 4*lengthOfSide;
    }
}
