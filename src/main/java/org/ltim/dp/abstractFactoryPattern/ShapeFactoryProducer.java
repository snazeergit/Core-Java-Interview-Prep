package org.ltim.dp.abstractFactoryPattern;

public class ShapeFactoryProducer {
    public static AbstractShapeFactory getFactory(String dimension){
        if(dimension.equalsIgnoreCase("2D"))
            return new TwoD_ShapeFactory();
        if (dimension.equalsIgnoreCase("3D"))
            return new ThreeD_ShapeFactory();
        return null;
    }
}
