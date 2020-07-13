class ShapeList {
    public double[] sizes;
    public String[] types;

    Square square = new Square();
    Circle circle = new Circle();

    public double totalPerimeter() {
        double total = 0;
        for (int i = 0; i < sizes.length; i++) {

            if ( check(types[i]) )
                total += square.getPerimeter(sizes[i]);
            else
                total += circle.getPerimeter(sizes[i]);
        }

        return total;
    }

    public double totalArea() {
        double total = 0;
        for (int i = 0; i < sizes.length; i++) {

            if ( check(types[i]) )
                total += square.getArea(sizes[i]);
            else
                total += circle.getArea(sizes[i]);
        }

        return total;
    }

    public boolean check(String shape)
    {
        if(shape=="square")
            return true;
        else
            return false;
    }
}