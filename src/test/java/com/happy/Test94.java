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
        TreeNode root = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        root.right = right;
        root.left = left;

        InorderTraversalTree94 traversalTree94 = new InorderTraversalTree94();
        System.out.println("中序遍历的结果：" + traversalTree94.inorderTraversal(root));
    }
}
