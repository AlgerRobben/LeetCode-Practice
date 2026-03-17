package com.itlzz.techniques;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode 169.多数元素

public class FindMajority {

    //哈希，空间复杂度O(n)
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
            if(map.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }
        return 0;
    }

    //数组排序
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
