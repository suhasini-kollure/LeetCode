package com.string;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr) {

        if (arr == null || arr.length == 0) {
            return "";
        }

        int index = 0;

        while (true) {

            if (index >= arr[0].length()) {
                return arr[0].substring(0, index);
            }

            char c = arr[0].charAt(index);

            for (int i = 1; i < arr.length; i++) {

                if (index >= arr[i].length() || arr[i].charAt(index) != c) {
                    return arr[0].substring(0, index);
                }
            }

            index++;
        }
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};    //fl
        System.out.println(longestCommonPrefix(strs1));

    }
}
