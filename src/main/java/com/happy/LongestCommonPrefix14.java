package com.happy;

/**
 * 第14题 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串""。
 *
 * @author qgl
 * @date 2019/05/14
 */
public class LongestCommonPrefix14 {
    /**
     * 解法一：水平扫描法
     * 时间复杂度：O(S)，空间复杂度：O(1)
     * 其中S指所有字符串中字符数量的总和。
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char curr = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != curr) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    /**
     * 解法二：二分查找
     * 时间复杂度：O(S⋅log(n))，空间复杂度：O(1)
     * 假设数组中有n个长度为 m的相同字符串，其中 S指所有字符串中字符数量的总和。
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    /**
     * 判断是否是公共前缀
     *
     * @param strs
     * @param len
     * @return
     */
    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false;
            }
        }
        return true;
    }
}
