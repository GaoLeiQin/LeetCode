package com.happy;

import org.junit.Test;

/**
 * 第72题 编辑距离
 *
 * @author qgl
 * @date 2019/06/18
 */
public class Test72 {
    @Test
    public void test72() {
        EditDistance72 editDistance72 = new EditDistance72();
        String word1 = "horse";
        String word2 = "ros";
        System.out.println("转换的最少操作数 ：" + editDistance72.minDistance(word1, word2));
    }

}
