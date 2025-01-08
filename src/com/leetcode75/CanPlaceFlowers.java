package com.leetcode75;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    count++;

                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;

        int[] flowerbed2 = {1,0,0,0,1};
        int n2 = 2;

        int[] flowerbed3 = {1,0,0,0,0,1};
        int n3 = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));
        System.out.println(canPlaceFlowers(flowerbed2, n2));
        System.out.println(canPlaceFlowers(flowerbed3, n3));

    }
}
