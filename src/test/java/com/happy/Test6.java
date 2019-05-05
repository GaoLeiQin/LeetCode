package com.happy;

import org.junit.Test;

/**
 * 第6题 Z字形变换
 *
 * @author qgl
 * @date 2019/05/05
 */
public class Test6 {
    @Test
    public void test6() {
        ZigZagConversion6 zagConversion6 = new ZigZagConversion6();
        String str = "LEETCODEISHIRING";
        int numRows = 3;
        System.out.println("Z字形变换的结果：" + zagConversion6.convert(str, numRows));
    }

}
