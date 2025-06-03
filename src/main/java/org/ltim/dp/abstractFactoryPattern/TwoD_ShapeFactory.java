package org.ltim.dp.abstractFactoryPattern;

public class TwoD_ShapeFactory implements AbstractShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                System.out.println("Provide valid input type");
                return null;
        }
    }
}
