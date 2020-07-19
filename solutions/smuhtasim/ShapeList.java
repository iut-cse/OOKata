package com.company;

public class ShapeList {
    public double[] sideLengthOfShape;
    public String[] shapeType;
    double totalPerimeter = 0;
    double totalArea = 0;


    public void total(){
        for(int i = 0; i < sideLengthOfShape.length; i++){
            Shape shape = null;
            if (shapeType[i] == "square")
                shape = new Square(sideLengthOfShape[i]);
            else if (shapeType[i] == "circle")
                shape = new Circle(sideLengthOfShape[i]);
            totalArea += shape.calculateTotalArea();
            totalPerimeter += shape.calculateTotalPerimeter();
        }
    }

}
