package com.leetcode75;

public class MergeStringAlternatively {

    public static String mergeAlternately(String word1, String word2) {
        String mergedString = "";
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i<= maxLength; i++) {
            if (i<word1.length()) {
                mergedString += word1.charAt(i);
            }
            if (i<word2.length()) {
                mergedString += word2.charAt(i);
            }
        }
     return mergedString;
    }

    public static void main(String[] args) {

        System.out.println(mergeAlternately("abcd", "pq"));

    }
}
