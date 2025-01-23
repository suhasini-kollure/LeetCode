package com.miscellaneous;

import java.util.Scanner;

//the sequence of numbers in which each number in the sequence is equal to the sum of two numbers before it.

public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = scanner.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");

                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
        scanner.close();
    }
}
