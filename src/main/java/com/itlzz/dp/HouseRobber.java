package com.itlzz.dp;

//leetcode 198.打家劫舍

public class HouseRobber {

    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        if(nums.length == 3){
            return Math.max(nums[0] + nums[2], nums[1]);
        }
        if(nums.length == 4){
            return Math.max(Math.max(nums[0] + nums[2], nums[0] + nums[3]), nums[1] + nums[3]);
        }
        int[] dp = new int[nums.length];
        dp[nums.length - 1] = nums[nums.length - 1];
        dp[nums.length - 2] = nums[nums.length - 2];
        for (int i = nums.length - 3; i >= 0; i--) {
            if(i == nums.length - 3){
                dp[i] = nums[i] + nums[nums.length - 1];
            }else {
                dp[i] = Math.max(dp[i + 2] + nums[i], dp[i + 3] + nums[i]);
            }
        }
        return Math.max(dp[0], dp[1]);
    }


}
