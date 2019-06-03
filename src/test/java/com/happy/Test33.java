package com.happy;

import org.junit.Test;

/**
 * 第33题 搜索旋转排序数组
 *
 * @author qgl
 * @date 2019/06/03
 */
public class Test33 {
    @Test
    public void test33() {
        SearchInRotatedSortedArray33 sortedArray33 = new SearchInRotatedSortedArray33();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("目标值在旋转排序数组中的下标是：" + sortedArray33.search(arr, target));
    }

}
