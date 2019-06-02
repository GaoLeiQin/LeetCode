package com.happy;

import org.junit.Test;

/**
 * 第32题 最长有效括号
 *
 * @author qgl
 * @date 2019/06/02
 */
public class Test32 {
    @Test
    public void test32() {
        LongestValidParentheses32 validParentheses32 = new LongestValidParentheses32();
        String str = "(()))))())";

        System.out.println("解法一，最长有效括号的长度：" + validParentheses32.longestValidParentheses(str));
        System.out.println("解法二，最长有效括号的长度：" + validParentheses32.longestValidParentheses2(str));
        System.out.println("解法三，最长有效括号的长度：" + validParentheses32.longestValidParentheses3(str));
    }

}
