package org.ltim.dp.abstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractShapeFactory twoDShapeFactory = ShapeFactoryProducer.getFactory("2d");
        Shape circle = twoDShapeFactory.getShape("circle");
        Shape square = twoDShapeFactory.getShape("square");
        circle.draw();
        square.draw();

        AbstractShapeFactory threeDShapeFactory = ShapeFactoryProducer.getFactory("3D");
        Shape sphere = threeDShapeFactory.getShape("Sphere");
        Shape cube = threeDShapeFactory.getShape("Cube");
        sphere.draw();
        cube.draw();
    }
}
