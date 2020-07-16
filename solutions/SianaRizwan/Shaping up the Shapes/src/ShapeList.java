public class ShapeList {
    public double[] sizes;
    public String[] types;
    public Shape shape;
    public Shape getShape(String type, double size) {
        if (type.equals("circle")) {
            shape = new Circle(size);
        } else if (type.equals("square")) {
            shape = new Square(size);
        }
        return shape;
    }


    public double totalPerimeter() {
        double total = 0;
        for (int i = 0; i < sizes.length; i++) {
            getShape(types[i],sizes[i]);
            total += shape.getPerimeter();
        }
        return total;
    }

    public double totalArea() {
        double total = 0;
        for (int i = 0; i < sizes.length; i++) {
            getShape(types[i],sizes[i]);
            total += shape.getArea();
        }
        return total;
    }


}


