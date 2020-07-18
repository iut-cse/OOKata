public class Circle implements Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter(){

        return 2*3.1416*radius;

    }

    public double area(){

        return 3.1416 * radius * radius;

    }
}