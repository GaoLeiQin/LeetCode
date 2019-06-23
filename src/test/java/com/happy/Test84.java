package com.happy;

import org.junit.Test;

/**
 * 第84题 柱状图中最大的矩形
 *
 * @author qgl
 * @date 2019/06/23
 */
public class Test84 {
    @Test
    public void test84() {
        LargestRectangleInHistogram84 histogram84 = new LargestRectangleInHistogram84();
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println("解法一，柱状图中矩形的最大面积：" + histogram84.largestRectangleArea(arr));
        System.out.println("解法二，柱状图中矩形的最大面积：" + histogram84.largestRectangleArea2(arr));
    }

}
