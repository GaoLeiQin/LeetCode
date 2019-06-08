package com.happy;

import org.junit.Test;

/**
 * 第46题 全排列
 *
 * @author qgl
 * @date 2019/06/08
 */
public class Test46 {
    @Test
    public void test46() {
        Permutations46 permutations46 = new Permutations46();
        int[] arr = {1, 2, 3};
        System.out.println("全排列：" + permutations46.permute(arr));
    }

}
