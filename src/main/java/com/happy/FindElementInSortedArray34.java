package com.happy;

/**
 * 第34题 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组nums，和一个目标值target，找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值，返回 [-1, -1]。但时间复杂度必须是 O(log n)。
 *
 * @author qgl
 * @date 2019/06/04
 */
public class FindElementInSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int leftIndex = binarySearchIndex(nums, target, true);
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return result;
        }

        result[0] = leftIndex;
        result[1] = binarySearchIndex(nums, target, false) - 1;
        return result;
    }

    /**
     * 用二分查找算法找到包含target的下标
     *
     * @param nums
     * @param target
     * @param isSearchLeftPartition 与目标值相等时是否查询左区间
     * @return
     */
    private int binarySearchIndex(int[] nums, int target, boolean isSearchLeftPartition) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (isSearchLeftPartition && target == nums[mid])) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
