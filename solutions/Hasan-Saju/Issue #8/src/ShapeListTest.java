import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeListTest {
    @Test
    void testAll() {

        ShapeList shapeList = new ShapeList();
        Shape shape1,shape2,shape3;

        shape1=shapeList.addShape("square",10);
        shape2=shapeList.addShape("square",5);
        shape3=shapeList.addShape("circle",1);

        shapeList.shapes=new Shape[]{shape1,shape2,shape3};

        Assertions.assertEquals(66.2832, shapeList.totalPerimeter());
        Assertions.assertEquals(128.1416, shapeList.totalArea());
    }
}
