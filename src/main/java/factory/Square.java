package factory;

import abstractfactory.Shape;

public class Square extends Shape {
    @Override
    public void render() {
        System.out.println(this.getClass().getSimpleName());

    }
}
