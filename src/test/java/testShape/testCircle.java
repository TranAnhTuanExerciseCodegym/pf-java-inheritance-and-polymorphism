package testShape;

import shape.Circle;

public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(12, "back", false);
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle);
    }
}
