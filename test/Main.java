package test;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // System.out.println(question1(new int[] { 7, 6, 4, 3, 1 }));
        System.out.println(question2("7.5.2.4", "7.5.3"));
        // System.out.println(question3());
    }

    private static int question1(int[] nums) {
        int minPrice = 1000000;
        int maxProfit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            }
            int profit = nums[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    private static int question2(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int maxLength = 0;
        if (v1.length > v2.length) {
            maxLength = v1.length;
        } else {
            maxLength = v2.length;
        }
        for(int i = 0; i < maxLength; i++) {
            int num1 = 0;
            int num2 = 0;
            if (i < v1.length) {
                num1 = Integer.parseInt(v1[i]);
            } else {
                num1 = 0;
            }
            if (i < v2.length) {
                num2 = Integer.parseInt(v2[i]);
            } else {
                num2 = 0;
            }
            if (num1 < num2) {
                return -1;
            } 
            if (num1 > num2) {
                return 1;
            }
        }
        return 0;
    }

    private static int question3() {
        return 0;
    }
}