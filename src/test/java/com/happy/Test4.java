package com.happy;

import org.junit.Test;

/**
 * 第4题 寻找两个有序数组的中位数（hard）
 *
 * @author qgl
 * @date 2019/04/28
 */
public class Test4 {
    @Test
    public void test4() {
        FindMedianSortedArrays4 find = new FindMedianSortedArrays4();
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        System.out.println("两个有序数组的中位数是：" + find.findMedianSortedArrays(nums1, nums2));
    }

}
