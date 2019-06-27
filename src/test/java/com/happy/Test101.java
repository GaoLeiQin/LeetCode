package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第101题 对称二叉树
 *
 * @author qgl
 * @date 2019/06/27
 */
public class Test101 {
    @Test
    public void test101() {
        TreeNode root = new TreeNode(2);
        TreeNode right = new TreeNode(1);
        TreeNode left = new TreeNode(1);
        root.right = right;
        root.left = left;

        SymmetricTree101 symmetricTree101 = new SymmetricTree101();
        System.out.println("是否是对称(镜像)二叉树：" + symmetricTree101.isSymmetric2(root));
    }
}
