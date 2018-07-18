package triangle;

public class Application {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());

        Triangle shape = new Shape(12, 13, 14, "back");
        ((Shape) shape).setColor("red");
        System.out.println(shape.toString());
        System.out.println(triangle.getPerimeter());
    }
}
