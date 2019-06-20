package com.happy;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第76题 最小覆盖子串（hard）
 *
 * @author qgl
 * @date 2019/06/20
 */
public class Test76 {
    @Test
    public void test76() {
        MinimumWindowSubstring76 minimumWindowSubstring76 = new MinimumWindowSubstring76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("最小覆盖子串：" + minimumWindowSubstring76.minWindow(s, t));
    }

}
