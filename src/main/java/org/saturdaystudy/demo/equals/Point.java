package org.saturdaystudy.demo.equals;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Common way of overriding the ``equals`` method. However, it breaks symmetry contract when there are subclasses.
     *
     * @param o
     * @return boolean whether that instance is the same as this instance
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

/**
 * Workaround for the symmetry contract. The ``equals`` method only works within the same (sub)class.
 * However, it violates OO principle.
 * @param o
 * @return boolean whether that instance is the same as this instance
 */
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || o.getClass() != getClass()) return false;
//        Point p = (Point) o;
//        return p.x == x && p.y == y;
//    }

    /**
     * Prevent the ``equals`` method being invoked.
     * @param o
     * @return AssertionError
     */
//    @Override
//    public boolean equals(Object o) {
//        throw new AssertionError();
//    }
}
