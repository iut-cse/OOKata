import java.lang.Math.*;
public class Circle extends Shape {

    public double sizes;

    Circle(double sizes) {
        this.sizes = sizes;
    }

    @Override
    double totalPerimeter() {

        return (2 * Math.PI * sizes);

    }

    @Override
    double totalArea() {

        return(sizes * Math.PI * sizes);

    }
}
