package org.ltim.dp.factoryPattern;

public class ShapeFactory {
    public Shape getInstance(String shapeType){

        switch (shapeType.toUpperCase()){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                System.out.println("Provide valid input type");
                return null;
        }
    }
}
