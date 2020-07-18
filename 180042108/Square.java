public class Square extends Shape{

    public double sizes;

    Square(double sizes) {
        this.sizes = sizes;
    }

    @Override
    double totalPerimeter() {
        double totalPerimeter = 0;
        totalPerimeter = (4* sizes);
        return totalPerimeter;
    }

    @Override
    double totalArea() {
        double totalArea = 0;
        totalArea = (sizes * sizes);
        return totalArea;
    }

}