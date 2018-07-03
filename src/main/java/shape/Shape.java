package shape;

public class Shape {
    String color = "green";
    boolean isFilled = true;

    public Shape() {
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isfilled) {
        this.isFilled = isfilled;
    }

    @Override
    public String toString() {
        String string = "A shape with color of " +
                color + '\t' + ", and = ";
        if (isFilled) {
            string += "isFilled";
        } else {
            string += "not isFilled";
        }
        return string;
    }
}
