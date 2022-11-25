package de.breyer.aoc.y2021;

public class SubmarineTwo {

    private int x = 0;
    private int y = 0;
    private int aim = 0;

    public void executeCommand(String command) {
        String[] split = command.split(" ");
        int amount = Integer.parseInt(split[1]);

        if ("forward".equals(split[0])) {
            x += amount;
            y += aim * amount;
        } else if ("up".equals(split[0])) {
            aim -= amount;
        } else if ("down".equals(split[0])) {
            aim += amount;
        } else {
            System.out.println("ERROR - unknown command " + split[0]);
        }
    }

    public int getPosition() {
        return x * y;
    }
}
