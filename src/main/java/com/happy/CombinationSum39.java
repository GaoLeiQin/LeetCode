package com.happy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 第39题 组合总和
 * 给定一个无重复元素的数组 candidates和一个目标数target ，
 * 找出 candidates中所有可以使数字和为 target的组合。
 *
 * @author qgl
 * @date 2019/06/05
 */
public class CombinationSum39 {
    /**
     * 查找所有的组合（回溯法）
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, res, 0, new ArrayList<Integer>());
        return res;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> res, int i, List<Integer> tmpList) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(tmpList));
            return;
        }
        for (int start = i; start < candidates.length; start++) {
            int currValue = candidates[start];
            if (target < currValue) {
                break;
            }
            tmpList.add(currValue);
            backtrack(candidates, target - currValue, res, start, tmpList);
            // 回退
            tmpList.remove(tmpList.size() - 1);
        }
    }
}
