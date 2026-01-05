package com.string;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
//        char[] charsS = s.toCharArray();
//        char[] charsT = t.toCharArray();
//
//        Arrays.sort(charsS);
//        Arrays.sort(charsT);
//
//        return Arrays.equals(charsS, charsT);

        int[] freq = new int[128];

        for (char ch : s.toCharArray()) freq[ch]++;
        for (char ch : t.toCharArray()) freq[ch]--;

        for (int i : freq) if (i != 0) return false;

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
