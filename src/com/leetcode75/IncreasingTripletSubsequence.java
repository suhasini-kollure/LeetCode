package com.leetcode75;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE; // The smallest value found so far
        int second = Integer.MAX_VALUE; // The second smallest value found so far

        for (int num : nums) {
            if (num <= first) {
                first = num; // Update first if current number is smaller or equal to first
            } else if (num <= second) {
                second = num; // Update second if current number is smaller or equal to second
            } else {
                // If we find a number greater than both first and second, we found a triplet
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }
}
