package com.happy;

import java.util.ArrayList;
import java.util.List;

/**
 * 第78题 子集
 * 给定一组不含重复元素的整数数组nums，返回该数组所有可能的子集（幂集）。
 * 注：解集不能包含重复的子集。
 *
 * @author qgl
 * @date 2019/06/21
 */
public class SubSets78 {
    /**
     * 回溯法
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        backTrace(nums, 0, result, new ArrayList<Integer>());
        return result;
    }

    private void backTrace(int[] nums, int cur, List<List<Integer>> result, List<Integer> tmp) {
        result.add(new ArrayList<>(tmp));
        if (tmp.size() >= nums.length) {
            return;
        }
        for (int i = cur; i < nums.length; i++) {
            tmp.add(nums[i]);
            backTrace(nums, i + 1, result, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
