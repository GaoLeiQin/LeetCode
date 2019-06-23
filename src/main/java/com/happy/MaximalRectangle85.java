package com.happy;

import java.util.Stack;

/**
 * 第85题 最大矩形（hard）
 * 给定一个仅包含 0和 1的二维二进制矩阵，找出只包含 1的最大矩形，并返回其面积。
 *
 * @author qgl
 * @date 2019/06/23
 */
public class MaximalRectangle85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int maxArea = 0;
        int column = matrix[0].length;
        int[] height = new int[column + 2];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < column + 2; j++) {
                if (j > 0 && j <= column) {
                    height[j] = matrix[i][j - 1] == '0' ? 0 : (height[j] + 1);
                }

                while (!stack.isEmpty() && height[j] < height[stack.peek()]) {
                    maxArea = Math.max(maxArea, height[stack.pop()] * (j - stack.peek() - 1));
                }
                stack.push(j);
            }
        }
        return maxArea;
    }
}
