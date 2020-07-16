public class Square implements Shape {
    short NUMBER_OF_ARMS = 4;
    double sizeOfOneArm;

    Square(double sizeOfOneArm) {
        this.sizeOfOneArm = sizeOfOneArm;
    }

    @Override
    public double getArea() {
        return sizeOfOneArm * sizeOfOneArm;
    }

    @Override
    public double getPerimeter() {

        return NUMBER_OF_ARMS * sizeOfOneArm;
    }


}
