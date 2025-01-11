package com.leetcode75;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {
    public static String reverseWords(String s) {

//        1st Approach
//        s = s.trim();
//        s = s.replaceAll("\\s+", " ");
//
//        List<String> words = Arrays.asList(s.split(" "));
//        Collections.reverse(words);
//
//        return String.join(" ", words);

//        2nd Approach
        String str[] = s.split("\\s+");
        StringBuilder string=new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
        {
            string.append(str[i]).append(" ");
        }
        return string.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("a good   example"));

    }
}
