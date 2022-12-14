package de.breyer.aoc.data;

import java.util.Objects;

public class Point2D {

    private final int x;
    private final int y;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point2D point2D = (Point2D) o;
        return x == point2D.x && y == point2D.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point2D{x=" + x + ", y=" + y + '}';
    }
}
