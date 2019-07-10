package com.happy;

import java.util.HashSet;
import java.util.Set;

/**
 * 第128题 最长连续序列（hard）
 * 给定一个未排序的整数数组，找出最长连续序列的长度。要求算法的时间复杂度为 O(n)。
 *
 * @author qgl
 * @date 2019/07/10
 */
public class LongestConsecutiveSequence128 {
    /**
     * 哈希表和线性空间的构造
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

}
