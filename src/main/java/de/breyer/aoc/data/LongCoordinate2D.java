package de.breyer.aoc.data;

import java.util.Objects;

public class LongCoordinate2D {

    private final long x;
    private final long y;

    public LongCoordinate2D(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return this.x;
    }

    public long getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LongCoordinate2D point2D = (LongCoordinate2D) o;
        return x == point2D.x && y == point2D.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "LongCoordinate2D{x=" + x + ", y=" + y + '}';
    }
}
