import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;public class ShapeListTest
{
    @Test
    void testAll() {
        ShapeList shapeList = new ShapeList();
        shapeList.shapes = new Shape[]{new Square(10), new Square(5), new Circle(1)};

        Assertions.assertEquals(66.2832, shapeList.totalPerimeter());
        Assertions.assertEquals(128.1416, shapeList.totalArea());
    }
}
