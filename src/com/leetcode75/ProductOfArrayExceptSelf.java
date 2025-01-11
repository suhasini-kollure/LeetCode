package com.leetcode75;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        int suffixProduct = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;

    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        int[] output = productExceptSelf(numbers);

        System.out.println(java.util.Arrays.toString(output));
    }
}

