class ShapeList {
    public double[] sizes;
    public String[] types;
    public Shape[] shapes;
    public double totalPerimeter=0;
    public double totalArea=0;
    public Shape shape;
    public void createShape(){
        for (int i=0;i<sizes.length;i++){
            if (types[i].equals("square"))
                shape = new Square(sizes[i]);
            else if (types[i].equals("circle"))
                shape = new Circle(sizes[i]);
            shapes[i] = shape;
        }
    }
    public double getTotalArea(){
        for (int i=0;i<sizes.length;i++) {
            totalArea += shapes[i].getArea();
        }
        return  totalArea;
    }
    public double getTotalPerimeter(){
        for (int i=0;i<sizes.length;i++) {
            totalPerimeter += shapes[i].getPerimeter();
        }
        return  totalPerimeter;
    }
}