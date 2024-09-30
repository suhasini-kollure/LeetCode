package com.programmingskils;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {

        // Edge case: if either number is "0", the result is "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        // Create an array to store the product of each digit
        int[] product = new int[num1.length() + num2.length()];

        // Reverse both strings to multiply digits starting from the least significant digit
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';
                int mul = n1 * n2;

                // Determine the position to place the result in the product array
                int sum = product[i + j + 1] + mul;

                // Store the sum's last digit at position i + j + 1
                product[i + j + 1] = sum % 10;

                // Add the carry (sum's first digit) to position i + j
                product[i + j] += sum / 10;
            }
        }

        // Convert the product array back to a string
        StringBuilder result = new StringBuilder();
        for (int num : product) {
            // Skip leading zeros
            if (!(result.length() == 0 && num == 0)) {
                result.append(num);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        MultiplyStrings solution = new MultiplyStrings();
        System.out.println(MultiplyStrings.multiply("123", "456")); // Output: "56088"
    }
}