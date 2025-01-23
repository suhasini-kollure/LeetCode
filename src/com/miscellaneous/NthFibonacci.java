package com.miscellaneous;

import java.util.Scanner;

//Given a number n, print n-th Fibonacci Number.

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of the Fibonacci number: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("The 0th Fibonacci number is: 0");
        } else if (num == 1) {
            System.out.println("The 1st Fibonacci number is: 1");
        } else {
            int a = 0;
            int b = 1;
            int fib = 0;

            for (int i = 2; i <= num; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println("The " + num + "-th Fibonacci number is: " + fib);
        }
        scanner.close();
    }
}
