package com.happy;

import org.junit.Test;

/**
 * 第96题 不同的二叉搜索树
 *
 * @author qgl
 * @date 2019/06/24
 */
public class Test96 {
    @Test
    public void test96() {
        UniqueBST96 uniqueBST96 = new UniqueBST96();
        int n = 3;
        System.out.println("二叉搜索树有多少种：" + uniqueBST96.numTrees(n));
    }
}
