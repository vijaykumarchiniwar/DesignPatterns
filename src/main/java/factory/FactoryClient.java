package factory;

import abstractfactory.Shape;

public class FactoryClient {
    public static void main(String args[]) {
        Shape shape = ShapeFactory.getShape("Rectangle");
        shape.render();

        shape = ShapeFactory.getShape("Eclipse");
        shape.render();
    }
}
