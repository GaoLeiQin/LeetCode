package com.happy;

import org.junit.Test;

/**
 * 第3题 无重复字符的最长子串
 *
 * @author qgl
 * @date 2019/04/27
 */
public class Test3 {
    @Test
    public void test3() {
        LongestSubstring3 longestSubstring3 = new LongestSubstring3();
        String s = "abcbbdef";
        System.out.println("解法一：滑动窗口，无重复字符的最长子串长度：" + longestSubstring3.lengthOfLongestSubstring1(s));
        System.out.println("解法二：优化后的滑动窗口，无重复字符的最长子串长度：" + longestSubstring3.lengthOfLongestSubstring2(s));
    }

}
