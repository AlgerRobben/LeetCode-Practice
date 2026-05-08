package com.itlzz.hash;


//leetcode 128. 最长连续序列

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int res = 0;
        int length = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int num: nums){
            set.add(num);
            cntMap.put(num, 1);
        }
        for(int num: set){
            int currentNum = num;
            if(!cntMap.containsKey(currentNum - 1)){
                while(cntMap.containsKey(currentNum++)){
                    length++;
                }
                res = Math.max(length, res);
                length = 0;
            }
        }
        return res;
    }
}
