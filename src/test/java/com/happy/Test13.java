package com.happy;

import org.junit.Test;

/**
 * 第13题 罗马数字转整数
 *
 * @author qgl
 * @date 2019/05/13
 */
public class Test13 {
    @Test
    public void test13() {
        RomanToInteger13 romanToInteger13 = new RomanToInteger13();
        String roman = "MCMXCIV";
        System.out.println("将罗马数字 " + roman + " 转换为整数是 " + romanToInteger13.romanToInt(roman));
    }

}
