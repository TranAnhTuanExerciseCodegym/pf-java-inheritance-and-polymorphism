package pointAndMoveablePoint;

public class Application {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(12.4f);
        point.setY(2.4f);
        System.out.println(point.toString());

        Point movablePoint = new MovablePoint();
        ((MovablePoint) movablePoint).setSpeed(12f, 14f);

        movablePoint.setX(11f);
        movablePoint.setY(22f);

        System.out.println(((MovablePoint) movablePoint).move());
        System.out.println(movablePoint.toString());
        System.out.println(point.toString());

        System.out.println(movablePoint.getX());
        System.out.println(movablePoint.getY());
    }
}
