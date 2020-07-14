class ShapeList {
    public Shape[] shapes;

    public double totalPerimeter() {
        double total = 0;
        for (int i = 0; i < shapes.length; i++)

            total += shapes[i].getPerimeter();

        return total;
    }

    public double totalArea() {
        double total = 0;
       for (int i = 0; i < shapes.length; i++)

            total += shapes[i].getArea();

        return total;
    }


    public Shape addShape(String objectType, double length)
    {
        Shape shape;
        if(objectType=="square")
            shape = new Square(length) ;
        else
            shape = new Circle(length);
        return  shape;
    }

}