package com.happy;

import org.junit.Test;

/**
 * 第15题 三数之和
 *
 * @author qgl
 * @date 2019/05/15
 */
public class Test15 {
    @Test
    public void test15() {
        ThreeSum15 threeSum15 = new ThreeSum15();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println("解法一：所有满足条件且不重复的三元组 " + threeSum15.threeSum(arr));
        System.out.println("解法二：所有满足条件且不重复的三元组 " + threeSum15.threeSum2(arr));
    }

}
