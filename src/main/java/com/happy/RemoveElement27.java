package com.happy;

/**
 * 第27题 移除元素
 * 给定一个数组 nums和一个值val，你需要原地移除所有数值等于 val的元素，返回移除后数组的新长度。
 *
 * @author qgl
 * @date 2019/05/27
 */
public class RemoveElement27 {
    /**
     * 双指针法
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }
}
