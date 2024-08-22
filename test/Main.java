package test;

class Main {
    public static void main(String[] args) {
        System.out.println(question1(new int[] { 7, 6, 4, 3, 1 }));
        System.out.println(question2("7.5.2.4", "7.5.3"));
        System.out.println(question3(10));
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
        for (int i = 0; i < maxLength; i++) {
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
            } else if (num1 > num2) {
                return 1;
            }
        }
        return 0;
    }

    private static int question3(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int[] dp = new int[100];

        if (dp[n] == 0) {
            dp[n] = question3(n - 1) + question3(n - 2);
        }
        return dp[n];
    }

    /*
     * Question 4
     * คำถามที่ 3 ยากที่สุด เพราะเป็นเรื่องที่ไม่ถนัด ต้องใช้ความรู้ dynamic programing หรือ recursion ซึ่งยากในการคิดภาพในหัวว่าทำงานยังไง
     * ใช้วิธีการ resursion โดยการเรียก method ตัวเองซ้ำๆ จนหยุดที่ base case
     */

}