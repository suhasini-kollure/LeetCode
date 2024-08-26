package com.programmingskils;

public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
        }
        return x==0 && y==0;

//        int x = 0;            //solution : 2
//        int y = 0;
//
//        for (char move : moves.toCharArray()) {
//            switch (move) {
//                case 'U': y++; break;
//                case 'D': y--; break;
//                case 'L': x--; break;
//                case 'R': x++; break;
//            }
//        }
//
//        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        String moves1 = "UD";
        System.out.println(RobotReturnToOrigin.judgeCircle(moves1));  // Output: true

        String moves2 = "LL";
        System.out.println(RobotReturnToOrigin.judgeCircle(moves2));

    }
}
