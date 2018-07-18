package triangle;

public class Shape extends Triangle {
    private String color;

    public Shape(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
