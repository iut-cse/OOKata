public class Circle implements Shape {
    double radius;
    double Pi = 3.14159265;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Pi * radius;
    }

    @Override
    public double getArea(){
        return Pi * radius * radius;
    }
}

