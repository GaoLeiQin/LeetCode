package com.happy;

import org.junit.Test;

/**
 * 第56题 合并区间
 *
 * @author qgl
 * @date 2019/06/13
 */
public class Test56 {
    @Test
    public void test56() {
        MergeIntervals56 mergeIntervals56 = new MergeIntervals56();
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println("合并所有重叠区间后的结果：" + Common.printTwoMatrix(mergeIntervals56.merge(arr)));
    }

}
