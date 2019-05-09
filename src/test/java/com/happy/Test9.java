package com.happy;

import org.junit.Test;

/**
 * 第9题 回文数
 *
 * @author qgl
 * @date 2019/05/08
 */
public class Test9 {
    @Test
    public void test9() {
        PalindromeNumber9 palindromeNumber9 = new PalindromeNumber9();
        int number = 120;
        System.out.println("解法一：是否是回文数：" + palindromeNumber9.isPalindrome(number));
        System.out.println("解法二：是否是回文数：" + palindromeNumber9.isPalindrome2(number));
    }

}
