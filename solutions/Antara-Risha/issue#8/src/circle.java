public class circle implements shape{
    double radius;
    public  circle (double radius){
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.1416*radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.1416;
    }
}
