public class ShapeList {

    public double[] sizes;
    public String[] types;

    public double totalPerimeter() {
        double total = 0;
        for (int i = 0; i < sizes.length; i++) {
            Shape myShape=getShapeType(types[i], sizes[i]);
            total+=myShape.perimeter();
        }
        return total;
    }

    public double totalArea() {
        double total = 0;
        for (int i = 0; i < sizes.length; i++) {
            Shape myShape=getShapeType(types[i], sizes[i]);
            total+=myShape.area();
        }
        return total;
    }

    public Shape getShapeType(String shapeType, double size){
        Shape shape = null;
        if(shapeType=="square")
            shape=new Square(size);
        else if(shapeType=="circle")
            shape=new Circle(size);
        return  shape;
    }


}
