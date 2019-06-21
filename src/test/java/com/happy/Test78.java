package com.happy;

import org.junit.Test;

/**
 * 第78题 子集
 *
 * @author qgl
 * @date 2019/06/21
 */
public class Test78 {
    @Test
    public void test78() {
        SubSets78 subSets78 = new SubSets78();
        int[] arr = {1, 2, 3};
        System.out.println("所有可能的子集：" + subSets78.subsets(arr));
    }

}
