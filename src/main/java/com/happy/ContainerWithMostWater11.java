package com.happy;

/**
 * 第11题 盛最多水的容器
 * 给定n个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai)。
 * 在坐标内画n条垂直线，垂直线i的两个端点分别为(i,ai)和(i,0)。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 *
 * @author qgl
 * @date 2019/05/11
 */
public class ContainerWithMostWater11 {

    /**
     * 解法一：暴力法
     * 时间复杂度：O(n²)，空间复杂度：O(1)
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            }
        return maxArea;
    }

    /**
     * 解法二：双指针法
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param height
     * @return
     */
    public int maxArea2(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }

    /**
     * 解法三：双指针法的优化
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param height
     * @return
     */
    public int maxArea3(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }
}
