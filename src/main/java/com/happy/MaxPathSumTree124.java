package com.happy;

import com.happy.Common.TreeNode;

/**
 * 第124题 二叉树中的最大路径和（hard）
 * 给定一个非空二叉树，返回其最大路径和。
 * 路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 *
 * @author qgl
 * @date 2019/07/09
 */
public class MaxPathSumTree124 {
    /**
     * 递归
     * 时间复杂度：O(n)，空间复杂度：O(log n)
     *
     * @param root
     * @return
     */
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);
        int priceNewPath = node.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, priceNewPath);

        return node.val + Math.max(leftGain, rightGain);
    }
}
