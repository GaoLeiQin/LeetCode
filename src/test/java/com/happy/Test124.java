package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第124题 二叉树中的最大路径和（hard）
 *
 * @author qgl
 * @date 2019/07/09
 */
public class Test124 {
    @Test
    public void test124() {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left = new TreeNode(3);
        root.right = right;
        root.left = left;

        MaxPathSumTree124 maxPathSumTree124 = new MaxPathSumTree124();
        System.out.println("二叉树中的最大路径和：" + maxPathSumTree124.maxPathSum(root));
    }
}
