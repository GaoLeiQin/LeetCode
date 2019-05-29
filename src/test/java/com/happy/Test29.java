package com.happy;

import org.junit.Test;

/**
 * 第29题 两数相除
 *
 * @author qgl
 * @date 2019/05/29
 */
public class Test29 {
    @Test
    public void test29() {
        DivideTwoIntegers29 divideTwoIntegers29 = new DivideTwoIntegers29();
        int dividend = 100;
        int divisor = 3;
        System.out.println("解法一：两数相除的结果：" + divideTwoIntegers29.divide(dividend, divisor));
        System.out.println("解法二：两数相除的结果：" + divideTwoIntegers29.divide2(dividend, divisor));
    }

}
