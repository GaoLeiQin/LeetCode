package com.happy;

/**
 * 第48题 旋转图像
 * 给定一个 n × n的二维矩阵表示一个图像，将图像顺时针旋转 90度。
 * 必须在原地旋转图像，即直接修改输入的二维矩阵。不能使用另一个矩阵来旋转图像。
 *
 * @author qgl
 * @date 2019/06/09
 */
public class RotateImage48 {
    /**
     * 解法一：先转置后翻转
     * 时间复杂度：O(n²)，空间复杂度：O(1)
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }

    /**
     * 解法二：旋转四个矩形
     * 时间复杂度：O(n²)，空间复杂度：O(1)
     *
     * @param matrix
     */
    public void rotate2(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
