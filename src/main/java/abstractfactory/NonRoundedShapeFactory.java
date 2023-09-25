package abstractfactory;

public class NonRoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        Shape shape = null;
        switch (type) {
            case "Square":
                shape = new Square();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            default:
                shape = new Square();
                break;
        }
        return shape;
    }
}
