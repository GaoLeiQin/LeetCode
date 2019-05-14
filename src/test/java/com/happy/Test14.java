package com.happy;

import org.junit.Test;

/**
 * 第14题 最长公共前缀
 *
 * @author qgl
 * @date 2019/05/14
 */
public class Test14 {
    @Test
    public void test14() {
        LongestCommonPrefix14 longestCommonPrefix14 = new LongestCommonPrefix14();
        String[] strArray = {"flower","flow","flight"};
        String[] strArray2 = {"aca","cba"};
        System.out.println("解法一：最长公共前缀 " + longestCommonPrefix14.longestCommonPrefix(strArray));
        System.out.println("解法二：最长公共前缀 " + longestCommonPrefix14.longestCommonPrefix(strArray));
    }

}
