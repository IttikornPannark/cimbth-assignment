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
        int minLength = 0;
        int result = 0;
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        for (int i = 0; i < v1.length; i++) {
            if (!v1[i].startsWith("0")) {
                l1.add(v1[i]);
            }
        }
        for (int j = 0; j < v2.length; j++) {
            if (!v2[j].startsWith("0")) {
                l2.add(v2[j]);

            }
        }
        int i = 0;
        if(l1.size() < l2.size()) {
            minLength = l1.size();
        } else {
            minLength = l2.size();
        }
        while (i < minLength) {
            if (Integer.parseInt(l1.get(i)) < Integer.parseInt(l2.get(i))) {
                result = -1;
            } else if (Integer.parseInt(l1.get(i)) > Integer.parseInt(l2.get(i))) {
                result = 1;
            }
            i++;
        }
        return result;
    }

    private static int question3() {
        return 0;
    }
}