package point2DAndPoint3D;

public class Application {
    public static void main(String[] args) {
        Point2D point2D;
        point2D = new Point2D(12.3f, 3.4f);
        System.out.println(point2D.toString());
        Point2D point3D;
        point3D = new Point3D(23.4f, 34.5f, 45.6f);
        System.out.println(point3D.toString());
    }
}
