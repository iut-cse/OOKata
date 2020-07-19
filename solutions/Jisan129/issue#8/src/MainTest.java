import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    DecimalFormat dec = new DecimalFormat("#0.00"); //to set the precision of the answer

    @Test
    void testCircle() {
        ShapeList shapeList = new ShapeList();
        shapeList.add(new Circle(5.0));
        Assertions.assertEquals(dec.format(25.00*3.1416), dec.format(shapeList.getTotalArea()));
        Assertions.assertEquals(dec.format(2*3.1416*5.00),dec.format(shapeList.getTotalPerimeter()));
    }
    @Test
    void testSquare(){
        ShapeList shapeList=new ShapeList();
        shapeList.add(new Square(5.00));
        Assertions.assertEquals(dec.format(5.00*5.00),dec.format(shapeList.getTotalArea()));
        Assertions.assertEquals(dec.format(4*5.00),dec.format(shapeList.getTotalPerimeter()));
    }

}