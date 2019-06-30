package com.happy;

import com.happy.Common.TreeNode;

/**
 * 第106题 从中序与后序遍历序列构造二叉树
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 *
 * @author qgl
 * @date 2019/07/01
 */
public class ConstructTreeByInPostTraversal106 {
    /**
     * 递归（传入子数组的边界索引）
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0 ||
                postorder == null || postorder.length == 0) return null;
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int inL, int inR, int[] postorder, int postL, int postR) {
        if (inL > inR || postL > postR) {
            return null;
        }

        int rootValue = postorder[postR];
        int index = 0;
        while (index <= inR && inorder[index] != rootValue) {
            index++;
        }

        TreeNode root = new TreeNode(rootValue);
        // 参数计算依据：两边区间长度相等
        root.left = helper(inorder, inL, index - 1, postorder, postL, postL - inL + index - 1);
        root.right = helper(inorder, index + 1, inR, postorder, postL - inL + index, postR - 1);
        return root;
    }
}
