package org.saturdaystudy.demo.equals;

import java.awt.Color;
import java.util.Objects;

public class ComposedColorPoint {
    private final Point point;
    private final Color color;

    public ComposedColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    /**
     * The best workaround for the ``equals`` method.
     *
     * @param o
     * @return boolean whether that instance is the same as this instance
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComposedColorPoint)) return false;
        ComposedColorPoint that = (ComposedColorPoint) o;
        return Objects.equals(point, that.point) && Objects.equals(color, that.color);
    }
}
