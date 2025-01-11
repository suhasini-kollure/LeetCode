package com.leetcode75;

public class StringCompression {
    public static int compress(char[] chars) {
        int write = 0, read = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count the number of occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If the count is greater than 1, write the count as well
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        // Return the new length of the array after compression
        return write;
    }

    public static void main(String[] args) {
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars1)); // Output: 6, ["a", "2", "b", "2", "c", "3"]

        char[] chars2 = {'a'};
        System.out.println(compress(chars2)); // Output: 1, ["a"]

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars3)); // Output: 4, ["a", "b", "1", "2"]
    }
}

