package com.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static int lengthOfLongestSubstring(String s) {

//        int maxLen = 0;
//        int left = 0;
//
//        Set<Character> set = new HashSet<>();
//
//        for (int right = 0; right < s.length(); right++) {
//            while (set.contains(s.charAt(right))) {
//                set.remove(s.charAt(left));
//                left++;
//            }
//            set.add(s.charAt(right));
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;

        int right = 0;
        int left = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
            maxLen = Math.max(maxLen, set.size());
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(input1));
        System.out.println(lengthOfLongestSubstring(input2));

    }
}
