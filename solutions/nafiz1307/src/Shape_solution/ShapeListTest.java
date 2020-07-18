package Shape_solution;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class ShapeListTest {
    @Test
    public void testAll() {
        ShapeList shapeList = new ShapeList();
        shapeList.sizes = new double[]{10, 5, 1};
        shapeList.types = new String[]{"square", "square", "circle"};
        shapeList.Make_shape();

        Assertions.assertEquals(66.2832, shapeList.totalPerimeter);
        Assertions.assertEquals(128.1416, shapeList.totalArea);
    }

}
