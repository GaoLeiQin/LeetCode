package com.happy;

import com.happy.Common.TreeNode;

/**
 * 第114题 二叉树展开为链表
 * 给定一个二叉树，原地将它展开为链表。
 *
 * @author qgl
 * @date 2019/07/01
 */
public class TreeToLinkedList114 {
    /**
     * 二叉树的转换(二叉树的前序遍历)
     *
     * @param root
     */
    TreeNode pre = null;
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        root.left = null;
        pre = root;
    }
}
