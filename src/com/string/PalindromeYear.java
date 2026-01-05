package com.string;

public class PalindromeYear {

    public static boolean isPalindrome(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int year = 2006;
        System.out.println(isPalindrome(year));

    }
}
