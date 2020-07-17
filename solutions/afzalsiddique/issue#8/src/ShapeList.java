class ShapeList {
    public double[] sizes;
    public String[] types;

    public double totalPerimeter=0;
    public double totalArea=0;
    public Shape shape;
    public Shape createShape(String type){
        if (type.equals("square"))
            shape = new Square();
        else if (type.equals("circle"))
            shape = new Circle();
        return  shape;
    }
    public double getTotalArea(){
        for (int i=0;i<sizes.length;i++) {
            Shape shape = createShape(types[i]);
            shape.setSize(sizes[i]);
            totalArea += shape.area();
        }
        return  totalArea;
    }
    public double getTotalPerimeter(){
        for (int i=0;i<sizes.length;i++) {
            Shape shape = createShape(types[i]);
            shape.setSize(sizes[i]);
            totalPerimeter += shape.perimeter();
        }
        return  totalPerimeter;
    }
}