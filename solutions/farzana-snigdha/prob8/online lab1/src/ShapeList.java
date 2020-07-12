import java.util.ArrayList;

public class ShapeList {
    ArrayList<Shape> shapes;

    public ShapeList(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public double totalPerimeter() {
        return calculateTotal(shapes, 1);
    }

    public double totalArea() {
        return calculateTotal(shapes, 2);
    }

    private double calculateTotal(ArrayList<Shape> shapes, int i) {
        double total = 0;
        for (int j = 0; j < shapes.size(); j++) {
            if (shapes.get(j) instanceof Square) {
                if (i == 1) {
                    total += shapes.get(j).perimeter();
                } else total += shapes.get(j).area();
            }
            if (shapes.get(j) instanceof Circle) {
                if (i == 1) {
                    total += shapes.get(j).perimeter();
                } else total += shapes.get(j).area();
            }
        }
        return total;
    }

    public static void main(String[] args) {

    }
}

