package org.ltim.dp.abstractFactoryPattern;

public class ThreeD_ShapeFactory implements AbstractShapeFactory{

    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType.toUpperCase()) {
            case "SPHERE":
                return new Sphere();
            case "CUBE":
                return new Cube();
            default:
                System.out.println("Provide valid input type");
                return null;
        }
    }
}
