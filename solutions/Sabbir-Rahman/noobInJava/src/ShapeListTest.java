import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeListTest {

    @Test
    void testAll() {
        ShapeList shapeList = new ShapeList();

        shapeList.types = new String[]{"square", "Square", "Circle"};//only for shape with single sides
        shapeList.sizes = new double[]{10, -5, 1};//- put intentionally to check yellow warning

        shapeList.triangleSides = new double[]{5,6,5};//write three sides of triangle continuousely
        shapeList.rectangleSides = new double[]{10,6,5,6};//write lenth and width sides of triangle continuousely

        shapeList.quadSides = new double[]{1,2,3,4};//write 4 sides of the quad this is specially for that quad which is not rectangle not square


//        shapeList.types = new String[]{"square", "Square", "Cle"};//check  warning for wrong input with type



//        Assertions.assertEquals(66.2832, shapeList.totalPerimeter());
//        Assertions.assertEquals(128.1416, shapeList.totalArea());

//        Assertions.assertEquals(66.2832+16, shapeList.totalPerimeter());//16 for triangle check
//        Assertions.assertEquals(128.1416+12, shapeList.totalArea());//12 for triangle check

//        Assertions.assertEquals(66.2832+16+54, shapeList.totalPerimeter());//54 for rectangle check
//        Assertions.assertEquals(128.1416+12+90, shapeList.totalArea());//90 for rectangle check

        Assertions.assertEquals(66.2832+16+54+10, shapeList.totalPerimeter());//10 for quad perimeter check
        Assertions.assertEquals(128.1416+12+90, shapeList.totalArea());

        //there is still chance of improve we not check triangle,rectangle and quad sixe lenth input is valid or not


    }

}
