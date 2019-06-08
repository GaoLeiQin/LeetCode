package com.happy;

import java.util.ArrayList;
import java.util.List;

/**
 * 第46题 全排列
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 *
 * @author qgl
 * @date 2019/06/08
 */
public class Permutations46 {
    /**
     * 回溯法
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int[] visit = new int[nums.length];
        backTrack(result, new ArrayList<Integer>(), nums,  visit);
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> tmpList, int[] nums, int[] visit) {
        if (tmpList.size() == nums.length) {
            result.add(new ArrayList<>(tmpList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visit[i] == 1) {
                continue;
            }
            visit[i] = 1;
            tmpList.add(nums[i]);
            backTrack(result, tmpList, nums, visit);
            visit[i] = 0;
            tmpList.remove(tmpList.size() - 1);
        }
    }
}
