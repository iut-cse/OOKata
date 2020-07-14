public class Square implements Shape{

  /*  double length;
    public Square(double length) {
        this.length=length;
    }*/

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
