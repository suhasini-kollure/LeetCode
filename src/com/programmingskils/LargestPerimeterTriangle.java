package com.programmingskils;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static int largestPerimeter(int[] nums) {
        // Step 1: Sort the array in descending order
        Arrays.sort(nums);

        // Step 2: Traverse from the end to find the largest perimeter
        for (int i = nums.length - 3; i >= 0; i--) {
            // Step 3: Check if the current triplet can form a valid triangle
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                // If valid, return the perimeter
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }

        // Step 4: If no valid triangle can be formed, return 0
        return 0;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 1, 2};
        System.out.println(LargestPerimeterTriangle.largestPerimeter(nums1));

        int[] nums2 = {1, 2, 1};
        System.out.println(LargestPerimeterTriangle.largestPerimeter(nums2));

        int[] nums3 = {1,2,1,10};
        System.out.println(LargestPerimeterTriangle.largestPerimeter(nums3)); // Output: 10


    }
}
