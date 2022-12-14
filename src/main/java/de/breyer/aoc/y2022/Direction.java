package de.breyer.aoc.y2022;

import java.util.function.BiFunction;

public enum Direction {

    UP((x, i) -> x, (y, i) -> y - i),
    RIGHT((x, i) -> x + i, (y, i) -> y),
    DOWN((x, i) -> x, (y, i) -> y + i),
    LEFT((x, i) -> x - i, (y, i) -> y);


    public static Direction valueOf(char character) {
        return switch (character) {
            case 'U' -> UP;
            case 'D' -> DOWN;
            case 'L' -> LEFT;
            case 'R' -> RIGHT;
            default -> throw new IllegalStateException("Unexpected value: " + character);
        };
    }

    public static Direction turn(Direction currentDirection, char rotation) {
        return switch (currentDirection) {
            case UP -> 'R' == rotation ? Direction.RIGHT : Direction.LEFT;
            case RIGHT -> 'R' == rotation ? Direction.DOWN : Direction.UP;
            case DOWN -> 'R' == rotation ? Direction.LEFT : Direction.RIGHT;
            case LEFT -> 'R' == rotation ? Direction.UP : Direction.DOWN;
        };
    }

    private final BiFunction<Integer, Integer, Integer> xExpression;
    private final BiFunction<Integer, Integer, Integer> yExpression;

    public BiFunction<Integer, Integer, Integer> getXExpression() {
        return xExpression;
    }

    public BiFunction<Integer, Integer, Integer> getYExpression() {
        return yExpression;
    }

    Direction(BiFunction<Integer, Integer, Integer> xExpression, BiFunction<Integer, Integer, Integer> yExpression) {
        this.xExpression = xExpression;
        this.yExpression = yExpression;
    }
}
