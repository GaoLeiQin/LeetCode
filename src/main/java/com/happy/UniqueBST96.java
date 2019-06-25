package com.happy;

/**
 * 第96题 不同的二叉搜索树
 * 给定一个整数 n，求以 1 ... n为节点组成的二叉搜索树有多少种？
 *
 * @author qgl
 * @date 2019/06/25
 */
public class UniqueBST96 {
    /**
     * 动态规划
     * 卡特兰数公式：G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        if (n < 1) {
            return 0;
        }

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < n + 1; i++)
            for(int j = 1; j < i + 1; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        return dp[n];
    }
}
