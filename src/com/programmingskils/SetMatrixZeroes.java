package com.programmingskils;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Arrays to mark rows and columns
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Arrays to mark rows and columns
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        // Second pass to set the rows and columns to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        // Call the setZeroes function to modify the matrix in place
        setZeroes(matrix);

        // Print the modified matrix
        printMatrix(matrix);

    }
}
