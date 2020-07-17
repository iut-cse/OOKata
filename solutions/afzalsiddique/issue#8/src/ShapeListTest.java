import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeListTest {
    @Test
    void testAll() {
        ShapeList shapeList = new ShapeList();
        shapeList.sizes = new double[]{10, 5, 1};
        shapeList.types = new String[]{"square", "square", "circle"};
        shapeList.createShape();
        Assertions.assertEquals(66.2832, shapeList.getTotalPerimeter());
        Assertions.assertEquals(128.1416, shapeList.getTotalArea());
    }
}