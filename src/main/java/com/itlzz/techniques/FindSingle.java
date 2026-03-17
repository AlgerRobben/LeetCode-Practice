package com.itlzz.techniques;


//leetcode 136.只出现一次的数字

//异或运算^：同0异1

public class FindSingle {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

}
