package com.happy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 第15题 三数之和
 * 给定一个包含n个整数的数组nums，判断nums中是否存在三个元素a、b、c，使得 nums+b+c=0.
 * 找出所有满足条件且不重复的三元组。
 *
 * @author qgl
 * @date 2019/05/15
 */
public class ThreeSum15 {
    /**
     * 解法一：暴力法
     * 时间复杂度：O(n³)，空间复杂度：O(n)
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> number = new ArrayList<>();
                        number.add(nums[i]);
                        number.add(nums[j]);
                        number.add(nums[k]);
                        if (!res.contains(number)) {
                            res.add(number);
                        }
                    }
                }
            }
        }
        return res;
    }

    /**
     * 解法二：双指针法
     * 时间复杂度：O(n²)，空间复杂度：O(n)
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0, length = nums.length; i < length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int j = i + 1, k = length - 1;
                while (k > j) {
                    if (j != i + 1 && nums[j] == nums[j - 1]) {
                        j++;
                        continue;
                    }
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        k--;
                        j++;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
