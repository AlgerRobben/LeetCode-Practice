package com.itlzz.dp;

public class ClimbingStairs {
    public int climbStairs(int n) {
        /**
         * 爬到第n阶楼梯的情况有两种：从第n-1阶楼梯爬1阶 or 从第n-2阶楼梯爬2阶
         * 因此状态转移方程为dp[n] = dp[n - 1] + dp[n - 2]
         */
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
