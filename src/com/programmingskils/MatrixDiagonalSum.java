package com.programmingskils;

//travers a matrix
//1.primary diagonal are ( i == j ) i and j value is same so i use sum += mat[i][i];
//2.Not repete the value if( i != mat.length - i - 1)
//3.we know j = ( i + j = n-1), so we can write this also j= n-1-i
//in code we write line this sum += mat[i][mat.length-i-1];

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i=0; i<n; i++) {
            sum += mat[i][i]; // Add primary diagonal element
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i]; // Add secondary diagonal element only if it's not the same element
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,1,1,1},{1,1,1,1,},{1,1,1,1},{1,1,1,1}};
        int[][] mat3 = {{5}};
        System.out.println(MatrixDiagonalSum.diagonalSum(mat1));
        System.out.println(MatrixDiagonalSum.diagonalSum(mat2));
        System.out.println(MatrixDiagonalSum.diagonalSum(mat3));


    }
}
