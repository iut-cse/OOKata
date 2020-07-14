public class Circle implements Shape {
    double radius;
    double pi = 3.1416;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * pi * radius;
    }

    public double getArea(){
        return pi * radius * radius;
    }
}
