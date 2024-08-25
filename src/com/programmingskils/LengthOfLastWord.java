package com.programmingskils;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
//       s = s.trim();
//       int lastSpaceIndex = s.lastIndexOf(' ');
//
//        return s.length() - lastSpaceIndex -1;

        int length = 0;
        int i = s.length()-1;

        while (i>=0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i>=0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(LengthOfLastWord.lengthOfLastWord(s));

    }
}
