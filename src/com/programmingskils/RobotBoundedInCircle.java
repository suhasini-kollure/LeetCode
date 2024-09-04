package com.programmingskils;

public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int dir = 0;    // 0 = North, 1 = East, 2 = South, 3 = West

        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'G') {
                if (dir == 0) {
                    y += 1;
                } else if (dir == 1) {
                    x += 1;
                } else if (dir == 2) {
                    y -= 1;
                } else if (dir == 3) {
                    x -= 1;
                }
            } else if (instruction == 'L') {
                if (dir == 0) {
                    dir = 3;
                } else if (dir == 1) {
                    dir = 0;
                } else if (dir == 2) {
                    dir = 1;
                } else if (dir == 3) {
                    dir = 2;
                }
            } else if (instruction == 'R') {
                if (dir == 0) {
                    dir = 1;
                } else if (dir == 1) {
                    dir = 2;
                } else if (dir == 2) {
                    dir = 3;
                } else {
                    dir = 0;
                }
            }
        }
        return (x == 0 && y == 0) || dir != 0;
    }

    public static void main(String[] args) {
        RobotBoundedInCircle solution = new RobotBoundedInCircle();

        // Test cases
        System.out.println(solution.isRobotBounded("GGLLGG")); // true
        System.out.println(solution.isRobotBounded("GG")); // false
        System.out.println(solution.isRobotBounded("GL")); // true

    }
}
