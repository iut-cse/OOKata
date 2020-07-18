package newpackage;

public class Square extends Shape{
    
    public double[] sizes;

    Square(double[] sizes) {
        this.sizes = sizes;
    }
    
    @Override
    double totalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < sizes.length; i++) {
            totalPerimeter = (4* sizes[i]);
        }

        return totalPerimeter;
    }
    
    @Override
    double totalArea() {
        double totalArea = 0;
        for (int i = 0; i < sizes.length; i++) {
            totalArea = (sizes[i] * sizes[i]);
        }

        return totalArea;
    }

}
