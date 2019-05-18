package com.happy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 第18题 四数之和
 * 给定一个包含 n个整数的数组 nums和一个目标值target，判断 nums中是否存在四个元素 a,b,c和 d,
 * 使得 a+b+c+d的值与 target相等？找出所有满足条件且不重复的四元组。
 *
 * @author qgl
 * @date 2019/05/18
 */
public class FourNumber18 {
    /**
     * 两个for循环加双指针，即三数和题的外层多加了一个for循环
     * 时间复杂度：O(n³)，空间复杂度：O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    // 不满足条件或者重复的，继续遍历
                    if ((left != j + 1 && nums[left] == nums[left - 1]) || nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left++;
                    } else if ((right != nums.length - 1 && nums[right] == nums[right + 1]) || nums[i] + nums[j] + nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        if (!result.contains(list)) {
                            result.add(list);
                        }
                        // 满足条件则进入下一次遍历
                        left++;
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
