package shape;

import geometricObjects.Rectangle;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 5);
        rectangle.getArea();
        System.out.println(rectangle.getArea());
        rectangle.setLength(12);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.toString());
    }
}
