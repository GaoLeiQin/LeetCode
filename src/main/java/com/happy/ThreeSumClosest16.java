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
     * 时间复杂度：O(n³)，空间复杂度：O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        int closestNum = 0, size = nums.length, largerNum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int diff = sum - target;
                    diff = diff >= 0 ? diff : -diff;
                    if (diff == 0) {
                        return target;
                    }
                    if (diff < largerNum) {
                        largerNum = diff;
                        closestNum = sum;
                    }
                }
            }
        }
        return closestNum;
    }
    /**
     * 解法二：双指针法
     * 时间复杂度：O(n²)，空间复杂度：O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest2(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int largerNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int threeSum = nums[left] + nums[right] + nums[i];
                largerNum = Math.abs(threeSum - target) < Math.abs(largerNum - target) ? threeSum : largerNum;
                if (threeSum > target) {
                    right--;
                } else if (threeSum < target) {
                    left++;
                } else {
                    return target;
                }
            }
        }

        return largerNum;
    }
}
