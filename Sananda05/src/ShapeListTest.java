
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeListTest {

    @Test
    void testAll() {
        ShapeList shapeList = new ShapeList();
        shapeList.sizes = new double[]{10, 5, 1};
        shapeList.types = new String[]{"square", "square", "circle"};

        Assertions.assertEquals(128.14, shapeList.TotalArea());

        Assertions.assertEquals(66.28, shapeList.TotalPerimeter());

    }
}
