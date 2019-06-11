package com.happy;

import org.junit.Test;

/**
 * 第53题 最大子序和
 *
 * @author qgl
 * @date 2019/06/11
 */
public class Test53 {
    @Test
    public void test53() {
        MaximumSubArray53 maximumSubArray53 = new MaximumSubArray53();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("最大子序和：" + maximumSubArray53.maxSubArray(arr));
    }

}
