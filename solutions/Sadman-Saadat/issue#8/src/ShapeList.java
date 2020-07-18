public class ShapeList {
    public double[] sizes;
    public String[] types;

    public Shape Type_of_Shape(String Shape_Name, double size){
         Shape shape = null;
         if(Shape_Name.equals("square"))
             shape = new Square(size);
         else if (Shape_Name.equals("circle"))
             shape = new Circle(size);

         return shape;
    }

    public double totalPerimeter() {
        double total_Perimeter = 0;
        for (int i = 0; i < sizes.length; i++) {
                Shape shape = Type_of_Shape(types[i], sizes[i]);
                total_Perimeter += shape.getPerimeter();
        }

        return total_Perimeter;
    }

    public double totalArea() {
        double total_Area = 0;
        for (int i = 0; i < sizes.length; i++) {
            Shape shape = Type_of_Shape(types[i], sizes[i]);
            total_Area += shape.getArea();
        }

        return total_Area;
    }
}

