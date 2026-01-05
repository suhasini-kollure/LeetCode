package com.string;

import java.util.HashMap;

public class PalindromePairs {

    public static int palindromeCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;

        for (String word : arr) {
            String reverse = new StringBuilder(word).reverse().toString();

            if (map.containsKey(reverse)) {
                count++;
            }
            map.put(word, 1);
        }
        return count;
    }

    public static void main(String[] args) {
        String[] str = {"ab", "ac", "ba", "ca", "cg"};  //output = 2
        System.out.println(palindromeCount(str));
    }
}
