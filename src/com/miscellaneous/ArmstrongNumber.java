package com.miscellaneous;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Calculate the number of digits

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += (int) Math.pow(digit, digits); // Add digit^digits to the sum
            number /= 10; // Remove the last digit
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

