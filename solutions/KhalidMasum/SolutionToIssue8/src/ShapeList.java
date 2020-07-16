
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeList {


    Shape[] shape;
    double totalPerimeter = 0;
    double totalArea = 0;

    public void setShapeTypeAndSize(String[] types, double[] sizes) {
        shape = new Shape[types.length];
        for (int i = 0; i < types.length; i++) {
            createShape(types[i], sizes[i], i);
        }
        calculateTotalArea();
        calculateTotalPerimeter();
    }


    public double getTotalPerimeter() {
        return totalPerimeter;
    }


    public double getTotalArea() {
        return totalArea;
    }


    private void createShape(String types, double size, int index) {
        if (types.equals("square")) {
            shape[index] = new Square(size);
        } else shape[index] = new Circle(size);
    }


    private void calculateTotalPerimeter() {
        for (Shape value : shape) {
            totalPerimeter += value.getPerimeter();
        }
    }


    private void calculateTotalArea() {
        for (Shape value : shape) {
            totalArea += value.getArea();
        }
    }
}


// A test for ease of refactoring.
// No need to copy this part if you are not familiar with Unit Testing.
class ShapeListTest {
    @Test
    void testAll() {
        ShapeList shapeList = new ShapeList();
        shapeList.setShapeTypeAndSize(new String[]{"square", "square", "circle"}, new double[]{10, 5, 1});
        Assertions.assertEquals(66.2831853071796, shapeList.getTotalPerimeter());
        Assertions.assertEquals(128.14159265358978, shapeList.getTotalArea());
    }
}
