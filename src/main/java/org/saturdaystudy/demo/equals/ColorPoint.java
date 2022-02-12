package org.saturdaystudy.demo.equals;

import java.awt.Color;
import java.util.Objects;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    /**
     * The ``equals`` method works okay within the same class but not with the superclass.
     *
     * @param o
     * @return boolean whether that instance is the same as this instance
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) return false;
        if (!super.equals(o)) return false;
        ColorPoint that = (ColorPoint) o;
        return Objects.equals(color, that.color);
    }
}
