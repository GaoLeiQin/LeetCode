package com.happy;

/**
 * 第28题 实现strStr()
 * 给定一个 haystack字符串和一个 needle字符串，在 haystack字符串中找出 needle字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回-1。若needle是空字符串则返回0
 *
 * @author qgl
 * @date 2019/05/28
 */
public class ImplementStr28 {
    /**
     * 解法一：暴力算法
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        if (m == 0 & n == 0) {
            return 0;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 解法二：KMP算法
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr2(String haystack, String needle) {
        char[] hayArr = haystack.toCharArray();
        char[] needArr = needle.toCharArray();
        int i = 0;
        int j = 0;
        while (i < hayArr.length && j < needArr.length) {
            if (hayArr[i] == needArr[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == needArr.length) {
            return i - j;
        }
        return -1;
    }
}
