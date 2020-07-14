class ShapeList {
    public double[] sizes;
    public String[] types;
    public Shape s;

    public double totalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < sizes.length; i++) {
            getShape(types[i],sizes[i]);
            totalPerimeter += s.getPerimeter();
        }
        return totalPerimeter;
    }

    public double totalArea() {
        double totalArea = 0;
        for (int i = 0; i < sizes.length; i++) {
            getShape(types[i],sizes[i]);
            totalArea += s.getArea();
        }
        return totalArea;
    }

    public Shape getShape(String type, double size) {
        if (type.equals("circle")) {
            s = new Circle(size);
        } else if (type.equals("square")) {
            s = new Square(size);
        }
        return s;
    }
}