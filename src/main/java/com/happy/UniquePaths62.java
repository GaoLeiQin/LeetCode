package com.happy;

/**
 * 第62题 不同路径
 * 一个机器人位于一个 m x n 网格的左上角（Start）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（Finish）。
 * 问总共有多少条不同的路径？
 *
 * @author qgl
 * @date 2019/06/14
 */
public class UniquePaths62 {
    /**
     * 排列组合，C(m+n-2,m-1) 或 C(m+n-2,n-1)
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int totalStep = m + n - 2;
        int step = Math.min(m, n) - 1;
        long ans = 1;
        for (int i = 1; i <= step; i++) {
            ans = ans * totalStep / (long) i;
            totalStep--;
        }
        return (int) ans;
    }

    /**
     * 动态规划
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 1;
                else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
                System.out.println("动态规划：" + Common.printTwoMatrix(dp));
            }
        }
        return dp[m - 1][n - 1];
    }
}
