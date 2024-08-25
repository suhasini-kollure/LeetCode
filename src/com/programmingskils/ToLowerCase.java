package com.programmingskils;

public class ToLowerCase {

    public static String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            }
            else {
                result.append(c);
            }
        }
        return result.toString();

//        return s.toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println(ToLowerCase.toLowerCase("LOVELY"));

    }

}
