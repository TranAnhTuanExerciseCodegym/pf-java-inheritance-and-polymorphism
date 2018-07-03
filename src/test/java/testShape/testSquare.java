package testShape;

import shape.Square;

public class testSquare {
    public static void main(String[] args) {
        Square[] square = new Square[5];
        square[0] = new Square();

//        Square square = new Square();

        System.out.println(square.toString());
        square[1] = new Square(12,"back",true);

        System.out.println(square[1].getArea());
        System.out.println(square[1].toString());
    }
}
