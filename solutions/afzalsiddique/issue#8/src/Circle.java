import java.nio.channels.Pipe;

public class Circle implements Shape{
    double radius;
    static double PIE = 3.1416;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2 * PIE * radius;
    }
    public double getArea(){
        return PIE * radius * radius;
    }
}