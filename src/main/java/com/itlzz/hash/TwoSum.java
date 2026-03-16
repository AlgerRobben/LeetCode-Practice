package com.itlzz.hash;

import java.util.HashMap;
import java.util.Map;

//leetcode 1.两数之和

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashtable.containsKey(target - nums[i])){
                return new int[]{i, hashtable.get(target - nums[i])};
            }else{
                hashtable.put(nums[i], i);
            }
        }
        return null;
    }
}
