package com.happy;

/**
 * 第33题 搜索旋转排序数组
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回-1。
 * 假设数组中不存在重复的元素。但时间复杂度必须是 O(log n)。
 *
 * @author qgl
 * @date 2019/06/03
 */
public class SearchInRotatedSortedArray33 {
    /**
     * 通过二分查找算法获取目标值的在数组中的下标
     * 时间复杂度：O(log n)，空间复杂度：O(1)
     *
     * @param nums 旋转排序数组
     * @param target 目标值
     * @return index
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // 三项均为真或只有一项为真时向后查找
            if ((nums[0] > target) ^ (nums[0] > nums[mid]) ^ (target > nums[mid])) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left == right && nums[left] == target ? left : -1;
    }
}
