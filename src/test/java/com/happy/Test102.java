package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第102题 二叉树的层次遍历
 *
 * @author qgl
 * @date 2019/06/28
 */
public class Test102 {
    @Test
    public void test102() {
        TreeNode root = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        root.right = right;
        root.left = left;

        LevelOrderTraversalTree102 traversalTree102 = new LevelOrderTraversalTree102();
        System.out.println("二叉树的层次遍历结果：" + traversalTree102.levelOrder(root));
    }
}
