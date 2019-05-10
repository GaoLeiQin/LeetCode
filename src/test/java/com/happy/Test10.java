package com.happy;

import org.junit.Test;

/**
 * 第10题 正则表达式匹配
 *
 * @author qgl
 * @date 2019/05/10
 */
public class Test10 {
    @Test
    public void test10() {
        RegularExpressionMatching10 regularMatching10 = new RegularExpressionMatching10();
        String str = "a";
        String pattern = "a*";
        System.out.println("解法一：是否匹配：" + regularMatching10.isMatch(str, pattern));
        System.out.println("解法二：是否匹配：" + regularMatching10.isMatch2(str, pattern));
        System.out.println("解法三：是否匹配：" + regularMatching10.isMatch3(str, pattern));
    }

}
