package factory;

import abstractfactory.Circle;
import abstractfactory.Eclipse;
import abstractfactory.Shape;

public class ShapeFactory {
    static Shape getShape(String type) {
        Shape shape = null;
        switch (type) {
            case "Circle":
                shape = new abstractfactory.Circle();
                break;
            case "Eclipse":
                shape = new Eclipse();
                break;
            default:
                shape = new Circle();
        }
        return shape;
    }
}
