package com.happy;

import org.junit.Test;

/**
 * 第42题 接雨水
 *
 * @author qgl
 * @date 2019/06/06
 */
public class Test42 {
    @Test
    public void test42() {
        TrappingRainWater42 trappingRainWater42 = new TrappingRainWater42();
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("雨水容量：" + trappingRainWater42.trap(arr));
    }

}
