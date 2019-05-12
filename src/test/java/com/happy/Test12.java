package com.happy;

import org.junit.Test;

/**
 * 第12题 整数转罗马数字
 *
 * @author qgl
 * @date 2019/05/12
 */
public class Test12 {
    @Test
    public void test12() {
        IntegerToRoman12 integerToRoman12 = new IntegerToRoman12();
        int number = 58;
        System.out.println("将 " + number + " 转换为罗马数字是 " + integerToRoman12.intToRoman(number));
    }

}
