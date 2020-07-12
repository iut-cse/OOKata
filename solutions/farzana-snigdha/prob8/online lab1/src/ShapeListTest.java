import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ShapeListTest {
    @Test
    void testAll() {
        ArrayList<Shape> arrayList=new ArrayList<>(3);
        arrayList.add(new Square(10));
        arrayList.add(new Square(5));
        arrayList.add(new Circle(1));

        ShapeList shapeList=new ShapeList(arrayList);

        Assertions.assertEquals(66.2831853071796, shapeList.totalPerimeter());
        Assertions.assertEquals(128.14159265358978, shapeList.totalArea());
    }
}