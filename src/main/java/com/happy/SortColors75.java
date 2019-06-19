package com.happy;

/**
 * 第75题 颜色分类
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * @author qgl
 * @date 2019/06/19
 */
public class SortColors75 {
    /**
     * 三指针法
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0, left = 0, right = nums.length - 1;
        while (i <= right) {
            if (i < left || nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                swap(nums, i, left++);
            } else if (nums[i] == 2) {
                swap(nums, i, right--);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
