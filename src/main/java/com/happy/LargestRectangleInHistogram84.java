package com.happy;

import java.util.Stack;

/**
 * 第84题 柱状图中最大的矩形
 * 给定 n个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为1。
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 *
 * @author qgl
 * @date 2019/06/23
 */
public class LargestRectangleInHistogram84 {
    /**
     * 解法一：暴力法
     * 时间复杂度：O(n²)，空间复杂度：O(1)
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }

    /**
     * 解法二：使用栈
     * 时间复杂度：O(n)，空间复杂度：O(n)
     * 
     * @param heights
     * @return
     */
    public int largestRectangleArea2(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxArea = 0;
        for (int i = 0; i < heights.length; ++i) {
            while (stack.peek() != -1 && heights[i] < heights[stack.peek()]) {
                maxArea = Math.max(maxArea, heights[stack.pop()] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            maxArea = Math.max(maxArea, heights[stack.pop()] * (heights.length - stack.peek() - 1));
        }
        return maxArea;
    }
}
