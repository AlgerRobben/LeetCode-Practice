package com.itlzz.dualpointer;

//leetcode 283.移动零

public class MoveZero {

    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                cnt++;
            }else{
                nums[i - cnt] = nums[i];
                if(cnt != 0){
                    nums[i] = 0;
                }
            }
        }
    }
}
