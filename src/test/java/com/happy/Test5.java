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
        String str = "cabad";
        System.out.println("解法一：暴力法，最长回文子串是：" + palindrome5.longestPalindrome1(str));
        System.out.println("解法二：中心扩展法，最长回文子串是：" + palindrome5.longestPalindrome2(str));
    }

}
