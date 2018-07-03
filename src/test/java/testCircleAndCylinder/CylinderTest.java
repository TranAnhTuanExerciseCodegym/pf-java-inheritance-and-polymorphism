package testCircleAndCylinder;

import classCircleAndClassCylinder.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(12, 52, "blu");

        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
