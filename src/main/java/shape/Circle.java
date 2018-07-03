package shape;

public class Circle extends Shape {
    double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean isFilled) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    public double getPerimeter() {
        return ((2 * radius) / 4) * Math.PI;
    }

    @Override
    public String toString() {
        String string = "A Circle with " + radius + ", which is a subclass of " + super.toString();
        return string;
    }
}
