public class ShapeList {
    public double[] sizes;

    double[] circleRadius;
    double[] squareSide;
    int squareSideIndex = 0;
    int circleRadiusIndex = 0;

    private double circleArea(double radius)
    {
        double area = Math.PI * radius * radius;
        return area;
    }

    private double squareArea(double squareSide)
    {
        double area = squareSide * squareSide;
        return area;
    }

    private double circlePerimeter (double radius)
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    private double squarePerimeter (double squareSide)
    {
        double perimeter = 4 * squareSide;
        return perimeter;
    }


    public double totalPerimeter()
    {
        double totalPerimeter = 0;
        double totalCirclePerimeter = 0;
        double totalSquarePerimeter = 0;

        for(int i = 0; i < squareSideIndex; i++)
        {
            totalSquarePerimeter = totalSquarePerimeter+ squarePerimeter(squareSide[i]);
        }

        for(int i = 0; i < circleRadiusIndex; i++)
        {
            totalCirclePerimeter = totalCirclePerimeter + circlePerimeter(circleRadius[i]);
        }

        totalPerimeter = totalCirclePerimeter + totalSquarePerimeter;

        return Math.round(totalPerimeter*100.0)/100.0;
    }

    public double totalArea()
    {
        double totalArea = 0;
        double totalcircleArea = 0;
        double totalsquareArea = 0;

        for(int i =0; i < squareSideIndex; i++)
        {
            totalsquareArea = totalsquareArea + squareArea(squareSide[i]);
        }

        for(int i =0; i < circleRadiusIndex; i++)
        {
            totalcircleArea = totalcircleArea + circleArea(circleRadius[i]);
        }

        totalArea = totalcircleArea + totalsquareArea;

        return Math.round(totalArea*100.0)/100.0
    }
}

