import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

// A test for ease of refactoring.
// No need to copy this part if you are not familiar with Unit Testing.
public class UnitShape {
    @Test
    void testAll() {

        Circle cc;
        Square sqq;


        Square sq1 = new Square(10);
        Square sq2 = new Square(5);
        Circle c = new Circle(1);


        ArrayList<Shape> Alist = new ArrayList<Shape>(5);

        Alist.add(sq1);
        Alist.add(sq2);
        Alist.add(c);


        ShapeList shapeList = new ShapeList(Alist);

        Assertions.assertEquals(66.2831853071796, shapeList.totalPerimeter());
        Assertions.assertEquals(128.14159265358978, shapeList.totalArea());

    }
}