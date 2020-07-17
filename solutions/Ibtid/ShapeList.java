package newpackage;

class ShapeList {
    public double[] sizes;
    public String[] types;
    
    Shape shape;

    
    ShapeList(String[] types){
        this.types = types;
        if(this.types.equals("Circle")) shape = new Circle(sizes);
        if(this.types.equals("Square")) shape = new Square(sizes);
    }
    
    
    public double totalPerimeter() {
        return shape.totalPerimeter();
    }

    public double totalArea() {
        return shape.totalArea();
    }
}