package com.string;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
//        if (s.length() == 1) return 1;
//
//        s = s.trim();
//        int count = 0;
//
//        for (int i = s.length()-1; i >= 0; i--) {
//            if (s.charAt(i) != ' ') count++;
//            else break;
//        }
//
//        return count;


        int i = s.length()-1;
        int count = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World";  //5
        String s2 =  "   fly me   to   the moon  "; //4
        String s3 = "a"; //1
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));

    }
}
