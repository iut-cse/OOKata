public class square implements shape{
    double length;
    public square(double length)
    {
        this.length=length;
    }
    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
