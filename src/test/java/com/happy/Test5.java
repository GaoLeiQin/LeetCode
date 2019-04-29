package com.happy;

import org.junit.Test;

/**
 * 第5题 最长回文子串
 *
 * @author qgl
 * @date 2019/04/29
 */
public class Test5 {
    @Test
    public void test5() {
        LongestPalindrome5 palindrome5 = new LongestPalindrome5();
        String str = "babad";
        System.out.println("最长回文子串是：" + palindrome5.longestPalindrome(str));
    }

}
