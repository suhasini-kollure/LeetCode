package com.leetcode75;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

//        It represents the index where the next non-zero element should be placed
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] nums1 = {0};
        moveZeroes(nums);
        moveZeroes(nums1);

    }


}
