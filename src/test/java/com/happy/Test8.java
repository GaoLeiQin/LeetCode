package com.happy;

import org.junit.Test;

/**
 * 第8题 字符串转换成整数
 *
 * @author qgl
 * @date 2019/05/07
 */
public class Test8 {
    @Test
    public void test8() {
        StringToInteger8 stringToInteger8 = new StringToInteger8();
        String str = " 94345345245";
        String str2 = " -2147483648";
        System.out.println("字符串转换成整数：" + stringToInteger8.myAutomatic(str));
    }

}
