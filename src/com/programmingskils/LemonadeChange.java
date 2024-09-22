package com.programmingskils;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {

        int count5 = 0;
        int count10 = 0;

        for (int bill : bills ) {
            if (bill == 5) {
                count5++;
            } else if (bill == 10) {
                if (count5 > 0) {
                    count5--;
                    count10++;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (count5 > 0 && count10 > 0) {
                    count5--;
                    count10--;
                } else if (count5 >= 3) {
                    count5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        int[] bills1 = {5,5,10,10,20};
        System.out.println(LemonadeChange.lemonadeChange(bills));
        System.out.println(LemonadeChange.lemonadeChange(bills1));


    }
}
