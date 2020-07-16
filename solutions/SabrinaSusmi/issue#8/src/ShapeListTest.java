import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class ShapeListTest {
    @Test
    public void testAll(){
        Shape square1 = new Square(10);
        Shape square2 = new Square(5);
        Shape circle1 = new Circle(1);

        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(square1);
        list.add(circle1);
        list.add(square2);


        ShapeList shapeList = new ShapeList(list);

        Assertions.assertEquals(66.2831853071796, shapeList.totalPerimeter());
        Assertions.assertEquals(128.14159265358978, shapeList.totalArea());
    }

}
