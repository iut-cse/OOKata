import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeList {

    private Shape[] shape;
    private double totalPerimeter = 0;
    private double totalArea = 0;
    private int totalNumberOfShapes = 0;

    ShapeList(int size) {
        shape = new Shape[size];
    }

    void addShape(Shape shape) {
        this.shape[totalNumberOfShapes] = shape;
        totalNumberOfShapes++;
        calculateTotalPerimeter();
        calculateTotalArea();
    }

    public double getTotalPerimeter() {
        return totalPerimeter;
    }


    public double getTotalArea() {
        return totalArea;
    }

    private int getLastInsertionPosition() {
        return totalNumberOfShapes - 1;
    }

    private void calculateTotalPerimeter() {
        totalPerimeter += shape[getLastInsertionPosition()].getPerimeter();
    }


    private void calculateTotalArea() {
        totalArea += shape[getLastInsertionPosition()].getArea();
    }
}


class ShapeListTest {
    @Test
    void testAll() {
        ShapeList shapeList = new ShapeList(10);
        shapeList.addShape(new Square(10));
        shapeList.addShape(new Square(5));
        shapeList.addShape(new Circle(1));
        Assertions.assertEquals(66.2831853071796, shapeList.getTotalPerimeter());
        Assertions.assertEquals(128.14159265358978, shapeList.getTotalArea());
    }
}
