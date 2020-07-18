public class ShapeList {
    public Shape[] shapes;

    public double totalPerimeter() {
        double total = 0;
        for (Shape shape: shapes)
        {
            total+=shape.perimeter();
        }

        return total;
}
    public double totalArea() {
        double total = 0;
        for (Shape shape: shapes
        ) {
            total+=shape.area();
        }

        return total;
    }
}

