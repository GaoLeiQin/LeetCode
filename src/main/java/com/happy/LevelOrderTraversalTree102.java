package com.happy;

import com.happy.Common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 第102题 二叉树的层次遍历
 * 给定一个二叉树，返回其按层次遍历的节点值。（即逐层地，从左到右访问所有节点）。
 *
 * @author qgl
 * @date 2019/06/28
 */
public class LevelOrderTraversalTree102 {
    /**
     * 解法一：递归
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }

        levelOrderHelper(root, 0, levels);
        return levels;
    }

    private void levelOrderHelper(TreeNode root, int depth, List<List<Integer>> levels) {
        if (root == null) {
            return;
        }
        if (depth == levels.size()) {
            levels.add(new ArrayList<Integer>());
        }
        levels.get(depth).add(root.val);

        if (root.left != null) {
            levelOrderHelper(root.left, depth + 1, levels);
        }
        if (root.right != null) {
            levelOrderHelper(root.right, depth + 1, levels);
        }
    }

    /**
     * 解法二：迭代
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; ++i) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            levels.add(list);
        }
        return levels;
    }
}
