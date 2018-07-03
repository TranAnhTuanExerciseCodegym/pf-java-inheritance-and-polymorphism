package testCircleAndCylinder;

import classCircleAndClassCylinder.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(12, " back");

        System.out.println(circle.getArea());
        System.out.println(circle.toString());
        circle.setRadius(15);
        circle.setColor("red");
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
    }
}
