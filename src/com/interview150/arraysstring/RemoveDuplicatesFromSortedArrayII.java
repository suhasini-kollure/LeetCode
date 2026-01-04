package com.interview150.arraysstring;

public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i-2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
//        Output: 5, nums = [1,1,2,2,3,_]
        System.out.println(removeDuplicates(nums));
    }
}
