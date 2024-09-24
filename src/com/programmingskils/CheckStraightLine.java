package com.programmingskils;

public class CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int xCurrentDiff = coordinates[i][0] - coordinates[0][0];
            int yCurrentDiff = coordinates[i][1] - coordinates[0][1];

            if (xDiff * yCurrentDiff != yDiff * xCurrentDiff) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1,2}, {2,3}, {3,4},{4,5},{5,6},{6,7}};
        int[][] coordinates1 = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(CheckStraightLine.checkStraightLine(coordinates));
        System.out.println(CheckStraightLine.checkStraightLine(coordinates1));


    }
}
