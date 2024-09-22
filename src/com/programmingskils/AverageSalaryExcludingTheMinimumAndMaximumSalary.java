package com.programmingskils;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sumSalary = 0;
        int n = salary.length;

        for (int i=1; i<n-1; i++) {
            sumSalary += salary[i];
        }
        return sumSalary/(n-2);
    }

    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(AverageSalaryExcludingTheMinimumAndMaximumSalary.average(salary));
    }
}
