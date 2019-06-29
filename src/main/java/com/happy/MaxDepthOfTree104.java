package com.happy;

import com.happy.Common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 第104题 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 *
 * @author qgl
 * @date 2019/06/29
 */
public class MaxDepthOfTree104 {
    /**
     * 解法一：递归
     * 时间复杂度：O(n)，空间复杂度：O(log n)
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    /**
     * 解法二：迭代（BFS）
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return depth;
    }

    /**
     * 解法三：迭代（DFS）
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public int maxDepth3(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> value = new Stack<>();
        value.push(1);
        int depth = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int temp = value.pop();
            depth = Math.max(temp, depth);
            if (node.left != null) {
                stack.push(node.left);
                value.push(temp + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                value.push(temp + 1);
            }
        }
        return depth;
    }
}
