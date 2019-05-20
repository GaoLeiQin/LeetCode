package com.happy;

import org.junit.Test;

/**
 * 第20题 有效的括号
 *
 * @author qgl
 * @date 2019/05/20
 */
public class Test20 {
    @Test
    public void test20() {
        ValidParentheses20 validParentheses20 = new ValidParentheses20();
        String str = "()[]{}";
        String str2 = "([)]";
        System.out.println("是否是有效的括号 " + validParentheses20.isValid(str));
    }

}
