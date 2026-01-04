package com.interview150.arraysstring;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] num1, int m, int[] num2, int n) {

//       System.arraycopy(num2, 0, num1, m, n);
//       Arrays.sort(num1);
//       System.out.println(Arrays.toString(num1));

       int p1 = m-1;
       int p2 = n-1;
       int pMerge = m + n - 1;

       while (p2 >= 0) {
           if (p1 >= 0 && num1[p1] > num2[p2]) {
               num1[pMerge--] = num1[p1--];
           } else {
               num1[pMerge--] = num2[p2--];
           }
       }
       System.out.println(Arrays.toString(num1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
