public class Circle implements Shape {

    double radius;
    double PI = 3.1416;

    Circle (double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }
}
