package abstractfactory;

public class FactoryClient {
    public static void main(String args[]) {
        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape shape = factory.getShape("Rectangle");
        shape.render();

        factory = FactoryProducer.getFactory(true);
        shape = factory.getShape("Circle");
        shape.render();
    }
}
