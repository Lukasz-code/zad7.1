package com.codilla.testing.shape;

import java.util.ArrayList;

interface Shape {

    String getShapeName();
    int getField();
}

public class ShapeCollector {

    private ArrayList<Shape> collectedShapes = new ArrayList<Shape>();

    public void addFigure (Shape shape) {
        collectedShapes.add(shape);
    }
    public void removeFigure (Shape shape) {
        collectedShapes.remove(shape);
    }
    public Shape getFigure (int n) {

       if (n > collectedShapes.size()){
           return null;
       } else if (n < 0){
           return null;
       } else {return collectedShapes.get(n);}
    }
    public int collectedShapesQuantity(){
        return collectedShapes.size();
    }

}