import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void test() {
        ShapeList shapeList = new ShapeList();
        shapeList.add(new Square(5.0));

        Assertions.assertEquals(25.00, shapeList.getTotalArea());
    }
}