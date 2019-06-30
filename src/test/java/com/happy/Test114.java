package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第114题 二叉树展开为链表
 *
 * @author qgl
 * @date 2019/07/01
 */
public class Test114 {
    @Test
    public void test114() {
        TreeToLinkedList114 treeToLinkedList114 = new TreeToLinkedList114();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode left2 = new TreeNode(6);
        TreeNode right2 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node1.left = left1;
        node1.right = right1;
        node2.left = left2;
        node2.right = right2;

        treeToLinkedList114.flatten(root);
        System.out.println("层序遍历二叉树：" + new LevelOrderTraversalTree102().levelOrder(root));
    }
}
