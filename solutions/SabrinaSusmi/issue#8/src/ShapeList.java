import java.util.ArrayList;

public class ShapeList {
    ArrayList<Shape> list = new ArrayList<Shape>();
    public ShapeList(ArrayList<Shape> list) {
        this.list = list;
    }

    double totalPerimeter() {
        double total = 0;
        for (Shape shape : list) {
            total += shape.getPerimeter();
        }
        return total;
    }

    double totalArea() {
        double total = 0;
        for (Shape shape : list) {
            total += shape.getArea();
        }
        return total;
    }

}

