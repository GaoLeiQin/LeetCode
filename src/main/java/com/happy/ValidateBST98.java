package com.happy;

import com.happy.Common.TreeNode;

import java.util.Stack;

/**
 * 第98题 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * @author qgl
 * @date 2019/06/26
 */
public class ValidateBST98 {

    /**
     * 解法一：递归，全局变量（节点）
     *
     * @param root
     * @return
     */
    private TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (pre != null && pre.val >= root.val) {
            return false;
        }
        pre = root;
        return isValidBST(root.right);
    }

    /**
     * 解法一：递归，全局变量（值）
     *
     * @param root
     * @return
     */
    long tmp = Long.MIN_VALUE;
    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST2(root.left)) {
            return false;
        }
        if (tmp < root.val) {
            tmp = root.val;
            return isValidBST2(root.right);
        }
        return false;
    }

    /**
     * 解法三：非递归（迭代）
     *
     * @param root
     * @return
     */
    public boolean isValidBST3(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && pre.val >= root.val) {
                return false;
            }
            pre = root;
            root = root.right;
        }
        return true;
    }
}
