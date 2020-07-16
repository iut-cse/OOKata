public class Square implements Shape {
    //MeasureShape measure = new MeasureShape();
    private double length;

    public Square(double length) {
        this.length = length;
    }

    double getLength() {
        return this.length;
    }

    public double getPerimeter() {
        return 4*this.length;
    }

    public double getArea() {
        return this.length*this.length;
    }
}

