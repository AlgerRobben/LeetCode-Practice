package com.itlzz.greedy;


//leetcode 121.买卖股票的最佳时机

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int low = prices[0]; //prices数组中的股票价格最低值
        int[] dp = new int[prices.length];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - low);
            low = Math.min(low, prices[i]);
        }
        return dp[prices.length - 1];
    }
}
