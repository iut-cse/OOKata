import java.util.List;

public class ShapeList {

    public Shapes[] shapeList;

    public double totalPerimeter(){

        double perimeter = 0;
        for(int i=0; i<shapeList.length; i++){
            perimeter += shapeList[i].perimeter();
        }
        return perimeter;
    }


    public double totalArea(){

        double area = 0;
        for(int i=0; i<shapeList.length; i++){
            area += shapeList[i].area();
        }
        return area;
    }


}
