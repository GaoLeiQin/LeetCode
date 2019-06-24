package com.happy;

import com.happy.Common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 第94题 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序遍历。
 *
 * @author qgl
 * @date 2019/06/24
 */
public class InorderTraversalTree94 {
    /**
     * 解法一：递归
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        this.inorder(root, list);
        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return ;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    /**
     * 解法二：非递归（借用栈）
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
