package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第104题 二叉树的最大深度
 *
 * @author qgl
 * @date 2019/06/29
 */
public class Test104 {
    @Test
    public void test104() {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left = new TreeNode(3);
        root.right = right;
        root.left = left;

        MaxDepthOfTree104 depthOfTree104 = new MaxDepthOfTree104();
        System.out.println("二叉树的最大深度：" + depthOfTree104.maxDepth(root));
    }
}
