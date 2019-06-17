package com.happy;

/**
 * 第70题 爬楼梯
 * 假设你正在爬楼梯，需要 n阶你才能到达楼顶。每次你可以爬 1或 2个台阶。
 * 你有多少种不同的方法可以爬到楼顶呢？ n是一个正整数
 *
 * @author qgl
 * @date 2019/06/17
 */
public class ClimbingStairs70 {
    /**
     * 解法一：斐波那契数列
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int result = 0;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    /**
     * 解法二：动态规划
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        if (n < 3) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
           dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
