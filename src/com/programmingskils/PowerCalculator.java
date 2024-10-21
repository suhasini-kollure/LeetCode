package com.programmingskils;

public class PowerCalculator {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double half = myPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();

        System.out.println(calculator.myPow(2.00000, 10));  // Output: 1024.00000
        System.out.println(calculator.myPow(2.10000, 3));   // Output: 9.26100
        System.out.println(calculator.myPow(2.00000, -2));  // Output: 0.25000
    }
}

