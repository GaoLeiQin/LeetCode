package com.happy;

import org.junit.Test;

/**
 * 第11题 盛最多水的容器
 *
 * @author qgl
 * @date 2019/05/11
 */
public class Test11 {
    @Test
    public void test11() {
        ContainerWithMostWater11 containerWithMostWater11 = new ContainerWithMostWater11();
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("解法一：容纳最多的水：" + containerWithMostWater11.maxArea(arr));
        System.out.println("解法二：容纳最多的水：" + containerWithMostWater11.maxArea2(arr));
        System.out.println("解法三：容纳最多的水：" + containerWithMostWater11.maxArea3(arr));
    }

}
