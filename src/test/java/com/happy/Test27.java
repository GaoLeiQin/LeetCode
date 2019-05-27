package com.happy;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第27题 移除元素
 *
 * @author qgl
 * @date 2019/05/27
 */
public class Test27 {
    @Test
    public void test27() {
        RemoveElement27 removeElement27 = new RemoveElement27();
        int[] arr = {3, 2, 2, 3};
        int[] arr2 = {1, 5, 8, 6, 5, 9};
        int val = 3;
        System.out.println("不含目标元素的数组的长度： " + removeElement27.removeElement(arr, val));
    }

}
