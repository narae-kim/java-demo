package org.saturdaystudy.demo.equals;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Point squarePoint = new Point(1, 1);
        Point squarePoint2 = new Point(1, 1);
        Point squarePoint3 = new Point(1, 1);

        System.out.println(squarePoint.equals(squarePoint2));
        System.out.println(squarePoint == squarePoint2);

        System.out.println("-- The general contract of the equals method --");
        System.out.println("Reflexive: x.equals(x) = " + squarePoint.equals(squarePoint));
        System.out.println("Symmetry: x.equals(y)==y.equals(x) = " +
                (squarePoint.equals(squarePoint2) == squarePoint2.equals(squarePoint)));
        System.out.printf("Transitive: if x.equals(y) = %b and y.equals(z) = %b, then x.equals(z) = %b\n",
                squarePoint.equals(squarePoint2), squarePoint2.equals(squarePoint3), squarePoint.equals(squarePoint3));
        System.out.println("Consistent: for any non-null reference values x and y, multiple invocations of " +
                "x.equals(y) must consistently return true or consistently return false");
        System.out.println("For any non-null reference value x, x.equals(null) = " + squarePoint.equals(null));

        System.out.println("-----------------");
        ColorPoint bluePoint = new ColorPoint(1, 1, Color.BLUE);
        ColorPoint blackPoint = new ColorPoint(1, 1, Color.BLACK);

        System.out.printf("The equals work okay within the same (sub)class - x.equals(y) = %b\n",
                bluePoint.equals(blackPoint));
        System.out.printf("It breaks the symmetry contract for inheritance - %b != %b\n",
                squarePoint.equals(bluePoint), bluePoint.equals(squarePoint));

        System.out.println("-----------------");
        ComposedColorPoint composedBluePoint = new ComposedColorPoint(1, 1, Color.BLUE);
        ComposedColorPoint composedBlackPoint = new ComposedColorPoint(1, 1, Color.BLACK);

        System.out.printf("The equals work okay within the same (sub)class - x.equals(y) = %b\n",
                composedBluePoint.equals(composedBlackPoint));
        System.out.printf("It DOESN'T break the symmetry contract for inheritance - %b == %b\n",
                squarePoint.equals(composedBluePoint), composedBluePoint.equals(squarePoint));
    }
}
