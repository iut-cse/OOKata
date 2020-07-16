abstract class Shape {

    abstract double Area() ;
    abstract double Perimeter();
}

class Square extends Shape {
    double length;

    public Square(double length){
        this.length=length;
    }
    public double Area() {
        return (length*length);
    }
    double Perimeter() {
        return (4*length);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public double Area() {
        return (radius*radius*3.14);
    }
    double Perimeter() {
        return (radius*2*3.14);
    }
}

class ShapeList {
    public double[] sizes;
    public String[] types;
    double total = 0;

    public double TotalArea() {

        for (int i = 0; i < types.length; i++) {
            if (types[i] == "square") {
                Square square = new Square(sizes[i]);
                total += square.Area();
            } else if (types[i] == "circle") {
                Circle circle = new Circle(sizes[i]);
                total += circle.Area();
            }
        }
        return total;
    }

    public double TotalPerimeter() {
        double total = 0;
        for (int i = 0; i < types.length; i++) {
            if (types[i] == "square") {
                Square square = new Square(sizes[i]);
                total += square.Perimeter();
            } else if (types[i] == "circle") {
                Circle circle = new Circle(sizes[i]);
                total += circle.Perimeter();
            }
        }
        return total;
    }
}

