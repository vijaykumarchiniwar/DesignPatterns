package abstractfactory;

public class RoundedNonRoundedShape extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        Shape shape = null;
        switch (type) {
            case "Circle":
                shape = new Circle();
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
