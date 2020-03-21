import java.util.ArrayList;



interface Shape{
    public double perimeter();
    public double Area();
}


class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double perimeter() {
        return (4 * getLength());
    }

    public double Area() {
        return this.getLength() * this.getLength();
    }
}



class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double perimeter() {
        return (2 * Math.PI * getRadius());
    }


    public double Area() {
        return Math.PI * this.getRadius()* this.getRadius();
    }

}

class ShapeList {
    ArrayList<Shape> shapes;

    public ShapeList(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public double totalPerimeter() {
        return calculate(shapes, true);
    }

    public double totalArea() {
        return calculate(shapes, false);

    }


    public double calculate(ArrayList<Shape> shapes, boolean flag) {

        double total = 0;
        for (Shape shape : shapes) {


            if (shape instanceof Square) {
                if (flag) {
                    total += ((Square) shape).perimeter();
                } else total += ((Square) shape).Area();
            } else if (shape instanceof Circle) {
                if (flag) {
                    total += ((Circle) shape).perimeter();
                } else {
                    total += ((Circle) shape).Area();
                }
            }


        }

        return total;


    }


}

