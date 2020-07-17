import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeList {
    Shape[] shape;

    public void setShapeTypeandSize(String[] types, double[] sizes){
        shape = new Shape[types.length];
        for(int i=0; i<types.length; i++){
           makeShape(types[i], sizes[i], i);
        }
    }

    private void makeShape(String types, double size, int i){
        if(types=="square") {
            shape[i] = new Square(size);
        }
        else {
            shape[i] = new Circle(size);
        }
    }

    public double totalPerimeter(){
        double totalPerimeter = 0;
        for(int i=0; i<shape.length; i++){
            totalPerimeter += shape[i].getPerimeter();
        }
        return totalPerimeter;
    }

    public double totalArea(){
        double totalArea = 0;
        for(int i=0; i<shape.length; i++){
            totalArea += shape[i].getArea();
        }
        return totalArea;
    }

}

// A test for ease of refactoring.
// No need to copy this part if you are not familiar with Unit Testing.

class ShapeListTest {
    @Test
    void testAll(){
        ShapeList shapeList = new ShapeList();
        shapeList.setShapeTypeandSize(new String[]{"square", "square", "circle"}, new double[]{10,5,1});
        Assertions.assertEquals(66.2832, shapeList.totalPerimeter());
        Assertions.assertEquals(128.1416, shapeList.totalArea());
    }
}