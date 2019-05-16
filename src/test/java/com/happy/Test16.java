package com.happy;

import org.junit.Test;

/**
 * 第16题 最接近的三数之和
 *
 * @author qgl
 * @date 2019/05/15
 */
public class Test16 {
    @Test
    public void test16() {
        ThreeSumClosest16 threeSumClosest16 = new ThreeSumClosest16();
        int[] arr = {-1, 2, 1, -4};
        int target = 1;
        System.out.println("解法一：最接近的三数之和 " + threeSumClosest16.threeSumClosest(arr, target));
    }

}
