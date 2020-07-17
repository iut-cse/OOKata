public class Circle implements Shape{
    public double size;
//    public Circle(double size) {
//        this.size = size;
//    }

    public void setSize(double size) {
        this.size = size;
    }
    public double perimeter(){
        return 2*3.1416*size;
    }
    public double area(){
        return 3.1416 * size * size;
    }
}