package com.happy;

import org.junit.Test;

/**
 * 第64题 最小路径和
 *
 * @author qgl
 * @date 2019/06/16
 */
public class Test64 {
    @Test
    public void test64() {
        MinimumPathSum64 minimumPathSum64 = new MinimumPathSum64();
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println("最小路径和：" + minimumPathSum64.minPathSum(grid));
    }

}
