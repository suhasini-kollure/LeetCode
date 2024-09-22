package com.programmingskils;

public class CountOddNumbersInAnIntervalRange {
    public static int countOdds(int low, int high) {

        // The formula calculates how many odd numbers there are in the range.
        return (high + 1) / 2 - low / 2;
    }

    public static void main(String[] args) {
        System.out.println(CountOddNumbersInAnIntervalRange.countOdds(3, 7));

    }
}
