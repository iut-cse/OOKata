class ShapeList {
    public double[] sizes;
    public String[] types;
    public Shape s;

    public double totalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (types[i].equals("circle")){
                s = new Circle(sizes[i]);
            } else if (types[i].equals("square")){
                s = new Square(sizes[i]);
            }
            totalPerimeter += s.getPerimeter();
        }
        return totalPerimeter;
    }

    public double totalArea() {
        double totalArea = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (types[i].equals("circle")){
                s = new Circle(sizes[i]);
            } else if (types[i].equals("square")){
                s = new Square(sizes[i]);
            }
            totalArea += s.getArea();
        }
        return totalArea;
    }
}