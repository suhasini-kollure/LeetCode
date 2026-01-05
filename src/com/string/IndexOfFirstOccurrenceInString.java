package com.string;

public class IndexOfFirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {

//        return haystack.indexOf(needle);

        if (needle.isEmpty()) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) return i;

        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));

        String haystack2 = "leetcode", needle2 = "leeto";
        System.out.println(strStr(haystack2, needle2));
    }
}
