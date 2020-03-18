import java.util.ArrayList;

class Square {
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



class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double peremeter() {
        return (2 * Math.PI * getRadius());
    }


    public double Area() {
        return Math.PI * this.getRadius()* this.getRadius();
    }

}

class ShapeList {
    ArrayList<Object> shapes;

    public ShapeList(ArrayList<Object> shapes) {
        this.shapes = shapes;
    }

    public double totalPeremeter() {
        return calculate(shapes, true);
    }

    public double totalArea() {
        return calculate(shapes, false);

    }


    public double calculate(ArrayList<Object> shapes, boolean flag) {

        double total = 0;
        for (Object shape : shapes) {


            if (shape instanceof Square) {
                if (flag) {
                    total += ((Square) shape).perimeter();
                } else total += ((Square) shape).Area();
            } else if (shape instanceof Circle) {
                if (flag) {
                    total += ((Circle) shape).peremeter();
                } else {
                    total += ((Circle) shape).Area();
                }
            }


        }

        return total;


    }


}

