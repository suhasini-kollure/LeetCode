package com.programmingskils;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i=0; i<accounts.length; i++) {
            int sum = 0;

            for (int j=0; j< accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},
                            {3,2,1}};

        System.out.println(RichestCustomerWealth.maximumWealth(accounts));

    }
}
