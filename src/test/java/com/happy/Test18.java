package com.happy;

import org.junit.Test;

/**
 * 第18题 四数之和
 *
 * @author qgl
 * @date 2019/05/18
 */
public class Test18 {
    @Test
    public void test18() {
        FourNumber18 fourNumber18 = new FourNumber18();
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println("所有满足条件且不重复的四元组 " + fourNumber18.fourSum(arr, target));
    }

}
