package Shape_solution;

public class ShapeList {
    double[] sizes;
    String[] types;
    double totalPerimeter =0;
    double totalArea =0;
    Shape shape;
    void Make_shape(){
        for(int i=0;i<sizes.length;i++){
            if(types[i]=="square"){
                shape = new Square(sizes[i]);
            }
            else if (types[i]=="circle"){
                shape =new Circle((sizes[i]));
            }
            Calculate_Total();
        }
    }
    void Calculate_Total(){
        totalArea=totalArea+shape.area ();
        totalPerimeter=totalPerimeter+shape.perimeter ();
    }
}

