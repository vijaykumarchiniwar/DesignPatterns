package abstractfactory;

public class Eclipse extends Shape {
    @Override
    public void render() {
        System.out.println(this.getClass().getSimpleName());
    }
}
