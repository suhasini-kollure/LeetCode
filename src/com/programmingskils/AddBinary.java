package com.programmingskils;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        StringBuilder result =  new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0 ) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            result.append(sum%2);
            carry = sum/2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(AddBinary.addBinary(a, b));

    }
}