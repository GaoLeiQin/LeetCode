package com.happy;

import org.junit.Test;

/**
 * 第7题 整数反转
 *
 * @author qgl
 * @date 2019/05/06
 */
public class Test7 {
    @Test
    public void test7() {
        ReverseInteger7 reverseInteger7 = new ReverseInteger7();
        int number = 1646324;
        int number2 = -123;
        int number3 = 120;
        System.out.println("解法一：整数反转的结果：" + reverseInteger7.reverse(number));
        System.out.println("解法二：整数反转的结果：" + reverseInteger7.reverse2(number));
    }

}
