package com.miscellaneous;

//Decimal Number to Binary

public class DecimalToBinary {
    public static void main(String[] args) {

//        int num = 10;
//        String binary = Integer.toBinaryString(num);
//        System.out.println(binary);

        int decimal = 25; // Example decimal number
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2; // Get the remainder (0 or 1)
            binary.append(remainder);   // Append to the binary string
            decimal = decimal / 2;      // Divide the number by 2
        }

        binary.reverse();         // Reverse the binary string since it's constructed backwards
        System.out.println("Binary representation is: " + binary);

    }
}
