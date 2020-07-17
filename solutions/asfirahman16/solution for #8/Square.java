public class Square implements Shape {

    int Number_of_Sides = 4;
    double Sizeof_One_Side;

    Square(double Sizeof_One_Side){
        this.Sizeof_One_Side = Sizeof_One_Side;
    }
    @Override
    public double getArea(){
        return Sizeof_One_Side*Sizeof_One_Side;
    }

    @Override
    public double getPerimeter() {
        return Number_of_Sides*Sizeof_One_Side;
    }
}
