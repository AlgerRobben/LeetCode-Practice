package com.itlzz.binarysearch;

//leetcode 35.搜索插入位置

public class SearchInsertIndex {

    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
             mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return target < nums[mid] ? mid : mid + 1;
    }
}
