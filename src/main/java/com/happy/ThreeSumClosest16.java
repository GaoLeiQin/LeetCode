package com.happy;

import java.util.Arrays;

/**
 * 第16题 最接近的三数之和
 * 给定一个包括 n个整数的数组 nums和一个目标值 target。找出 nums中的三个整数，
 * 使得它们的和与 target最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * @author qgl
 * @date 2019/05/16
 */
public class ThreeSumClosest16 {
    /**
     * 解法一：暴力法
     * 时间复杂度：O(n²)，空间复杂度：O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                int threeSum = nums[l] + nums[r] + nums[i];
                if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
                    closestNum = threeSum;
                }
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    return target;
                }
            }
        }

        return closestNum;
    }
}
