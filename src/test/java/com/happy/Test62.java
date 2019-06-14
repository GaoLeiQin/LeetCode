package com.happy;

import org.junit.Test;

/**
 * 第62题 不同路径
 *
 * @author qgl
 * @date 2019/06/14
 */
public class Test62 {
    @Test
    public void test62() {
        UniquePaths62 uniquePaths62 = new UniquePaths62();
        int m = 7;
        int n = 3;
        System.out.println("一共有多少条不同的路径：" + uniquePaths62.uniquePaths(m, n));
    }

}
