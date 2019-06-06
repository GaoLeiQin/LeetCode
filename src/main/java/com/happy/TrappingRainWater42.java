package com.happy;

/**
 * 第42题 接雨水
 * 给定 n个非负整数表示每个宽度为 1的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 * @author qgl
 * @date 2019/06/06
 */
public class TrappingRainWater42 {
    /**
     * 双指针法
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int ans = 0;
        int leftMax = height[0], rightMax = height[right];
        while (left < right) {
            if (height[left] < height[right]) {
                int tmp = leftMax - height[left];
                ans += tmp > 0 ? tmp : 0;
                leftMax = Math.max(height[left++],leftMax);
            } else {
                int tmp = rightMax - height[right];
                ans += tmp > 0 ? tmp : 0;
                rightMax = Math.max(height[right--],rightMax);
            }
        }
        return ans;
    }
}
