package com.itlzz.backtracking;


//leetcode 46.全排列

import java.util.ArrayList;
import java.util.List;

class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, res);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        // 递归终止：path长度等于nums长度，说明找到了一个全排列
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path)); // 必须拷贝一份，因为path会变
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // 已使用过的数字跳过
            // 做选择
            path.add(nums[i]);
            used[i] = true;
            // 进入下一层
            backtrack(nums, path, used, res);
            // 撤销选择（回溯）
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
