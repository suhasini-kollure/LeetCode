package com.interview150.hashmap;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {

        String[] words  = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) return false;
            } else {
                map.put(ch, word);
            }

            if (reverseMap.containsKey(word)) {
                if (!reverseMap.get(word).equals(ch)) return false;
            } else {
                reverseMap.put(word, ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
