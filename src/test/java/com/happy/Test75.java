package com.happy;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第75题 颜色分类
 *
 * @author qgl
 * @date 2019/06/19
 */
public class Test75 {
    @Test
    public void test75() {
        SortColors75 sortColors75 = new SortColors75();
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors75.sortColors(arr);
        System.out.println("对颜色分类排序后的数据：" + Arrays.toString(arr));
    }

}
