package shape;

import geometricObjects.Shape;

public class testShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getColor());
        System.out.println(shape.getIsFilled());
    }
}
