
package newpackage;

public class Circle extends Shape {

    public double[] sizes;

    Circle(double[] sizes) {
        this.sizes = sizes;
    }

    
    @Override
    double totalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < sizes.length; i++){
            totalPerimeter = (2 * 3.1416 * sizes[0]);
        }
        return totalPerimeter;
    }
    
    @Override
    double totalArea() {
        double totalArea = 0;
        for (int i = 0; i < sizes.length; i++){
            totalArea = (sizes[0] *3.1416 * sizes[0]);
        
        }
        return totalArea;
    }
}
