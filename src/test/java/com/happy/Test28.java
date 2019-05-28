package com.happy;

import org.junit.Test;

/**
 * 第28题 实现strStr()
 *
 * @author qgl
 * @date 2019/05/28
 */
public class Test28 {
    @Test
    public void test28() {
        ImplementStr28 implementStr28 = new ImplementStr28();
        String haystack = "hello";
        String needle = "ll";
        System.out.println("解法一：needle字符串出现的第一个位置：" + implementStr28.strStr(haystack, needle));
        System.out.println("解法二：needle字符串出现的第一个位置：" + implementStr28.strStr2(haystack, needle));
    }

}
