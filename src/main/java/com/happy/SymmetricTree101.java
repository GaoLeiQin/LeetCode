package com.happy;

import com.happy.Common.TreeNode;

import java.util.Stack;

/**
 * 第101题 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * @author qgl
 * @date 2019/06/27
 */
public class SymmetricTree101 {
    /**
     * 解法一：递归
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        return leftNode.val == rightNode.val && isMirror(leftNode.left, rightNode.right)
                && isMirror(leftNode.right, rightNode.left);
    }

    /**
     * 解法二：迭代
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public boolean isSymmetric2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t1 = stack.pop();
            TreeNode t2 = stack.pop();
            if (t1 == null && t2 == null) {
                continue;
            }
            if (t1 == null || t2 == null) {
                return false;
            }
            if (t1.val != t2.val) {
                return false;
            }
            stack.push(t1.left);
            stack.push(t2.right);
            stack.push(t1.right);
            stack.push(t2.left);
        }
        return true;
    }
}
