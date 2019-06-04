package com.happy;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第34题 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author qgl
 * @date 2019/06/04
 */
public class Test34 {
    @Test
    public void test34() {
        FindElementInSortedArray34 findElementInSortedArray34 = new FindElementInSortedArray34();
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("在排序数组中查找元素的第一个和最后一个位置：" + Arrays.toString(findElementInSortedArray34.searchRange(arr, target)));
    }

}
