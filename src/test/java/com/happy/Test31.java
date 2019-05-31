package com.happy;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第31题 下一个排列
 *
 * @author qgl
 * @date 2019/05/31
 */
public class Test31 {
    @Test
    public void test31() {
        NextPermutation31 nextPermutation31 = new NextPermutation31();
        int[] arr = {1, 5, 8, 4, 7, 6, 5, 3, 1};

        nextPermutation31.nextPermutation(arr);
        System.out.println("下一个排列：" + Arrays.toString(arr));
    }

}
