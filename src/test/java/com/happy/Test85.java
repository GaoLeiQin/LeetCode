package com.happy;

import org.junit.Test;

/**
 * 第85题 最大矩形（hard）
 *
 * @author qgl
 * @date 2019/06/23
 */
public class Test85 {
    @Test
    public void test85() {
        MaximalRectangle85 maximalRectangle85 = new MaximalRectangle85();
        char[][] chars = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '0', '1', '0'}};
        System.out.println("最大矩形的面积：" + maximalRectangle85.maximalRectangle(chars));
    }

}
