class ShapeList {
    double[] sizes;
    String[] types;

    public double totalPerimeter(){
        double totalPerimeter = 0;
        for(int i=0; i < sizes.length; i++){
            Shape shape = shapeType(types[i], sizes[i]);
            totalPerimeter += shape.perimeter();
        }
        return totalPerimeter;
    }

    public double totalArea(){
        double totalArea = 0;
        for(int i=0; i < sizes.length; i++){
            Shape shape = shapeType(types[i], sizes[i]);
            totalArea += shape.area();
        }
        return totalArea;
    }

    public Shape shapeType(String shapeName, double size){
        Shape shape = null;
        if(shapeName.toLowerCase() == "square"){
            shape = new Square(size);
        }
        else if(shapeName.toLowerCase() == "circle"){
            shape = new Circle(size);
        }
        return shape;
    }

}
