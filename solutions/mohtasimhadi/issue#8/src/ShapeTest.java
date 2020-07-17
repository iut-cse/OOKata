import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ShapeTest{
    @Test
    void testAll() {
        ShapeList shapeList = new ShapeList();
        shapeList.sizes = new double[]{10, 5, 1};
        shapeList.types = new String[]{"square", "square", "circle"};

        Assertions.assertEquals(66.2831853071796, shapeList.totalPerimeter());
        Assertions.assertEquals(128.14159265358978, shapeList.totalArea());
    }
}