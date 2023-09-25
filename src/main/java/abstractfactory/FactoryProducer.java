package abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean flag) {
        if (flag) {
            return new RoundedNonRoundedShape();
        } else {
            return new NonRoundedShapeFactory();
        }
    }
}
