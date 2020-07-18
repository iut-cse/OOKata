public class Square implements Shapes{

    double length;

    Square(double length){
        this.length = length;
    }


    @Override
    public double perimeter() {
        return 4 * length;
    }

    @Override
    public double area() {
        return length * length;
    }
}
