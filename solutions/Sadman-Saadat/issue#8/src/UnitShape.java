import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitShape {
    @Test
    void testAll(){
        ShapeList shapeList = new ShapeList();
        shapeList.sizes = new double[]{10, 5, 1};
        shapeList.types = new String[]{"square", "square", "circle"};

        Assertions.assertEquals(66.283185307, shapeList.totalPerimeter());
        Assertions.assertEquals(128.141592653, shapeList.totalArea());
    }
}
