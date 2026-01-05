package com.string;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

//        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//
//        return sb.toString().equals(str);

        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";   //true
        String s2 = "race a car";   //false
        String s3 = ""; //true
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome("0P"));
    }
}
