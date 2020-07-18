import java.util.ArrayList;

class ShapeList {
    ArrayList<Shape> shapes = new ArrayList<>();

    void add(Shape shape) {
        shapes.add(shape);
    }

    public double totalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.size(); i++) {
            totalPerimeter += shapes.get(i).calculatePerimeter();
        }

        return totalPerimeter;
    }

    public double totalArea() {
        double totalArea = 0;
        for (int i = 0; i < shapes.size(); i++) {
            totalArea += shapes.get(i).calculateArea();
        }

        return totalArea;
    }
}