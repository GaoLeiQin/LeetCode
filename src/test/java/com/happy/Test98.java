package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第98题 验证二叉搜索树
 *
 * @author qgl
 * @date 2019/06/26
 */
public class Test98 {
    @Test
    public void test98() {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        ValidateBST98 validateBST98 = new ValidateBST98();
        System.out.println("是否是一个有效的二叉搜索树：" + validateBST98.isValidBST(root));
    }
}
