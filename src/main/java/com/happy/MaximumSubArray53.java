package com.happy;

/**
 * 第53题 最大子序和
 * 给定一个整数数组nums，找到一个具有最大和的连续子数组（子数组最少包含一个元素）,返回其最大和。
 *
 * @author qgl
 * @date 2019/06/11
 */
public class MaximumSubArray53 {
    /**
     * 动态规划
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int result = nums[0];
        for (int num : nums) {
            sum = sum > 0 ? sum + num : num;
            result = Math.max(sum, result);
        }
        return result;
    }
}
