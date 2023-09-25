package abstractfactory;

public class Rectangle extends Shape {
    @Override
    public void render() {
        System.out.println(this.getClass().getSimpleName());

    }
}
