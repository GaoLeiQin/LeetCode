package com.happy;

import com.happy.Common.TreeNode;
import org.junit.Test;

/**
 * 第105题 由前序与中序遍历序列构造二叉树
 *
 * @author qgl
 * @date 2019/06/30
 */
public class Test105 {
    @Test
    public void test105() {
        ConstructTreeByPreInTraversal105 builderTree105 = new ConstructTreeByPreInTraversal105();
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOder = {9, 3, 15, 20, 7};
        TreeNode root = builderTree105.buildTree(preOrder, inOder);
        System.out.println("二叉树的最大深度：" + new LevelOrderTraversalTree102().levelOrder(root));
    }
}
