package com.happy;

import org.junit.Test;

/**
 * 第26题 删除排序数组中的重复项
 *
 * @author qgl
 * @date 2019/05/26
 */
public class Test26 {
    @Test
    public void test26() {
        RemoveDuplicatesFromSortedArray26 removeDuplicates26 = new RemoveDuplicatesFromSortedArray26();
        int[] arr = {1, 4, 6, 7, 7, 7, 9, 9};
        System.out.println("删除排序数组中的重复项后数组的长度： " + removeDuplicates26.removeDuplicates(arr));
    }

}
