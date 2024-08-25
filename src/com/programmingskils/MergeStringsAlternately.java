package com.programmingskils;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuffer mergedString =  new StringBuffer();
        int i = 0;
        int j = 0;

//        while (i<word1.length() && j<word2.length()) {
//            mergedString.append(word1.charAt(i++));
//            mergedString.append(word2.charAt(j++));
//        }
//        while (i<word1.length()) {
//            mergedString.append(word1.charAt(i++));
//        }
//        while (j<word2.length()) {
//            mergedString.append(word2.charAt(j++));
//        }
//        return mergedString.toString();

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                mergedString.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                mergedString.append(word2.charAt(j++));
            }
        }

        return mergedString.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(MergeStringsAlternately.mergeAlternately(word1, word2));

    }
}
