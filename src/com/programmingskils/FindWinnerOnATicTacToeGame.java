package com.programmingskils;

import java.util.*;

public class FindWinnerOnATicTacToeGame {
    public String ticTacToe(int[][] moves) {

//        Set<String> playerA = new HashSet<>();        //Solution : 1
//        Set<String> playerB = new HashSet<>();
//
//        for (int i = 0; i < moves.length; i++) {
//            String move = moves[i][0] + "," + moves[i][1];
//            if (i % 2 == 0) {
//                playerA.add(move);
//                if (checkWin(playerA)) return "A";
//            } else {
//                playerB.add(move);
//                if (checkWin(playerB)) return "B";
//            }
//        }
//
//        return moves.length == 9 ? "Draw" : "Pending";
//    }
//
//    private boolean checkWin(Set<String> moves) {
//        String[][] winningCombos = {
//                {"0,0", "0,1", "0,2"},  // Row 1
//                {"1,0", "1,1", "1,2"},  // Row 2
//                {"2,0", "2,1", "2,2"},  // Row 3
//                {"0,0", "1,0", "2,0"},  // Column 1
//                {"0,1", "1,1", "2,1"},  // Column 2
//                {"0,2", "1,2", "2,2"},  // Column 3
//                {"0,0", "1,1", "2,2"},  // Diagonal 1
//                {"0,2", "1,1", "2,0"}   // Diagonal 2
//        };
//
//        for (String[] combo : winningCombos) {
//            if (moves.contains(combo[0]) && moves.contains(combo[1]) && moves.contains(combo[2])) {
//                return true;
//            }
//        }
//        return false;
//    }


        int n = 3;                                       //Solution : 2
        int[] rows = new int[n];
        int[] cols = new int[n];
        int diag = 0;
        int antiDiag = 0;

        for (int i = 0; i < moves.length; ++i) {
            int player = i % 2 == 0 ? 1 : -1;
            int[] move = moves[i];
            cols[move[0]] += player;
            rows[move[1]] += player;
            if (move[0] == move[1]) {
                diag += player;
            }
            if (move[0] + move[1] == n - 1) {
                antiDiag += player;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (rows[i] == 3 || cols[i] == 3) {
                return "A";
            } else if (rows[i] == -3 || cols[i] == -3) {
                return "B";
            }
        }
        if (diag == 3 || antiDiag == 3) {
            return "A";
        } else if (diag == -3 || antiDiag == -3) {
            return "B";
        }
        return moves.length == n * n ? "Draw" : "Pending";
    }

    public static void main(String[] args) {
        FindWinnerOnATicTacToeGame game = new FindWinnerOnATicTacToeGame();
        int[][] moves1 = {{0,0}, {2,0}, {1,1}, {2,1}, {2,2}};
        int[][] moves2 = {{0,0}, {1,1}, {0,1}, {0,2}, {1,0}, {2,0}};
        int[][] moves3 = {{0,0}, {1,1}, {2,0}, {1,0}, {1,2}, {2,1}, {0,1}, {0,2}, {2,2}};

        System.out.println(game.ticTacToe(moves1));
        System.out.println(game.ticTacToe(moves2));
        System.out.println(game.ticTacToe(moves3));


    }
}
