package com.programmingskils;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        // Continue the loop while the boundaries are valid
        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top boundary
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // Shrink the top boundary

            // Traverse from top to bottom along the right boundary
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Shrink the right boundary

            if (top <= bottom) {
                // Traverse from right to left along the bottom boundary
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Shrink the bottom boundary
            }

            if (left <= right) {
                // Traverse from bottom to top along the left boundary
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Shrink the left boundary
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(SpiralMatrix.spiralOrder(matrix));

    }
}
