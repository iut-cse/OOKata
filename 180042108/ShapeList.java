class ShapeList {
    public double[] sizes;
    public String[] types;
    public Shape shape;


    public void shapeDetails(String type, double size){
        this.types = types;

        if (this.types.equals("Circle"))
            shape = new Circle(size);
        else if(this.types.equals("Square"))
            shape = new Square(size);
    }

    public double totalPerimeter() {
        double totalP = 0;
        for (int i = 0; i < sizes.length; i++) {
            shapeDetails(types[i],sizes[i]);
            totalP = totalP + shape.totalPerimeter();
        }
        return totalP;
    }

    public double totalArea() {
        double totalP = 0;
        for (int i = 0; i < sizes.length; i++) {
            shapeDetails(types[i],sizes[i]);
            totalP = totalP + shape.totalArea();
        }
        return totalP;
    }
}