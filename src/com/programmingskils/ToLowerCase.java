package com.programmingskils;

public class ToLowerCase {

    public static String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();
        char ch;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i)<= 'Z') {
                ch = (char) (s.charAt(i) + 32);
            }
            else {
                ch = s.charAt(i);
            }
            result.append(ch);
        }

        return result.toString();

//        return s.toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println(ToLowerCase.toLowerCase("LOVELY"));

    }

}
