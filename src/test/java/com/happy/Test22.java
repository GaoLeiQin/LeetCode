package com.happy;

import org.junit.Test;

/**
 * 第22题 括号生成
 *
 * @author qgl
 * @date 2019/05/22
 */
public class Test22 {
    @Test
    public void test22() {
        GenerateParentheses22 generateParentheses22 = new GenerateParentheses22();
        int n = 3;
        System.out.println("可生成的括号有：" + generateParentheses22.generateParenthesis(n));
    }

}
