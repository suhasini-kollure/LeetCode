package com.interview150.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if (map.containsKey(y) && map.get(y) != i) {
                return new int[]{i, map.get(y)};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

//        Output: [0,1]
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
