package com.interview150.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        //1. Approach
//        char[] charsS = s.toCharArray();
//        char[] charsT = t.toCharArray();
//        Arrays.sort(charsS);
//        Arrays.sort(charsT);
//        return Arrays.equals(charsS, charsT);

        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) {
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
