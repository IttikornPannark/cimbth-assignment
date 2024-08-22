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
        String s1 = "";
        String s2 = "";
        int minLength = 0;
        int result = 0;
        for (int i = 0; i < v1.length; i++) {
            if (!v1[i].startsWith("0")) {
                s1 += v1[i];
            }
        }
        for (int j = 0; j < v2.length; j++) {
            if (!v2[j].startsWith("0")) {
                s2 += v2[j];
            }
        }
        if (s1.length() < s2.length()) {
            minLength = s1.length();
        } else {
            minLength = s2.length();
        }
        
        int i = 0;
        while (i < minLength) {
            System.out.println(s1.charAt(i));
            System.out.println(s2.charAt(i));
            if (s1.charAt(i) < s2.charAt(i)) {
                result = -1;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                result = 1;
            } else {
                result = 0;
            }
            i++;
        }
        return result;
    }

    private static int question3() {
        return 0;
    }
}