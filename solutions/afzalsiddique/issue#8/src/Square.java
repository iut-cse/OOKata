public class Square implements Shape{
    public double size;
    //    Square(double size)
//    {
//        this.size = size;
//    }
    public void setSize(double size) {
        this.size = size;
    }
    public double perimeter(){
        return 4*size;
    }
    public double area(){
        return size*size;
    }
}