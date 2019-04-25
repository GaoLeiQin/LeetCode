package com.happy;

import org.junit.Test;

import java.util.Arrays;

/**
 * 第1题
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 *
 * @author qgl
 * @date 2019/04/25
 */
public class Test1 {
    @Test
    public void test1() {
        TwoNumber1 twoNumber1 = new TwoNumber1();
        int[] num = {3, 7, 6, 8, 5};
        int target = 15;
        System.out.println("解法一：两次for循环 " + Arrays.toString(twoNumber1.twoSum1(num, target)));
        System.out.println("解法二：两遍哈希表 " + Arrays.toString(twoNumber1.twoSum2(num, target)));
        System.out.println("解法三：一遍哈希表 " + Arrays.toString(twoNumber1.twoSum3(num, target)));
    }
}
