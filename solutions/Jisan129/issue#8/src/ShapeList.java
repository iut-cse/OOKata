import java.util.ArrayList;

public class ShapeList {
    ArrayList<Shape> shapeList=new ArrayList<>();

    public void add(Shape shape){
        shapeList.add(shape);
    }
    public double getTotalArea(){
        double area=0;
         for (int i = 0; i < shapeList.size(); i++) {
            area+=shapeList.get(i).getArea();
        }
        return area;
    }  public double getTotalPerimeter(){
        double perimeter=0;
         for (int i = 0; i < shapeList.size(); i++) {
            perimeter+=shapeList.get(i).getArea();
        }
        return perimeter;
    }

}
