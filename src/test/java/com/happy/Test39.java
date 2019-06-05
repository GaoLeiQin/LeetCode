package com.happy;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第39题 组合总和
 *
 * @author qgl
 * @date 2019/06/05
 */
public class Test39 {
    @Test
    public void test39() {
        CombinationSum39 combinationSum39 = new CombinationSum39();
        int[] arr = {2, 3, 5};
        int target = 8;
        System.out.println("所有的组合：" + combinationSum39.combinationSum(arr, target));
    }

}
