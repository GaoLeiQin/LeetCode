package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第106题 从中序与后序遍历序列构造二叉树
 *
 * @author qgl
 * @date 2019/07/01
 */
public class Test106 {
    @Test
    public void test106() {
        ConstructTreeByInPostTraversal106 builderTree106 = new ConstructTreeByInPostTraversal106();
        int[] inOder = {9, 3, 15, 20, 7};
        int[] postOrder = {9, 15, 7, 20, 3};
        TreeNode root = builderTree106.buildTree(inOder, postOrder);
        System.out.println("层序遍历二叉树：" + new LevelOrderTraversalTree102().levelOrder(root));
    }
}
