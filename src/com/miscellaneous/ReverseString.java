package com.miscellaneous;

import java.util.Arrays;

public class ReverseString {

    public static String reverseString(String s) {

        char[] originalArray = s.toCharArray();
        char[] reversedArray = new char[originalArray.length];

        for(int i=originalArray.length-1, j=0; i>=0; i--, j++) {
            reversedArray[j] = originalArray[i];
        }
        return new String(reversedArray);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("cat"));
    }
}
