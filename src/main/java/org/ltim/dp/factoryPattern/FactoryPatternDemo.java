package org.ltim.dp.factoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getInstance("circle");
        Shape shape2 = factory.getInstance("recTangle");
        Shape shape3 = factory.getInstance("SquarE");
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
