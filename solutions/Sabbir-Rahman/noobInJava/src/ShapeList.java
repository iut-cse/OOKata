import java.text.DecimalFormat;

public class ShapeList {

    public double[] sizes;
    public double[] triangleSides;
    public double[] rectangleSides;
    public double[] quadSides;
    public String[] types;

    double[] circleRadius;
    double[] squareArm;
    int squareArmIndex =0;
    int circleRadiusIndex = 0;



    void refine()
    {
        circleRadius = new double[sizes.length];
        squareArm = new double[sizes.length];
        for(int i=0; i<sizes.length; i++)
        {
            if(sizes[i]<0)
                System.out.println("You put a negative lenth we give you result by considering it positive");

            if(types[i].toLowerCase().equals("square"))
            {
                squareArm [squareArmIndex] = Math.abs(sizes[i]);
                //if user put - unintentionally dont't worry
                squareArmIndex++;
            }

            else if(types[i].toLowerCase().equals("circle"))
            {
                circleRadius [circleRadiusIndex] = Math.abs(sizes[i]);
                //if user put - unintentionally dont't worry
                circleRadiusIndex++;
            }

            else
                System.out.println("Please check!! you enter a invalid shape at "+i+" index of your input \n");
        }
    }



    private double circleArea(double radius)
    {
        double area = Math.PI * (radius * radius);
        return area;
    }

    private double squareArea(double squareArm)
    {
        double area =  squareArm*squareArm;
        return area;
    }

    private double triangleArea(double a,double b,double c)
    {
        double halfPerimeter = (a+b+c)/2;
        double area = Math.sqrt(halfPerimeter*(halfPerimeter -a)*(halfPerimeter-b)*(halfPerimeter-c));
        return area;
    }

    private double trianglePerimeter(double a,double b,double c)
    {
        double perimeter = a + b + c;
        return perimeter;
    }

    private double circlePerimeter(double radius)
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    private double squarePerimeter(double arm)
    {
        double perimeter = 4 * arm;
        return perimeter;
    }

    private double rectanglePerimeter(double lenth,double width)
    {
        double perimeter = 2*(lenth + width);
        return perimeter;
    }

    private double rectangleArea(double lenth,double width)
    {
        double area = lenth * width;
        return area;
    }

    private double quadPerimeter(double a,double b, double c,double d)
    {
        double perimeter = a + b + c + d;
        return perimeter;
    }




    public double totalPerimeter() {
        double totalPerimeter = 0;
        // unique shape perimeter will be calculating because if we need only totalSquarePerimeter then we can use it
        double totalCirclePerimeter = 0;
        double totalSquarePerimeter = 0;
        double totalTrianglePerimeter = 0;
        double totalRectanglePerimeter = 0;
        double totalQuadPerimeter = 0;

        refine();//refine is called to devide size according to its shape

        //square section
        for(int i=0;i<squareArmIndex;i++)
        {
            totalSquarePerimeter = totalSquarePerimeter+ squarePerimeter(squareArm[i]);
            //quadranglePerimeter() is called because square is also a quadranglePerimeter
        }


        //circle section
        for(int i =0 ;i<circleRadiusIndex;i++)
        {
            totalCirclePerimeter = totalCirclePerimeter + circlePerimeter(circleRadius[i]);
        }


        //triangle section
        for (int i=0 ;i<triangleSides.length;i=i+3)//3 sides input triangle
        {
            if( triangleSides[i]<0 || triangleSides[i+1]<0 || triangleSides[i+2]<0)
                System.out.println("You put a negative lenth we give you result by considering it positive");

            totalTrianglePerimeter = totalTrianglePerimeter + trianglePerimeter(Math.abs(triangleSides[i]),Math.abs(triangleSides[i+1]),Math.abs(triangleSides[i+2]));//if user also put - no problem
        }


        //rectangle section
        for(int i=0 ;i<rectangleSides.length;i=i+2)//+2 as two sides(lenth,width) input
        {
            if(rectangleSides[i]<0 || rectangleSides[i+1]<0)
                System.out.println("You put a negative lenth we give you result by considering it positive");

            totalRectanglePerimeter = totalRectanglePerimeter + rectanglePerimeter(Math.abs(rectangleSides[i]),Math.abs(rectangleSides[i+1]));
        }



        //quad section
        for(int i=0 ;i<quadSides.length;i=i+4)//+4 for four sides input
        {
            if(quadSides[i]<0 || quadSides[i+1]<0 || quadSides[i+2]<0 || quadSides[i+3]<0)
                System.out.println("You put a negative lenth we give you result by considering it positive");

            totalQuadPerimeter = totalQuadPerimeter + quadPerimeter(Math.abs(quadSides[i]),Math.abs(quadSides[i+1]),Math.abs(quadSides[i+2]),Math.abs(quadSides[i+3]));
        }




        totalPerimeter = totalCirclePerimeter + totalSquarePerimeter + totalTrianglePerimeter + totalRectanglePerimeter + totalQuadPerimeter;



        return Math.round(totalPerimeter*10000.0)/10000.0;//round till 4 digit
    }



    public double totalArea() {
        double totalArea = 0;
        double totalcircleArea = 0;
        double totalsquareArea = 0;
        double totaltriangleArea = 0;
        double totalrectangleArea = 0;


        //for square
        for(int i =0 ;i<squareArmIndex;i++)
        {
            totalsquareArea = totalsquareArea + squareArea(squareArm[i]);
        }

        //for circle
        for(int i =0 ;i<circleRadiusIndex;i++)
        {
            totalcircleArea = totalcircleArea + circleArea(circleRadius[i]);
        }


        //triangle section
        for(int i=0;i<triangleSides.length;i=i+3)//3 side input triangle
        {
            //yellow warning for put --
            if( triangleSides[i]<0 || triangleSides[i+1]<0 || triangleSides[i+2]<0)
                System.out.println("You put a negative lenth we give you result by considering it positive");

            totaltriangleArea = totaltriangleArea + triangleArea(Math.abs(triangleSides[i]),Math.abs(triangleSides[i+1]),Math.abs(triangleSides[i+2]));
        }



        //for rectangle
        for(int i=0;i<rectangleSides.length;i=i+2)//+2 as (lenth,width) input
        {
            if(rectangleSides[i]<0 || rectangleSides[i+1]<0)
                System.out.println("You put a negative lenth we give you result by considering it positive");

            totalrectangleArea = totalrectangleArea + rectangleArea(Math.abs(rectangleSides[i]),Math.abs(rectangleSides[i+1]));
        }


        totalArea = totalcircleArea + totalsquareArea + totaltriangleArea+totalrectangleArea;


        return Math.round(totalArea*10000.0)/10000.0;//round till 4 digit
    }

}
