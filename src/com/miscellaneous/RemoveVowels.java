package com.miscellaneous;

public class RemoveVowels {

    public static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("Apple"));
    }
}
