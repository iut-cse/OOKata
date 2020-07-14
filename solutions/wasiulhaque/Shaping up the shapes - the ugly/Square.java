public class Square implements Shape {
    double length;

    public Square(double length){
        this.length = length;
    }

    public double getPerimeter(){
        return 4 * length;
    }

    public double getArea(){
        return length * length;
    }
}
