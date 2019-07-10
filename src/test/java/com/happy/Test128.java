package com.happy;

import org.junit.Test;

/**
 * 第128题 最长连续序列（hard）
 *
 * @author qgl
 * @date 2019/07/10
 */
public class Test128 {
    @Test
    public void test128() {
        LongestConsecutiveSequence128 longestConsecutiveSequence128 = new LongestConsecutiveSequence128();
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("最长连续序列的长度：" + longestConsecutiveSequence128.longestConsecutive(arr));
    }
}
