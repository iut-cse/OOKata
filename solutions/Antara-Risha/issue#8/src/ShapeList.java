public class ShapeList {
    public shape[] shapes;

    public double getTotalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalPerimeter = totalPerimeter + shapes[i].getPerimeter();
        }
        return totalPerimeter;
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (int j = 0; j < shapes.length; j++) {
            totalArea = totalArea + shapes[j].getArea();
        }
        return totalArea;
    }
}
