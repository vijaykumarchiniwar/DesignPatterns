package factory;

import abstractfactory.Shape;

public class Rectangle extends Shape {
    @Override
    public void render() {
        System.out.println(this.getClass().getSimpleName());

    }
}
