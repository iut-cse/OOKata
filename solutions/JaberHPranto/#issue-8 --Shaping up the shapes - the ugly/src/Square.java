public class Square implements  Shape{
    private double length;
    public Square(double length) {
        this.length=length;
    }
    @Override
    public double area(){
        return (length*length);
    }

    @Override
    public double perimeter() {
        return (4*length);
    }

}
