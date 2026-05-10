package com.itlzz.substring;

//leetcode 560.和为K的子数组

import java.util.HashMap;
import java.util.Map;

public class SubStringsEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSumCnt = new HashMap<>();
        preSumCnt.put(0, 1);
        int preSum = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if(preSumCnt.containsKey(preSum - k)){
                cnt += preSumCnt.get(preSum - k);
            }
            preSumCnt.put(preSum, preSumCnt.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}
