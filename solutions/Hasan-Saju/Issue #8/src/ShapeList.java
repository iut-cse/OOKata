class ShapeList {
    public double[] sizes;
    public String[] types;
    Shape shape;


    public double totalPerimeter() {
        double total = 0;
        for (int i = 0; i < sizes.length; i++) {

            shape=getShape(types[i]);
            total += shape.getPerimeter(sizes[i]);

        }
        return total;
    }

    public double totalArea() {
        double total = 0;
        for (int i = 0; i < sizes.length; i++) {

            shape=getShape(types[i]);
            total += shape.getArea(sizes[i]);

        }
        return total;
    }


    private Shape getShape(String objectType)
    {
        Shape shape;
        if(objectType=="square")
            shape = new Square() ;
        else
            shape = new Circle();
        return  shape;
    }

}