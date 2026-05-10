package com.itlzz.dualpointer;

//leetcode 11. 盛最多水的容器

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int amount = 0;
        while(left < right){
            amount = Math.max(Math.min(height[left], height[right]) * (right - left), amount);
            if(height[left] < height[right]){
                left++;
            } else if (height[left] > height[right]) {
                right--;
            }else{
                left++;
                right--;
            }
        }
        return amount;
    }

}
