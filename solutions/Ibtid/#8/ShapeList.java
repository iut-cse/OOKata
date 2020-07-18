package newpackage;

class ShapeList {
    public double[] sizes;
    public String[] types;
    public int typeRegister = 0;
    
    Shape shape;

    
    void decideShapeType(){
        if(types[typeRegister].equals("Circle")) shape = new Circle(sizes);
        if(types[typeRegister].equals("Square")) shape = new Square(sizes);
        typeRegister++;
    }
    
    public double totalPerimeter() {
        decideShapeType();
        return shape.totalPerimeter();
    }

    public double totalArea() {
        decideShapeType();
        return shape.totalArea();
    }
}