package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第94题 二叉树的中序遍历
 *
 * @author qgl
 * @date 2019/06/24
 */
public class Test94 {
    @Test
    public void test94() {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left1 = new TreeNode(3);
        root.right = right;
        right.left = left1;

        InorderTraversalTree94 traversalTree94 = new InorderTraversalTree94();
        System.out.println("中序遍历的结果：" + traversalTree94.inorderTraversal(root));
    }
}
